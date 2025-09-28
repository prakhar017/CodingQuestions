package interview;

public class BinarySearch {

    public static void main (String args[]){

        int [] arr = { 1,2,3,4,5,6,7,8,9,10};

        int target = 5;


       int index = binarySearch(arr,target);
        System.out.println(index);

    }


    public static int binarySearch(int[] arr, int target){

        int i=0;
        int j = arr.length-1;

        while(i<j){
            int mid = (i+(j-i))/2;

            if(arr[mid]<target)
                i=mid+1;

            else if(arr[mid]>target)
            j=mid-1;

            else
                return mid;
        }
        return 0;
    }
}
