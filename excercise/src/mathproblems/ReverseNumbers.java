package mathproblems;
/* given an integer number - reverse the number
 * 
 */

public class ReverseNumbers {
	
	public static int reverseNumber(int n){
		int rev=0;
		while(n>0){
			rev = rev*10+ n%10;
			n=n/10;
		}
		
		return rev;
	}
	public static void main (String args[]){
		int number  = 4536;
		System.out.println(reverseNumber(number));
		
	}

}
