package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes;

import java.util.Scanner;

public class maxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int[] arr = new int[range];
		for (int i = 0; i < range; i++)
			arr[i] = sc.nextInt();
		int ans = maxsub(arr);
		System.out.println(ans);

	}

	private static int maxsub(int[] arr) {
		// TODO Auto-generated method stub
		int maxall = arr[0];
		int maxcurr = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxcurr = Math.max(arr[i], arr[i] + maxcurr);
			maxall = Math.max(maxcurr, maxall);
		}
		return maxall;
	}

}
