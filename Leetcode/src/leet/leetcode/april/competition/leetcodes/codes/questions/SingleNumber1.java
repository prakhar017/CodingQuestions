package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SingleNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int range=sc.nextInt();
			int[] inp = new int[range];
			for(int i=0;i<inp.length;i++)
				inp[i]=sc.nextInt();
			int ans=singleNumber(inp);
			int ans1= singeNumber1(inp);
			System.out.println(ans);
			System.out.println(ans1);
			
			
			
	}

	private static int singeNumber1(int[] inp) {
		
		// TODO Auto-generated method stub
		int x=0;
		for(int a:inp) {
			 x = x ^a;
		}
		return x;
	}

	private static int singleNumber(int[] inp) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet();
		
		for(int a :inp) {
			if(!set.add(a))
				set.remove(a);
		}
		Iterator<Integer> itr = set.iterator();
		return itr.next();
		
		
	}

}
