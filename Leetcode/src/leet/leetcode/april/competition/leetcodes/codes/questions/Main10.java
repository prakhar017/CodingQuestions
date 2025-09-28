package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes;

import java.util.Scanner;

import java.util.Arrays;

class UserMainCode10 {
	static int validateNumber(String[] c, String d) {
		int a = 0;

		Arrays.sort(c);

		for (int i = 0; i < c.length; i++) {
			if (c[i].equals(d)) {
				a = i + 1;
				break;
			}
		}

		return a;

	}
}

public class Main10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.next();
		String b = sc.next();
		int c = UserMainCode10.validateNumber(a, b);

		System.out.println(c);

	}

}
