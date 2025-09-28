package prac.basics.mix;

public class MaxConsecutiveOneorZero {

    public static void main(String[] args) {


        int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int count = 1;
        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {


            if (arr[i] == arr[i + 1]) {
                count++;

                if (maxCount < count)
                    maxCount = count;
            }

            else {
                count = 1;
            }
        }

/*      int prev = -1;
        int count = 1;
        for (int i : arr) {

            if ((prev ^ i) == 0) {
                count++;
                if (maxCount < count)
                    maxCount = count;
            } else
                count = 1;

            prev = i;

        }*/


        System.out.println(maxCount);
    }
}
