package MathProblems;


public class CountTotalDigits {

	public static int countdigits(int number){
		int digit = 1;
		while(number / 10 != 0){
			number = number/10;
			digit++;
		}
		return digit;
	}
	public static void main(String args[]){
		System.out.println(" Number of digits in 2379 is ="+CountTotalDigits.countdigits(2379));
		System.out.println(" Number of digits in 0 is ="+CountTotalDigits.countdigits(0));
		System.out.println(" Number of digits in -2379 is ="+CountTotalDigits.countdigits(-2379));
	}

}
