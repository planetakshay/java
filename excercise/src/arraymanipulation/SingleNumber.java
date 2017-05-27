package arraymanipulation;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 */
public class SingleNumber {

	public static void main(String args[]){
		int [] a = new int[]{1,1,3,3,5,6,6,8,8};
		int result =0;
		for(int i: a){
			result = result ^ i;
		}

		System.out.println("Integer that appears only once is "+result);
	}
}
