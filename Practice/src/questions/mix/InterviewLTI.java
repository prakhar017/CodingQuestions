package prac.basics.mix;

public class InterviewLTI {

    public static void main(String[] args) {

        //System.out.println("Hii");
        String s = "ABCD";
        allpermutation(s);

    }

    private static void allpermutation(String s) {


        permutation(s, "");
    }

    private static void permutation(String s, String s1) {

        if (s.length() == 2 || s.length() == 1 || s.length() == 0)
            System.out.println(s1);

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            String remaining = s.substring(0, i) + s.substring(i + 1);
            permutation(remaining, s1 + ch);
        }

    }
}
