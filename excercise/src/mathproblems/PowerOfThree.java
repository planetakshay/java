package mathproblems;

/**
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Meaning given a number find out if you can reach it by 3 x 3 *...and so on.
 */
public class PowerOfThree {

	//Here 3^19 is less than Integer.MAX_VALUE bit 3^20 is greater than Integer.MAX_VALUE
	//So if 3^19 can be divided by the given number without any remainder i.e. remainder=0 then the given number is power of three
	public static boolean isPowerOfThree(int n){

		return (n >0 && (int) Math.pow(3,19)%n ==0);
	}
	public static void main(String args[]){
		int[] test = new int[]{3,9,27,18,55,99,90,100};
		//3^19 is less than Integer.MAX_VALUE where as 3^20 is greater than Integer.MAX_VALUE;
		for(int i: test){
			System.out.println(" integer i="+i +" is power of 3 ="+isPowerOfThree(i));
		}

	}
}
