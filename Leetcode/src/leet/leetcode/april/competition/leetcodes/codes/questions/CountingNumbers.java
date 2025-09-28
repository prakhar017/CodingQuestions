package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CountingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int[] arr = new int[range];
		for (int i = 0; i < range; i++)
			arr[i] = sc.nextInt();
		int ans=count(arr);
		System.out.println(ans);

	}

	private static int count(int[] arr) {
		// TODO Auto-generated method stub
		int c=0;
		HashSet<Integer> set = new HashSet();
		for(int a:arr) {
			set.add(a);
		}
		for(int i =0;i<arr.length;i++) {
			if(set.contains(arr[i]+1))
				c++;
				
		}
		
		
		return c;
	}

}
