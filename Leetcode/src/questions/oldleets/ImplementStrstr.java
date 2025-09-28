package oldleets;

import java.util.Scanner;

public class ImplementStrstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String haystack = sc.next();
		String needle = sc.next();
		int ans = implementStr(haystack, needle);
		int ans1 = implementSubString(haystack, needle);
		System.out.println(ans);
		System.out.println(ans1);

	}

	

	private static int implementSubString(String h, String n) {
		// TODO Auto-generated method stub
		if (h == null || n == null)
			return 0;

		int d = h.length() - n.length();
		for (int i = 0; i <= d; i++) {
			if (h.substring(     i, i + n.length()).equals(n))
				return i;

		}
		return -1;
	}

	private static int implementStr(String haystack, String needle) {
		// TODO Auto-generated method stub
		if (haystack == null || needle == null)
			return 0;

		int diff = haystack.length() - needle.length();
		for (int i = 0; i <= diff; i++) {
			int j;
			for ( j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j))
					break;

			}
			if (j == needle.length())
				return i;

		}
		return -1;

	}

}
