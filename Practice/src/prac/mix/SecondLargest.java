package prac.basics.mix;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = { 3,6,1,2,7};

        int i,j;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(i=0; i<arr.length;i++){

            if(arr[i]> firstMax){

                secondMax = firstMax;
                firstMax = arr[i];

            }

            else if(secondMax < arr[i])
                secondMax = arr[i];

        }

        System.out.println(secondMax);
    }
}
