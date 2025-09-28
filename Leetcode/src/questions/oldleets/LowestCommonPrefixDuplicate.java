package oldleets;

import java.util.Scanner;

public class LowestCommonPrefixDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		String[] inp = new String[range];
		for (int i = 0; i < inp.length; i++)
			inp[i] = sc.next();
		String ans = divideConquer(inp);
		String ans1 = horizontal(inp);
		System.out.println(ans);
		System.out.println(ans1);

	}

	private static String horizontal(String[] inp) {
		// TODO Auto-generated method stub
		if (inp == null)
			return "";
		String prefix = inp[0];
		for (int i = 1; i < inp.length; i++) {
			while (inp[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}

	private static String divideConquer(String[] inp) {
		// TODO Auto-generated method stub
		if (inp == null)
			return "";
		return divideConquer(inp, 0, inp.length - 1);
	}

	private static String divideConquer(String[] inp, int i, int j) {
		// TODO Auto-generated method stub
		if (i == j)
			return inp[i];
		else {
			int mid = (i + j) / 2;
			String left = divideConquer(inp, i, mid);
			String right = divideConquer(inp, mid + 1, j);
			return commonPre(left, right);

		}

	}

	private static String commonPre(String left, String right) {
		// TODO Auto-generated method stub
		int min = Math.min(left.length(), right.length());
		for (int i = 0; i < min; i++) {
			if (left.charAt(i) != right.charAt(i))
				return left.substring(0, i);
		}
		return left.substring(0, min);
	}
}
