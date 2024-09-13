package com.systex.main;

import java.util.HashSet;
import java.util.Set;

public class Lotter {

	public static void main(String[] args) {
		int count = Integer.parseInt(args[0]);
		String excludeNumString = args[1];

		System.out.println("排除以下數字：" + excludeNumString);

		System.out.println("以下為您的樂透選號結果");

		Set<Integer> excludeNuberSet = parseExcludeNum(excludeNumString);

		for (int i = 0; i < count; i++) {
			Set<Integer> lottery = generateLotterNum(excludeNuberSet);
			System.out.println("第" + (i + 1) + "組" + lottery);

		}

	}

	private static Set<Integer> generateLotterNum(Set<Integer> excludeNuberSet) {
		Set<Integer> lottery = new HashSet<>();

		while (lottery.size() < 6) {
			int luckNumber = (int) (Math.random() * 49 + 1);
			if (!excludeNuberSet.contains(luckNumber)) {
				lottery.add(luckNumber);
			}
		}
		return lottery;
	}

	private static Set<Integer> parseExcludeNum(String excludeNumString) {
		Set<Integer> excludeNuberSet = new HashSet<>();
		String[] numberStrings = excludeNumString.split(" ");

		if (numberStrings.length > 49) {
			throw new IllegalArgumentException("排除數字太多");
		}

		for (String num : numberStrings) {
			excludeNuberSet.add(Integer.parseInt(num.trim()));
		}
		return excludeNuberSet;
	}

}
