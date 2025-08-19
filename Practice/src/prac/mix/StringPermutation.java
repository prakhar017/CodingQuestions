package prac.basics.mix;

public class StringPermutation {

    public static void main(String[] args) {

        String s = "abc";
        allPermutation(s);

    }
    public static void allPermutation(String s) {
        permutation(s, "");
    }

    public static void permutation(String str, String result) {

        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permutation(remaining, result + ch);
        }

    }


/*
    1. Recognize the recursive nature of the problem
    Permutations are a classic recursive problem.

    Example:
    Say you have a string "abc".

    To generate all permutations of "abc", you:

    Pick each character one by one as the starting character

    Then recursively find permutations of the remaining characters

    So:

    Choose 'a' → permute("bc") → add 'a' in front of all of them
    Choose 'b' → permute("ac") → add 'b' in front of all of them
    Choose 'c' → permute("ab") → add 'c' in front of all of them


    2. Design the recursive method
    We want a method like:


    void permutation(String remaining, String builtUpResult)
    Where:

    remaining = characters left to use

    builtUpResult = the part of the permutation built so far

    Eventually, when remaining is empty (length == 0), the builtUpResult is a complete permutation → print it.


    permutation("abc", "")
├── choose 'a' → permutation("bc", "a")
│   ├── choose 'b' → permutation("c", "ab")
│   │   └── choose 'c' → permutation("", "abc") → print
│   └── choose 'c' → permutation("b", "ac")
│       └── choose 'b' → permutation("", "acb") → print
├── choose 'b' → permutation("ac", "b")
│   ├── choose 'a' → permutation("c", "ba")
│   │   └── choose 'c' → permutation("", "bac") → print
│   └── choose 'c' → permutation("a", "bc")
│       └── choose 'a' → permutation("", "bca") → print
└── choose 'c' → permutation("ab", "c")
    ├── choose 'a' → permutation("b", "ca")
    │   └── choose 'b' → permutation("", "cab") → print
    └── choose 'b' → permutation("a", "cb")
        └── choose 'a' → permutation("", "cba") → print
*/


}
