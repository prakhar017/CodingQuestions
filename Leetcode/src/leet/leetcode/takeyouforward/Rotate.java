package leetcode.april.competition.leetcodes.leetcode.takeyouforward;

import java.util.Scanner;

public class Rotate {

public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    rotate(arr);
    


}
    private static void rotate(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] temp = new int [n][m];

        for ( int i=0; i<n;i++){
            for ( int j=0;j<m;j++){
                temp[j][n-i-1]= matrix[i][j];
            }

        }

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }

    }


}
