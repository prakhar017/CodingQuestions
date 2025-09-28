package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes;

import java.util.Scanner;

public class ClimbingStairs70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = recur(n);
		int ans1 = dp(n);
		System.out.println(ans);
		System.out.println(ans1);

	}

	private static int recur(int n) {
		return climb(0, n);
	}

	private static int climb(int x, int n) {

		if (x > n)
			return 0;
		else if (x == n)
			return 1;
		else
			return climb(x + 1, n) + climb(x + 2, n);

	}

	private static int dp(int n) {

		int[] dp = new int[n];
		dp[0] = 1;
		dp[1] = 2;

		for (int i = 2; i < n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];

		}

		return dp[n - 1];
	}
}
