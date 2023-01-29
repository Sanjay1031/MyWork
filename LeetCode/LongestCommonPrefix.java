import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
       if(strs.length == 0) {
           return "";
       }

       // Test Case 1: [flower,flow,flight]
       String prefix = strs[0];

       for (int i = 1; i < strs.length; i++) {
           //** LOGIC TO SEE IF WORDS MATCH **//
           // IndexOf() returns the position of the first occurrence of said word/character
           // Will return -1 since flow doesn't match with flower

           while(strs[i].indexOf(prefix) != 0) {
               // Will reduce the prefix "flower" till it matches with "flow"
               prefix = prefix.substring(0, prefix.length() -1);
               System.out.println(prefix);
           }
       }
       return prefix;
    }
}
