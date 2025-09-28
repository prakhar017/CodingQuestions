package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes.leetcode.takeyouforward;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        int ans1 = variationOne(r - 1, c - 1);
        System.out.println(ans1);
        variationTwo(n);
        ArrayList<ArrayList<Integer>> ans3 = variationThree(n);
        System.out.println(ans3);

    }

    private static ArrayList<ArrayList<Integer>> variationThree(int n) {

        ArrayList<ArrayList<Integer>> listFinal = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> listTemp = new ArrayList<>();
            for (int c = 1; c <= i; c++) {
                listTemp.add(variationOne(i - 1, c - 1));
            }
            listFinal.add(listTemp);
        }

        return listFinal;
    }



    private static void variationTwo(int n) {

        for (int c = 1; c <= n; c++) {
            System.out.print(variationOne(n - 1, c - 1) + " ");
        }
        System.out.println();
    }

    private static int variationOne(int n, int r) {

        int result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }

        return result;
    }
}
