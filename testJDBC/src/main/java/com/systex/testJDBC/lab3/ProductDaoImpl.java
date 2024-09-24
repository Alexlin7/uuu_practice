package com.systex.testJDBC.lab3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDAO {

	@Autowired
	private ProductRowMapper productRowMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Product getProduct(int id) {
		SqlParameterSource nameParameter = new MapSqlParameterSource("productId", id);

		return (Product) this.namedParameterJdbcTemplate
				.queryForObject(" SELECT * FROM product Where id = :productId; ", nameParameter, this.productRowMapper);
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return (List<Product>) this.jdbcTemplate.query(" SELECT * FROM product; ", this.productRowMapper);
	}

	@Override
	public int insert(Product product) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource parameterSource = new MapSqlParameterSource("name", product.getName()).addValue("desc",
				product.getDescription());
		this.namedParameterJdbcTemplate.update(" Insert Into product(`name`, `desc`) values(:name, :desc) ",
				parameterSource, keyHolder);
		return keyHolder.getKey().intValue();
	}

	@Override
	public void update(Product product) {
		SqlParameterSource parameterSource = new MapSqlParameterSource("id", product.getProductId())
				.addValue("name", product.getName()).addValue("desc", product.getDescription());
		this.namedParameterJdbcTemplate
				.update(" Update product Set product.name=:name, product.desc=:desc Where id =:id ", parameterSource);

	}

}
