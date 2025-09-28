package leetcode.april.competition.leetcodes.codes.leetcode.april.competition.leetcodes.codes.questions;

import java.util.Scanner;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int[] arr = new int[range];
		for (int i = 0; i < range; i++)
			arr[i] = sc.nextInt();
		arr = moveZeroes(arr);
		for (int i = 0; i < range; i++)
			System.out.println(arr[i]);

	}

	private static int[] moveZeroes(int[] arr) {
		// TODO Auto-generated method stub

		int j, c = 0, i = 0;
		for (j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				c++;
				arr[i] = arr[j];
				i++;
			}
		}

		for (j = 0; j < (arr.length - c); j++) {
			arr[i] = 0;
			i++;
		}

		return arr;
	}

}
