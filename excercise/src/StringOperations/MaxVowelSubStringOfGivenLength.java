package StringOperations;

/**
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 * Example 1:
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 * Example 2:
 * Input: s = "aeiou", k = 2
 * Output: 2
 * Explanation: Any substring of length 2 contains 2 vowels.
 * Example 3:
 * Input: s = "leetcode", k = 3
 * Output: 2
 * Explanation: "lee", "eet" and "ode" contain 2 vowels.
 */
public class MaxVowelSubStringOfGivenLength {

    public static int maxVowel(String s,int k){

        int maxVowel = 0;
        int vCount = 0;
        StringBuilder sb = new StringBuilder("aeiouAEIOU");
        for(int i=0;i<k;i++){
            if(sb.indexOf(String.valueOf(s.charAt(i)))!=-1){
                vCount++;
            }
        }
        for(int i=k;i<s.length();i++){
            if(sb.indexOf(String.valueOf(s.charAt(i-k)))!=-1){
                vCount--;
            }
            if(sb.indexOf(String.valueOf(s.charAt(i)))!=-1){
                vCount++;
            }
            maxVowel = Math.max(maxVowel,vCount);

        }

        return maxVowel;
    }
    public static void main(String[] args){

        System.out.println( maxVowel("abciiidef",3));
        System.out.println( maxVowel("aeiou",2));
        System.out.println( maxVowel("leetcode",3));

    }
}
