package practice;

public class LargestPrimeFactor {
	
	public static int largestPrimeFactor(int n){
		
		for(int i=2;i<n;i++){
			if(n%i==0){
				n = n/i;
				i--;
			}
		}
		return n;
	}

	public static void main(String args[]){
		System.out.println(largestPrimeFactor(24));
	}
}
