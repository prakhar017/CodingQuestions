package leetcode.april.competition.leetcodes.codes.leetcode.april.competition.leetcodes.codes.questions;

import java.util.HashSet;

import java.util.Scanner;

public class RemoveDuplicates26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int inp[] = new int[range];
		for (int i = 0; i < range; i++)
			inp[i] = sc.nextInt();
		int ans = removeDuplicate(inp);
//		int ans1 = removeByHash(inp);
		System.out.println(ans);
//		System.out.println(ans1);
	}

//	private static int removeByHash(int[] inp) {
//		// TODO Auto-generated method stub
//		HashSet<Integer> set = new HashSet();
//		for (int i = 0; i < inp.length; i++)
//			set.add(inp[i]);
//
//		return set.size();
//
//	}

	private static int removeDuplicate(int[] inp) {
		// TODO Auto-generated method stub
		int i = 0;
		for (int j = 1; j < inp.length; j++) {
			if (inp[j] != inp[i]) {
				i++;
				inp[i] = inp[j];
			}
		}

		return i + 1;

	}

}
