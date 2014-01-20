package mathproblems;

public class LargestPrimeFactor {

	public static void main(String args[]){
		
		System.out.println(largestprimeFactor(45));
		System.out.println(largestprimeFactor(46));
	}
	public static int largestprimeFactor(int num){
		int i=0;
		for( i=2;i<num;i++){
			if(num%i==0){
				num = num/i;
				i--;
			}
		}
		return i;
	}
}
