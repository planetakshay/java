package StringOperations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Example 4:
 *
 * Input: x = -101
 * Output: false
 */
public class NumberPalindrome {


    public static boolean isNumberPalindrome(int num){
        if(num < 0 | (num %10 == 0 && num != 0)){
            return false;
        }
        List<Integer> digits = new LinkedList<>();

        while(num>0){
            digits.add(num %10);
            num = num /10;
        }
        int i = 0;
        int j = digits.size()-1;
        while(i<=j){
            if(!digits.get(i).equals(digits.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean isNumberPalindromeEfficient(int num){
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(num<0 | (num %10 == 0 && num != 0)){
            return false;
        }
        //calculate reverted number
        int revertedNum = 0;
        while( num > revertedNum){
            revertedNum = revertedNum *10 + num %10;
            num /=10;
        }
        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return revertedNum == num || revertedNum /10 == num;

    }

    public static void main(String[] args){
        int [] input = new int[]{121,-121,10,-101,12122121,12321};
        long start = System.currentTimeMillis();
        for(int i: input){
                System.out.println(" i= "+i+ " "+ isNumberPalindrome(i));
        }
        System.out.println("Total time " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        for(int i: input){
            System.out.println(" i= "+i+ " "+ isNumberPalindromeEfficient(i));
        }
        System.out.println("Total time " + (System.currentTimeMillis() - start));

    }

}
