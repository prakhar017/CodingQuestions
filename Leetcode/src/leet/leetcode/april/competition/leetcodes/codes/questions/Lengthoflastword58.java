package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes;

import java.util.Scanner;

public class Lengthoflastword58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int ans = lengthoflast(s);
		System.out.println(ans);

	}

	private static int lengthoflast(String s) {
		// TODO Auto-generated method stub

	
		//
  s = s.trim();
		
	if(s.indexOf(' ')==-1)
	 return s.length();
		
	 for(int i=s.length()-1;i>=0;i--) {
		 if(s.charAt(i)==' ')//boundry word
			 return s.substring(i,s.length()-1).length();
		// return s.length()-1-i;
		 
	 }
	 return 0;
	 
	 
//	 String[] arr = s.split(" ");
//	 if(arr.length==0)
//		 return 0;
//	 return arr[arr.length-1].length();
//	 
	 
	} 
}
