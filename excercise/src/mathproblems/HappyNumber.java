package mathproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 Example: 19 is a happy number
 1^2 + 9^2 = 82   ^2 is basically square
 8^2 + 2^2 = 68
 6^2 + 8^2 = 100
 1^2 + 0^2 + 0^2 = 1
 *
 */
public class HappyNumber {

	// A method that just gets all the digits of a number in a arraylist
	public List<Integer> getDigits(int number){
		List<Integer> digits = new ArrayList<Integer>();
		while(number>0){
			digits.add( number%10) ;
			number = number/10;
		}
		return digits;
	}
	// This method gets individual digits from the arraylist and sums the square of the digits
	public Integer sumOfDigitSquare(List<Integer> digits){
		int sum=0;
		for(int i: digits){
			sum += Math.pow(i,2);
		}
		return sum;
	}

	// This method uses other two methods for up to maxIteration to find out if the number finally results in 1 or not.
	// If addition of the squares of the digit at any given iteration becomes 1, it returns 1 otherwise it returns false.
	public boolean isHappy(int n, int maxIteration) {
		int iteration=0;
		while(n!=1 && iteration<maxIteration ){
			List<Integer> digits = getDigits(n);
			n = sumOfDigitSquare(digits);
			iteration++;
		}
		return n ==1? true: false;
	}


	// Following is a much better solution than the one created above. Time taken is almost half.

	public boolean isHappy(int n) {
		Set<Integer> inLoop = new HashSet<Integer>();
		int squareSum,remain;
		while (inLoop.add(n)) {
			squareSum = 0;
			while (n > 0) {
				remain = n%10;
				squareSum += remain*remain;
				n /= 10;
			}
			if (squareSum == 1)
				return true;
			else
				n = squareSum;

		}
		return false;

	}
	public static void main(String args[]){
		final int MAX_ITERATION =10;
		int[] test_integers = new int[] {19,18,78,7};
		long total=0;
		HappyNumber happyNumber = new HappyNumber();
		for(int i: test_integers){
			long t1 = System.nanoTime();
			//System.out.println(" i="+i + " is  happy number = "+ happyNumber.isHappy(i,MAX_ITERATION));
			System.out.println(" i="+i + " is  happy number = "+ happyNumber.isHappy(i));
			long t2 = System.nanoTime();
			System.out.println(t2-t1);
			total +=t2-t1;
		}
		System.out.println("average ="+total/test_integers.length);
	}

}
