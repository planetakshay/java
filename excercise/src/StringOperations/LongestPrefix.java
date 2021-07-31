package StringOperations;

/*
 *
 This was an interview question.
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: ["music","muse","mule"]
Output: "mu"
Example 2:
Input: ["dog","done","sky","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Input: ["miss", "mission","mistake","misunderstand"]
Output: "mis"

Input: ["miss", "mission","mistake","misunderstand"]
Output: "miss"

 */


import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class LongestPrefix {

    public static String getLongestPrefix(List<String> strings){
        String longestPrefix = "";

        StringBuilder prefixString = new StringBuilder();
        boolean prefixFound=false;
        String firstString = strings.get(0);

        if(strings.size() == 1){

            return firstString;
        }

        for(int i=0;i<firstString.length() ;i++){
            if(!prefixFound){
                prefixString.append(firstString.charAt(i));
                for (String string : strings) {
                    if (!string.startsWith(prefixString.toString())) {
                        prefixFound = true;
                        //Prefix would be one less character than when this round of comparison started
                        prefixString.deleteCharAt(prefixString.length()-1);
                        break;
                    }
                }
                longestPrefix = prefixString.toString();
            }

        }
        return longestPrefix;

    }

    public static void main(String[] args) {
       // String strings_array[] = new String[]{"miss", "mission","mistake","misunderstand"};
       // String strings_array[] = new String[]{"dog","done","sky","car"};
        String strings_array[] = new String[]{"miss", "mission","mistake","misunderstand"};
       // String strings_array[] = new String[]{"dog", "mission","mistake","misunderstand"};
      //  String strings_array[] = new String[]{"dog", "dogdogdog","dog1","missdog"};
        List<String> strings =  Arrays.asList(strings_array);

        System.out.println("Longest Prefix = " + LongestPrefix.getLongestPrefix(strings));
    }
}



