///*
//package prac.basics.java.codes;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class Numbers {
//
//    // 1,4,7,11,14,18,21,22
//
//    public static void main(String[] args) {
//
//        List<String> stringList = Arrays.asList("abc,def,ghi");
//        //List of obj, 5filds , one is target int,
//        -
//                a.target = 1, b.target = 2, c,target = 1
//                1: a,c 2:b
//               s  payload,
//               int source,
//
//        - write sql query to find all the device with details:
//        - device_name, schedule value(value in schedule_id table), state (derived value)
//                - if device has entry in schedules table, state column will be "scheduled"
//                - if device has no entry in schedules table, state column will be "not scheduled"
//
//  sch_id, val
//  devi_id, name
//
//        Table 1 - schedule_id:
//        id  value
//        1    a
//        2    b
//        3    c
//
//        Table 2 - device:
//        device_id device_name
//
//        dev1      iPhone
//        dev2      Android
//
//        Table 3 - schedules:
//
//        device_id  id
//        dev1      1
//
//
//                select deice_id, device_name from device where device_id in
//        (select device_id from schdule_id inner join schedules on schdule_id.id = schedules.device_id)
//
//
//
//
//        //Map<Object, Long> collect = stringList.stream().collect(Collectors.groupingBy(A::getTarget),Collectors.(x));
//
//
//
//
//
//
//
//        stringList.stream().filter((s -> s.equals())
//        stringList.stream().filter((s -> s.equals())
//
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int target = sc.nextInt();
//
//        int[] arr = new int[n];
//
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//        searchNumber(arr, target, 0, arr.length - 1);
//    }
//
//    private static int searchNumber(int[] arr, int i, int j, int target) {
//        int i = 0;
//        int j = arr.length - 1;
//        int l = arr.length;
//        int mid = l / 2 + 1;
//
//        while (i < j) {
//
//            if (arr[mid] > target) {
//                searchSecond(i, mid - 1, arr, tar);
//            } else if (arr[mid] < target)
//                searchSecond(mid + 1, j, arr);
//
//            else
//                return i;
//        }
//    }
//
//    private static void searchSecond(int i, int i1, int[] arr) {
//
//
//    }
//
//}
//*/
