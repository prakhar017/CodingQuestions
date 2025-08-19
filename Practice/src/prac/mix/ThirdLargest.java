package prac.basics.mix;

public class ThirdLargest {

    public static void main(String[] args) {

        int[] arr = { 3,4,1,2,6,5,9};

        int i,j;

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for( i=0 ; i<arr.length; i++){

            if(arr[i]>firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
        }

            else if (secondMax < arr[i]){
                thirdMax = secondMax;
                secondMax = arr[i];

            }


            else if (thirdMax < arr[i])
                thirdMax =arr[i];

        }


        System.out.println(thirdMax);
    }
}
