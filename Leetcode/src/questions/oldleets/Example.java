package leetcode.april.competition.leetcodes.codes.leetcode.april.competition.leetcodes.codes.questions;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		// System.out.println(a.getClass());
		//.getClass() can't be invoked on primitive type.
		
		String one = " Hey ";
		System.out.println(one.length());

		one=one.trim();
		System.out.println(one.length());
		System.out.println(one.getClass());

		StringBuilder two = new StringBuilder("Why");
		System.out.println(two.getClass());
		
		String b = Integer.toString(a);
		String c = String.valueOf(a);

		System.out.println(c);

		System.out.println(c.getClass());
		System.out.println(b.getClass());
		
		
		
		
		
		String prefix="wer";
		String suffix= "flower";
		int res =suffix.indexOf(prefix);
		
		// index of will always return -1 until one string is subset of other.
		System.out.println(res);
		System.out.println(prefix.substring(0,1));
		
		
		
		
		
		
	}

}
