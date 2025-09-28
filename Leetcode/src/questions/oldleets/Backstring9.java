package oldleets;

import java.util.Scanner;
import java.util.Stack;

public class Backstring9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		String one= sc.next();
		String two= sc.next();
		boolean ans= compare(one, two);
		System.out.println(ans);
		
		
	}

	private static boolean compare(String one, String two) {
		// TODO Auto-generated method stub
		
		Stack<Character> s1= new Stack();
		Stack<Character> s2= new Stack();
		
		for(int i=0;i<one.length();i++) {
			if(one.charAt(i)!='#')
				s1.push(one.charAt(i));
			else if(one.charAt(i)=='#' && s1.isEmpty())
				continue;
			else
				s1.pop() ;
		}
		for(int i=0;i<one.length();i++) {
			if(two.charAt(i)!='#')
				s2.push(two.charAt(i));
			else if(two.charAt(i)=='#' && s2.isEmpty())
				continue;
			else
				s2.pop();
		}
		
		 return s1.equals(s2)? true: false;
	}

}
