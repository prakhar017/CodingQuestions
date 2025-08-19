package prac.basics.interview;

import java.util.ArrayList;

public class RecursionTest {

    public static void main(String[] args) {

        int [] arr = { 1,2,2,3,4,2};
        int k =2;

        ArrayList<Integer> list= new ArrayList<>();
        recursionTest(arr,k,0,list);
    }

    public static void recursionTest(int[] arr, int k, int index, ArrayList<Integer> list){

        if(index == arr.length){
            System.out.println(list);
            return;
        }

        if(arr[index] == k){
            list.add(index);
        }

        recursionTest(arr,k,index +1 , list);

    }
}
