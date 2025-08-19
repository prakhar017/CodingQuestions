package prac.basics.mix;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
            arr[i]= sc.nextInt();


        int mid = binarySearch(arr,0,n-1,target);
        System.out.println(mid);
    }

    private static int binarySearch(int[] arr, int i, int j, int target) {

        while (i<j){
            int mid = i+j/2;

            if(arr[mid]==target)
                return mid;

            else if(arr[mid]> target)
                j= mid-1;

            else
                i= mid +1;
        }

        return 0;

    }
}
