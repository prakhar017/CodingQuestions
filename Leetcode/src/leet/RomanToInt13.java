package leetcode.april.competition.leetcodes;

import java.util.Scanner;

public class RomanToInt13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int ans = roman_to_int(inp);
		System.out.println(ans);

	}

	private static int roman_to_int(String inp) {
		// TODO Auto-generated method stub
		int sum = 0;
		char[] chars = inp.toCharArray();
		for (int i = 0; i < chars.length; i++) {

			switch (chars[i]) {
			case 'I':
				sum += 1;
				break;
			case 'V':
				sum += 5;
				if (i - 1 >= 0 && chars[i - 1] == 'I')
					sum -= 2;
				break;
			case 'X':
				sum += 10;
				if (i - 1 >= 0 && chars[i - 1] == 'I')
					sum -= 2;
				break;
			case 'L':
				sum += 50;
				if (i - 1 >= 0 && chars[i - 1] == 'X')
					sum -= 20;
				break;
			case 'C':
				sum += 100;
				if (i - 1 >= 0 && chars[i - 1] == 'X')
					sum -= 20;
				break;
			case 'D':
				sum += 500;
				if (i - 1 >= 0 && chars[i - 1] == 'C')
					sum -= 200;
				break;
			case 'M':
				sum += 1000;
				if (i - 1 >= 0 && chars[i - 1] == 'C')
					sum -= 200;
				break;
			}

		}
		return sum;
	}

}
