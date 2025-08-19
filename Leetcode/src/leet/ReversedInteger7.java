package leetcode.april.competition.leetcodes;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class ReversedInteger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		String rev = new StringBuilder().append(Math.abs(x)).reverse().toString();
		
		// try {
		x = x < 0 ? (Integer.parseInt(rev) * -1) : (Integer.parseInt(rev));
		System.out.println(x);
		// } catch (NumberFormatException e) {
		// System.out.println(e);
		// }

	}
}
