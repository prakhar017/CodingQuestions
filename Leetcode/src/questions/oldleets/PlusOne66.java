package oldleets;

import java.util.Scanner;

public class PlusOne66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int[] inp = new int[range];
		for (i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

		}
		int[] ans = plus(inp);
		for (i = 0; i < ans.length; i++)
			System.out.println(ans[i]);

	}

	private static int[] plus(int[] inp) {

		for (int i = inp.length - 1; i >= 0; i--) {
			inp[i] = inp[i] + 1;
			if (inp[i] == 10)
				inp[i] = 0;
			else
				return inp;
		}
		int[] ans = new int[inp.length + 1];
		ans[0] = 1;
		for (int i = 0; i < inp.length; i++) {
			ans[i + 1] = inp[i];
		}

		return ans;

		// return inp;

	}

}
