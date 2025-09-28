package leetcode.april.competition.leetcodes.codes.leetcode.april.competition.leetcodes.codes.questions;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

public class RemoveElement27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int val = sc.nextInt();
		int[] inp = new int[range];
		for (int i = 0; i < inp.length; i++)
			inp[i] = sc.nextInt();
	//	int ans = removeElementList(inp, val);
		int ans1 = removeElementNormal(inp, val);
		//System.out.println(ans);
		System.out.println(ans1);

	}

	private static int removeElementNormal(int[] inp, int val) {
		int i = 0;
		for (int j = 0; j < inp.length; j++) {
			if (inp[j] != val) {
				inp[i] = inp[j];
				i++;

			}
		}
		return i;
	}

	private static int removeElementList(int[] inp, int val) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();
		for (int i = 0; i < inp.length; i++)
			list.add(inp[i]);
//
//		for (int i = 0; i < list.size(); i++) {
//			if (list.indexOf(i) == val)
//				list.remove(i);
//		}

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			if (val == (Integer) itr.next())
				itr.remove();
		}
		// System.out.println(list);

		return list.size();

	}

}
