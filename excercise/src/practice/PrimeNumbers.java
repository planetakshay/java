package practice;

/*
 * find first n prime numbers
 */

public class PrimeNumbers {
	
	public static boolean isPrime(int number){
		if(number==0 || number==1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(number);i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void printPrime(int n){
		int i=3;
		while(n>0){
			
			if(isPrime(i)){
				System.out.print(i+",");
				n--;
			}
		i++;
		}
	
		
	}
	public static void main(String args[]){
		
		PrimeNumbers.printPrime(30);
		
	}

}
