package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes;

import java.util.Scanner;

public class BestTimeToBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int[] arr = new int[range];
		for (int i = 0; i < range; i++)
			arr[i] = sc.nextInt();
		int ans = besttime(arr);
		System.out.println(ans);
	}

	private static int besttime(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0, i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[j]>arr[i]) {
				 sum = sum + arr[j]-arr[i];
				i++;
			}
			else
				i++;
		}
		return sum;
	}

}
