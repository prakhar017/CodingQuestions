package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes;

import java.util.Scanner;

public class countAndSay38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = count(n);
		System.out.println(ans);

	}

	private static String count(int n) {
		// TODO Auto-generated method stub
		String res = "1";
		while (n > 1) {
			StringBuilder s = new StringBuilder();
			for (int i = 0, j = i; i < res.length(); i = j) {
				// taking the count and the value till which i and j are same. 
				while (j < res.length() && res.charAt(i) == res.charAt(j)) {
					j++;
				}
				//adding the count and then the value  to string  
				s.append(j - i).append(res.charAt(i));

			}
			res = s.toString();
			n--;
		}
		return res;
	}
	
	

}
