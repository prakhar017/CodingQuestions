package prac.basics.mix;

public class MaxConsecutiveOneorZeroTry {

    public static void main(String[] args) {


        int arr[] = {0, 0, 0, 0};
        int zeroCount = 1;
        int maxZeroCount = Integer.MIN_VALUE;
        int oneCount = 1;
        int maxOnceCount = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            zeroCount = 1;
            oneCount = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == 1 && arr[i] == arr[j]) {
                    oneCount++;
                    maxOnceCount = Math.max(oneCount, maxOnceCount);
                } else if (arr[i] == 0 && arr[i] == arr[j]) {
                    zeroCount++;
                    maxZeroCount = Math.max(zeroCount, maxZeroCount);
                } else

                    break;
            }
        }

        System.out.println(Math.max(maxOnceCount, maxZeroCount));
    }
}
