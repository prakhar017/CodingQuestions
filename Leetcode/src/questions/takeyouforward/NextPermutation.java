package leetcode.april.competition.leetcodes.codes.leetcode.april.competition.leetcodes.codes.questions.questions.leetcode.takeyouforward;

import java.util.*;

public class NextPermutation {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //List<Integer> list = new ArrayList<>();
        int[] arr =new int[n];

        for (int i = 0; i < n; i++) {
            //list.add(sc.nextInt());
            arr[i] = sc.nextInt();
        }

        //System.out.println(nextPermutation(list));

        nextPermutation1(arr);


    }

    private static void nextPermutation1(int[] nums) {

        int n = nums.length;
        int index = -1, temp =0, i =0, j=0;

        for ( i = n-2; i >=0 ; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if( index == -1){
            for(i =0, j=n-1; i<j; i++,j-- ){
                temp= nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }

            for(i=0;i<n;i++){
                System.out.print( nums[i] + " ");
            }
            return;
        }

        for( i =n-1; i>index; i--){
            if (nums[i] > nums[index]){
                temp= nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }

        for(i = index+1,j=n-1; i < j; i++, j--){
            temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        for(i=0;i<n;i++){
            System.out.print( nums[i] + " ");
        }
    }

    private static List<Integer> nextPermutation(List<Integer> list) {

        int index = -1;
        int temp = 0;

        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) < list.get(i+1)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            Collections.reverse(list);
            return list;



        }

        for (int i = list.size() - 1; i > index; i--) {
            if (list.get(i) > list.get(index)){
                temp = list.get(i);
                list.set(i, list.get(index));
                list.set(index,temp);
                break;
            }
        }

        List<Integer> subList = list.subList(index + 1, list.size());
        Collections.reverse(subList);
        System.out.println(subList);

        return list;

    }
}
