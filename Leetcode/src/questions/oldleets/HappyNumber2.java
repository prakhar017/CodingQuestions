package leetcode.april.competition.leetcodes.codes.leetcode.april.competition.leetcodes.codes.questions;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = issingle(n);
		System.out.println(ans);

	}

	private static boolean issingle(int n) {
		// TODO Auto-generated method stub
		int r, s = 0;
		HashSet<Integer> set = new HashSet();
		while (n > 0) {

			r = n % 10;
			s = s + r * r;
			n = n / 10;

			if (n == 0 && s == 1)
				return true;

			if (n == 0 && s != 1) {

				if (!set.add(s))
					break;
				n = s;
				s = 0;
			}

		}
		return false;

	}

}
