package StringOperations;


/**
 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 *Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 *
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 *
 */
public class LengthOfLastWord {


    public static int getLengthOfLastWord1(String str){
        String[] strs = str.split(" ");
        if(strs.length>0) return strs[strs.length - 1].length();
        return 0;
    }
    public static int getLengthOfLastWord(String str) {

        StringBuilder sb = new StringBuilder();
        boolean charFound = false;
        for(int i=str.length()-1; i>=0 ; i--) {
            if(str.charAt(i) != ' '  ) {
                if(!charFound) charFound=true;
                sb.append(str.charAt(i));
            }else if(str.charAt(i) == ' ' && charFound){
                return sb.toString().length();
            }
        }
        return sb.toString().length();
    }

    public static void main(String []args){

        String[] s = new String[]{"a ","a","Hello world","Hello World ", "  Hello w .. nothing   ","  "," "};
        for(String str: s )
            System.out.println("String = "+ str +"| length of last word = " +getLengthOfLastWord1(str));
        }

    }

