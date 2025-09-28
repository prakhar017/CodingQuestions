package leetcode.april.competition.leetcodes.codes.leetcode.april.competition.leetcodes.codes.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesisDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		Map<Character, Character> map = new HashMap();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');

		boolean ans = isValid(inp, map);
		System.out.println(ans);

	}

	private static boolean isValid(String inp, Map<Character, Character> map) {
		// TODO Auto-generated method stub
		Stack<Character> s = new Stack();
		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);
			if (map.containsKey(c)) {

				char top = s.isEmpty() ? '#' : s.pop();
				if (top != map.get(c))
					return false;

			} else
				s.push(c);
		}

		return s.isEmpty();

	}

}
