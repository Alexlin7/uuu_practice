package com.systex.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.systex.model.Member;

public class MemberDAO {

	public void create(Member member) {		
		try (Connection con = this.getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(" Insert Into member Values (?, ?, ?, ?, ?) ; ");
		) {
			preparedStatement.setInt(1, member.getId());
			preparedStatement.setString(2, member.getFristName());
			preparedStatement.setString(3, member.getLastName());
			preparedStatement.setString(4, member.getStreet());
			preparedStatement.setString(5, member.getCity());
			int count = preparedStatement.executeUpdate();
			if (count != 1) {
				throw new SQLException("資料異動有問題");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Member新增成功");
	}
	
	public void update(Member member) {
		String sql = """
				 	 Update member
				 	 Set FIRSTNAME = ?,
				 	 	 LASTNAME = ?,
				 	 	 STREET = ?,
				 	 	 CITY = ?
				 	 Where ID = ? ;
					 """;
		try (Connection con = this.getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(sql);) {
			preparedStatement.setString(1, member.getFristName());
			preparedStatement.setString(2, member.getLastName());
			preparedStatement.setString(3, member.getStreet());
			preparedStatement.setString(4, member.getCity());
			preparedStatement.setInt(5, member.getId());
			int count = preparedStatement.executeUpdate();
			if (count != 1) {
				throw new SQLException("資料異動有問題");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Member新增成功");
	}
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crmdb", "root", "welcome1");
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return con;
	}

	public Member get(int id) {
		Member member = null;
		ResultSet resultSet = null;
		try (Connection con = this.getConnection();
//				Statement statement = con.createStatement();
				PreparedStatement preparedStatement = con.prepareStatement(" Select * FROM member Where Id = ?; ");
//				ResultSet resultSet = statement.executeQuery()
		) {
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				member = new Member();
				member.setId(resultSet.getInt("ID"));
				member.setFristName(resultSet.getString("FIRSTNAME"));
				member.setLastName(resultSet.getString("LASTNAME"));
				member.setStreet(resultSet.getString("STREET"));
				member.setCity(resultSet.getString("CITY"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return member;
	}

	public List<Member> getAll() {
		LinkedList<Member> allMembers = new LinkedList<>();
		// 建立並註冊驅動程式物件
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 建立連線物件
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crmdb", "root", "welcome1");
			// 建立SQL包裝物
			stmt = con.createStatement();
			// 執行CRUD資料存取邏輯
			rs = stmt.executeQuery(" SELECT * FROM member; ");
			// 處理回傳結果

			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("ID"));
				member.setFristName(rs.getString("FIRSTNAME"));
				member.setLastName(rs.getString("LASTNAME"));
				member.setStreet(rs.getString("STREET"));
				member.setCity(rs.getString("CITY"));
				allMembers.add(member);
			}
			// 關閉所有連線物件
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		return allMembers;
	}

	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		List<Member> allMembers = memberDAO.getAll();
		allMembers.forEach(System.out::println);
		System.out.println("========================");
		System.out.println(memberDAO.get(16));
		System.out.println("==========");
		Member member = new Member(50, "Micheal", "Jordan", "Wall Street Blvd", "New York");
		memberDAO.create(member);
		allMembers = memberDAO.getAll();
		allMembers.forEach(System.out::println);
		
		member = new Member(50, "Micheal", "Jordan", "Wall Street Blvd", "New ");
		memberDAO.update(member);
		allMembers = memberDAO.getAll();
		allMembers.forEach(System.out::println);
		
	}
}
