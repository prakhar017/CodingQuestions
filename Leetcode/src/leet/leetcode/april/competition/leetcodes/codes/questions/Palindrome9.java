package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes;

import java.util.Scanner;

public class Palindrome9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		

		boolean ans = palindrome(x);
		boolean ans1 = ispalindrome(x);
		boolean ans2 = ispalindrometry(x);
	

		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);

	}

	private static boolean ispalindrometry(int x) {
		if (x < 0)
			return false;
		else {
			String inp = String.valueOf(x);
			String rev = new StringBuilder().append(Math.abs(x)).reverse().toString();
			return inp.equals(rev)? true:false;
			
		}
	}

	private static boolean ispalindrome(int x) {
		// TODO Auto-generated method stub
		String val = String.valueOf(x);
		int start = 0;
		int end = val.length() - 1;
		while (start < end) {
			if (val.charAt(start++) != val.charAt(end--))
				return false;
		}
		return true;

	}

	private static boolean palindrome(int x) {

		if (x < 0)
			return false;
		else {
			int rem = 0, rev = 0, a = x;
			while (x > 0) {
				rem = x % 10;
				rev = rev * 10 + rem;
				x /= 10;
			}
			return rev == a ? true : false;

		}

	}

}
