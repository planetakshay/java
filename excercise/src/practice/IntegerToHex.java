package practice;

/**
 * convert a number from an integer into an another integer which, if printed in hex, would look the same as the original integer.

 * For example:Convert 20 to 32 (which is 0x20)Convert 54 to 84 (which is 0x54)
 * 
 * @author Akshay
 *
 */

public class IntegerToHex {
	
	public static int solve(int x){
	    int y=0;
	    int i=0;

	    while (x>0){
	        y+=(x%10)*Math.pow(16,i);
	        x/=10;
	        i++;
	    }
	    return y;
	}
	public static void main(String args[]){
		 System.out.println(solve(16));
		 System.out.println(solve(54));
		 System.out.println(Integer.toHexString(45));
	}

}
