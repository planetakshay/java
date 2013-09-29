package mathProblems;

public class ReverseTheNumber {

	public static void main(String args[]){
		int n=193324521;
		int digit=0;
		int reverse=0;
		while(n!=0){
			digit = n%10;
			reverse = reverse *10 + digit;
			n =n/10;
			//System.out.print(n+" ");
		}

		System.out.println(reverse);
	}
	
}
