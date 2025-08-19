package prac.basics.mix;

import java.util.Arrays;

public class ArrayPermutation {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        allPermutation(arr);
    }

    public static void allPermutation(int[] arr) {
        permutation(arr, 0);
    }

    public static void permutation(int[] arr, int index) {

        if (arr.length == index) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            permutation(arr, index + 1);
            swap(arr, i, index);
        }

    }

    public static void swap(int[] arr, int left, int right) {
        int temp;

        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }



/*    🌳 RECURSION TREE STRUCTURE

permutation([1, 2, 3], 0)
├── swap(0,0) → [1, 2, 3]
│   └── permutation([1, 2, 3], 1)
│       ├── swap(1,1) → [1, 2, 3]
│       │   └── permutation([1, 2, 3], 2)
│       │       └── swap(2,2) → [1, 2, 3]
│       │           └── permutation([1, 2, 3], 3) → ✅ print [1, 2, 3]
│       └── swap(2,1) → [1, 3, 2]
│           └── permutation([1, 3, 2], 2)
│               └── swap(2,2) → [1, 3, 2]
│                   └── permutation([1, 3, 2], 3) → ✅ print [1, 3, 2]
├── swap(1,0) → [2, 1, 3]
│   └── permutation([2, 1, 3], 1)
│       ├── swap(1,1) → [2, 1, 3]
│       │   └── permutation([2, 1, 3], 2)
│       │       └── swap(2,2) → [2, 1, 3]
│       │           └── permutation([2, 1, 3], 3) → ✅ print [2, 1, 3]
│       └── swap(2,1) → [2, 3, 1]
│           └── permutation([2, 3, 1], 2)
│               └── swap(2,2) → [2, 3, 1]
│                   └── permutation([2, 3, 1], 3) → ✅ print [2, 3, 1]
└── swap(2,0) → [3, 2, 1]
    └── permutation([3, 2, 1], 1)
        ├── swap(1,1) → [3, 2, 1]
        │   └── permutation([3, 2, 1], 2)
        │       └── swap(2,2) → [3, 2, 1]
        │           └── permutation([3, 2, 1], 3) → ✅ print [3, 2, 1]
        └── swap(2,1) → [3, 1, 2]
            └── permutation([3, 1, 2], 2)
                └── swap(2,2) → [3, 1, 2]
                    └── permutation([3, 1, 2], 3) → ✅ print [3, 1, 2

                    */
}
