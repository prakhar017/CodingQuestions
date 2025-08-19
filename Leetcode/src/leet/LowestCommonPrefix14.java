package leetcode.april.competition.leetcodes;

import java.util.Scanner;

public class LowestCommonPrefix14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		String[] inp = new String[range];
		for (int i = 0; i < inp.length; i++)
			inp[i] = sc.next();
		String ans = horizontal(inp);
		String ans1 = vertical(inp);
		String ans2 = divideConquer(inp);
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);

	}

	private static String divideConquer(String[] inp) {
		if (inp == null)
			return "";
		return divideConquer(inp, 0, inp.length - 1);
	}

	private static String divideConquer(String[] inp, int i, int j) {
		if (i == j)
			return inp[i];
		else {
			int mid = (i + j) / 2;
			String left = divideConquer(inp, i, mid);
			String right = divideConquer(inp, mid + 1, j);
			return commonPrefix(left, right);
		}
	}

	private static String commonPrefix(String left, String right) {
		// TODO Auto-generated method stub

		int min = Math.min(left.length(), right.length());
		for (int i = 0; i < min; i++) {
			if (left.charAt(i) != right.charAt(i))
				return left.substring(0, i);
		}
		return left.substring(0, min);
	}

	private static String horizontal(String[] inp) {

		if (inp.length == 0)
			return "";
		String prefix = inp[0];
		for (int i = 1; i < inp.length; i++) {
			while (inp[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		}
		return prefix;

	}

	private static String vertical(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i == strs[j].length() || strs[j].charAt(i) != c)
					return strs[0].substring(0, i);
			}
		}
		return strs[0];
	}

}
