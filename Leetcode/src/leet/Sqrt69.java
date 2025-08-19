package leetcode.april.competition.leetcodes;

import java.util.Scanner;

public class Sqrt69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = sqrt(n);
		int ans1 = mySqrt(n);
		System.out.println(ans);
		System.out.println(ans1);

	}

	private static int mySqrt(int x) {

		long i = 1;
		long result = 1;
		while (result <= x) {
			i++;
			result = i * i;
		}
		return (int) i - 1;
	}

	private static int sqrt(int n) {

		if (n <= 1)
			return n;
		int lo = 1;
		int hi = n / 2;
		while (lo < hi) {
			int mid = lo + (hi - lo + 1) / 2;
			int t = n / mid;
			if (mid == t)
				return mid;
			else if (mid > t)
				hi = mid - 1;
			else
				lo = mid;

		}

		return lo;
	}

}
