package mathproblems;

/**
 *  if input is [3,4,5] output should be [3,4,6]
 *  ip = [4,0,6] op = [4,0,7]
 *  ip = [9,9,9] op= [1,0,0,0]
 */
public class PlusOne {


	public int[] plusOne(int[] digits) {

		int n = digits.length;
		for(int i=n-1; i>=0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		int[] newNumber = new int [n+1];
		newNumber[0] = 1;

		return newNumber;
	}

	public static void main (String args[]){
		int[] digits = new int[]{0,3,0,4,5};
		int[] newDigits = new PlusOne().plusOne(digits);

		for(int i: newDigits){
			System.out.print(i+" ");
		}
	}
}
