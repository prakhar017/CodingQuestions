package mix;

import java.util.*;

public class AllStrings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        // sc.next()     It read input from the input device till the space character.
        // sc.nextLine() It read input from the input device till the line change.

        String s = sc.nextLine();
        int a = sc.nextInt();

//        reverseStringOrder(s);
//        checkEveryCharacterIsUniqueInString(s);
//        duplicateInStringWithNumber(s);
//        maxOccuredCharacterInString(s);
//        removeDuplicate(s);
//        replaceCharacter(s);
//        getFirstNonRepeatingCharacter(s);
//        intToRoman(a);
        allPermutationsOfString(s);

    }

    private static void allPermutationsOfString(String s) {

        permutation(s, "");

    }

    private static void permutation(String s, String result) {
        // TODO Auto-generated method stub

        char ch;
        String remaining;

        if (s.length() == 0)
            System.out.println(result);

        else
            for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            remaining = s.substring(0, i) + s.substring(i + 1);
            permutation(remaining,result + ch);

        }

    }

    private static void intToRoman(int a) {

        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; a > 0; i++) {
            while (a >= val[i]) {
                sb.append(rom[i]);
                a = a - val[i];

            }
        }

        System.out.println(sb.toString());

    }

    private static void getFirstNonRepeatingCharacter(String s) {
        // TODO Auto-generated method stub

        Map<Character, Integer> map = new LinkedHashMap();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) + 1 : 1);
        }


        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                System.out.println(m.getKey());
                return;
            }

        }

    }

    private static void replaceCharacter(String s) {
        // TODO Auto-generated method stub

//	    s= s.replace("a", "");
        s = s.replace("a", "b");
        s = s.replaceAll("Prbkhbr", "Prakhar");

        System.out.println(s);

    }

    private static void removeDuplicate(String s) {
        // TODO Auto-generated method stub

        HashSet<Character> set = new LinkedHashSet();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }

        StringBuilder sb = new StringBuilder();

        // System.out.println(sb.append(set).toString());

        for (Character character : set) {
            sb.append(character);
        }
        System.out.println(sb.toString());

    }

    private static void maxOccuredCharacterInString(String s) {

        int j;

        int maxValue = 0;
        int maxChar = 0;
        int[] a = new int[26];
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            a[ch[i] - 97]++;

        }

        for (j = 0; j < a.length; j++) {

            if (a[j] > maxValue) {
                maxValue = a[j];
                maxChar = j;
            }

        }

        System.out.println((char) (maxChar + 97) + " --> " + maxValue);

        // TODO Auto-generated method stub

    }

    private static void duplicateInStringWithNumber(String s) {

/*        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());*/

        int[] a = new int[26];
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            a[ch[i] - 97]++;

        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] > 1) System.out.println((char) (j + 97) + " --> " + a[j]);
        }

    }

    private static void checkEveryCharacterIsUniqueInString(String s) {

        int i;
        HashSet set = new HashSet();
        char[] ch = s.toCharArray();
        for (i = 0; i < ch.length; i++) {
            if (set.add(ch[i])) continue;
            else System.out.println(false);
            break;

        }
        if (i == ch.length) System.out.println(true);

        /*
         * if (map.contains(characters[i])) return false; else map.add(characters[i]);
         *
         * return true;
         *
         */

    }

    public static void reverseStringOrder(String s) {

        // StringBuilder builder = new StringBuilder(s);
        // System.out.println(builder.reverse());

        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append(s).reverse().toString());

    }

}
