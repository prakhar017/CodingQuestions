package interview;


import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test {



    public static void main(String[] args) {


/*        Write a program that creates a concordance of characters occurring in a string
                (i.e., which characters occur where in a string).
                Input : HelloWorld
        Output : {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}*/

/*        String input = "HelloWorld";
        char[] chars = input.toCharArray();

        HashMap<Character, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {

            if (map.containsKey(chars[i])) {
                map.get(chars[i]).add(i);

            } else {
                list = new ArrayList<>();
                list.add(i);
                map.put(chars[i], list);
            }
        }

        System.out.println(map);*/




/*        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.*/


        String[] ch = {"flower","flow", "flight"};
        String prefix = ch[0];
        for(int i = 1 ; i< ch.length;i++){
            while(ch[i].indexOf(prefix) != 0){
                prefix =prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                    System.out.println("");
            }

        }

        System.out.println(prefix);



    }
}
