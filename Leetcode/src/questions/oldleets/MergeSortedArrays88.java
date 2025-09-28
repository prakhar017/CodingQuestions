package leetcode.april.competition.leetcodes.codes.leetcode.april.competition.leetcodes.codes.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortedArrays88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] res= new int[m+n];
		int[] a = new int[m];
		int[] b = new int[n];
		for (i = 0; i < m; i++)
			a[i] = sc.nextInt();
		for (i = 0; i < n; i++)
			b[i] = sc.nextInt();

	res=	merge(a, b,m,n);
		for (i = 0; i < res.length; i++)
			System.out.println(res[i]);
	}

	private static int[] merge(int[] a, int[] b,int m , int n) {
		// TODO Auto-generated method stub
		int i;
		int[] arr =new int[m+n];
		ArrayList list = new ArrayList();
		for (i = 0; i < m; i++)
			//if (a[i] != 0)
				list.add(a[i]);
		for (int j = 0; j < n; j++)
			list.add(b[j]);
		list.sort(null);

		for (i = 0; i < list.size(); i++)
			arr[i] = (int) list.get(i);
		
		return arr;
		
//		 int i;
//	        for(i=m+n-1;i>=0 && n-1>=0;i--){
//	            nums1[i]=(m-1<0|| nums1[m-1]<nums2[n-1])?nums2[n-- -1]: nums1[m-- -1];
//	        }

	}

}
