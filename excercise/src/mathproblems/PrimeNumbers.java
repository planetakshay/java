package mathproblems;
/**
 * Print first N prime number.
 * 
 * Definition of Prime number: Any number greater than 1 that is divisible by number itself and 1 and no other number is a prime numer
 * Amazon phone interview - 2013
 * 
 * @author Akshay
 *
 */
public class PrimeNumbers {

	public static boolean isPrime(int x){
		if(x==0 || x==1 ){ // Any number is always divisible by 1. 0 and 1 are not part of prime numbers
			return false;
		}
		for(int i=2;i<=Math.sqrt(x);i++){ //Important thing to remember is loop starts at 2
			
			if(x%i ==0){
				return false;
			}
		}
		return true;
		
	}
	public static void primeNumbers(int n){
		int i=1;
		int number=0;
		while(i<=n){
			
			if(isPrime(number)){
				System.out.println(i+"="+number+" ");
				i++;
			}
			number++;
		}
	}
	public static void main(String args[]){
		primeNumbers(10);
	}
}
