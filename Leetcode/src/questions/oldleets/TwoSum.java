package leetcode.april.competition.leetcodes.codes.leetcode.april.competition.leetcodes.codes.questions;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int target = sc.nextInt();

		int[] inp = new int[range];

		for (int i = 0; i < inp.length; i++)
			inp[i] = sc.nextInt();

		int[] ret;

//		ret = twoSumBasics(inp, target);
		ret = twoSumAdvanced(inp, target);

		if (ret == null)
			System.out.println(" No two solns");
		else {
			for (int i = 0; i < ret.length; i++)
				System.out.println(ret[i]);
		}

	}

	private static int[] twoSumAdvanced(int[] inp, int target) {
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < inp.length; i++) {
			map.put(inp[i], i);

		}

		for (int i = 0; i < inp.length; i++) {
			int comp = target - inp[i];
			if (map.containsKey(comp) && map.get(comp) != i)
				return new int[] { map.get(comp), i };
		}
		return null;
		// throw new IllegalArgumentException(" No two solutions");
	}

	private static int[] twoSumBasics(int[] inp, int target) {
		for (int i = 0; i < inp.length; i++) {
			for (int j = i + 1; j < inp.length; j++) {
				if (inp[j] == target - inp[i])
					return new int[] { i, j };
			}
		}
		return null;
		//throw new IllegalArgumentException("No two sum ");

	}

}
