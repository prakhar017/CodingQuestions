package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes.leetcode.takeyouforward;

import java.util.Scanner;

public class Kadane {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int ans1 =maxSubArray(arr);
        int ans2 =maxSubArray3(arr);
        System.out.println(ans1);
        System.out.println(ans2);


    }

    private static int maxSubArray3(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart;
        int ansEnd;

        for (int i = 0; i < nums.length; i++) {

            if (sum == 0)
                start = i;

            sum = sum + nums[i];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0)
                sum = 0;
        }
        return max;
    }

    private static int maxSubArray(int[] arr) {

        int max = Integer.MIN_VALUE;

/* Better   for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                // current subarray = arr[i.....j]

                //add the current element arr[j]
                // to the sum i.e. sum of arr[i...j-1]
                sum += arr[j];

                maxi = Math.max(maxi, sum); // getting the maximum
            }
        }*/

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }

                if (sum > max)
                    max = sum;


            }
        }

        return max;
    }
}
