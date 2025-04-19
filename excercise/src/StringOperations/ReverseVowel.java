package StringOperations;


/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 */
public class ReverseVowel {

    public static String getVowelReversedString(String s){
        if(s.isEmpty() || s.length() == 1 ) return s;

        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left < right ){
                while (left < right && vowels.indexOf(chars[left]) == -1) {
                    left++;
                }
                while (left < right && vowels.indexOf(chars[right]) == -1){
                    right--;
                }
                if(left < right) {
                    char temp = chars[left];
                    chars[left++] = chars[right];
                    chars[right--] = temp;
                }
            }
        return new String(chars);
        }
    public static void main(String[] args){

    String s = "leetcode";
    System.out.println(getVowelReversedString(s));
    }
}
