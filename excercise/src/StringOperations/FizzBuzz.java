package StringOperations;

/*
 * if the given number is divisible by 3 then print fizz also -- do not print anything else
 * if the given number is divisible by 5 then print buzz-- - do not print anything else
 * if the given number is divisible by 3 and 5 then print fizzbuzz --- do not print anything else
 * 
 */

public class FizzBuzz {
	public void printFizzBuzz(int number){
		if(number==0 || number<3) return;
		if(number%3==0 && number%5==0){
			System.out.println("number "+ number + " fizzBuzz");
			return;
		}else if(number%3==0){
			System.out.println("number "+number +" fizz");
			return;
		}else if(number%5==0){
			System.out.println("number "+number + " buzz");
			return;
		}
		
		
	}
	public static void main(String args[]){
		FizzBuzz fizzBuzz = new FizzBuzz();
		for(int i=0;i<=20;i++){
			fizzBuzz.printFizzBuzz(i);
		}
		
	}
}
