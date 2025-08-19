package prac.basics.mix;

import java.util.Scanner;

public class NthRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = searchRoot(n, m);
        System.out.println(ans);


    }

    private static int searchRoot(int n, int m) {

        int l = 1;
        int r = m;
        while (l < r) {
            int mid = l + r / 2;
            int midValue = (int) Math.pow(mid, n);

            if (midValue == m)
                return mid;

            else if (midValue < m)
                l = mid + 1;

            else
                r = mid - 1;


        }

        return -1;
    }
}
