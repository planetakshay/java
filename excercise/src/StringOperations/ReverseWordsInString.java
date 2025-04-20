package StringOperations;
/*
        Given an input string s, reverse the order of the words.

        A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

        Return a string of the words in reverse order concatenated by a single space.

        Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should
        only have a single space separating the words. Do not include any extra spaces.

        Example 1:

        Input: s = "the sky is blue"
        Output: "blue is sky the"

        Example 2:

        Input: s = "  hello world  "
        Output: "world hello"
        Explanation: Your reversed string should not contain leading or trailing spaces.

        Example 3:

        Input: s = "a good   example"
        Output: "example good a"
        Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {
    public static String reverseWords(String s){
        String reverseWords = "";
        s = s.trim();
        String word="";
        for(int i=0;i<s.length();i++){
            if( s.charAt(i) != ' '  )  {
                word +=s.charAt(i);
            }
            // We found one word
            if(s.charAt(i) == ' ' && !word.isEmpty() ) {
                if(!reverseWords.isEmpty())
                    reverseWords = word + " " + reverseWords;
                else
                    reverseWords = word;
                word = "";
            }
        }
        if(!word.isEmpty() && !reverseWords.isEmpty())
            reverseWords = word + " " + reverseWords;
        else
            reverseWords = word;
        return reverseWords;
    }
    public static String reverseWordsUsingStingBuilder(String s){
         String altered = s.trim();
         String[] splits = altered.split(" ");
         StringBuilder builder = new StringBuilder();
         for(int i = splits.length - 1; i>=0; i--) {
             if(!splits[i].isEmpty()){
                 builder.append(splits[i]);
                 builder.append(" ");
             }
         }
         return builder.toString().trim();
    }
    public static void main (String[] args){
        List<String> input = new ArrayList<>();

        input.add(" hello world");
        input.add("the sky is blue");
        input.add("a good    example");
        input.add("EPY2giL");
        for (String s: input){
            System.out.println( "Input = "+s);
            System.out.println("Output with reversWords = "+ reverseWords(s) );
            System.out.println("Output with reversWordsUsingStringBuilder = "+reverseWordsUsingStingBuilder(s)+"\n");
        }


    }
}
