package mathproblems;

//import com.sun.prism.shader.Solid_ImagePattern_Loader;

import javax.xml.soap.SOAPPart;
import java.util.Arrays;

/**
 * Created by Deodhar Family on 4/29/2017.
 */
public class ProductOfArrayExceptSelf {


	public  static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0, tmp = 1; i < nums.length; i++) {
			result[i] = tmp;
			tmp *= nums[i];
		}
		for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
			result[i] *= tmp;
			tmp *= nums[i];
		}
		return result;
	}

	//Following is my solution that i have submitted to leetcode;
	public  static int[] productExceptSelfMySolution(int[] nums) {
		int[] result = new int[nums.length];
		int countZero = 0;
		int product = 1;
		//Count number of zeros in array. If thre are two, do not bother to count product, since result array would all be zero.

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0 && countZero < 2) {
				countZero++;
				if (countZero == 2) {
					break;
				}
				continue; //If we found first zero - do not include that in product since it would make product zero. instead continue;
			}
			product = product * nums[i]; //calculate product of each non zero element of the array.
		}

		for (int i = 0; i < nums.length; i++) {
			switch (countZero) {
				case 2:  //if there are two zeros, result array would all be zero
					result[i] = 0;
					break;
				case 1: // If there is one zero, then only at the location where zero is , result would have value of product of all the remaining elements in nums, everywhere else result would ahve zero
					if (nums[i] == 0)
						result[i] = product;
					else
						result[i] = 0;
					break;
				case 0: //if there are no zeros, then simply value of result element is the total product devided by ith element in nums.
					result[i] = product / nums[i];
				default:
					break;
			}
		}
		return result;
	}
	public static void main(String args[]){
		int[][] test = new int[][] {{3,6,1,3,6,7},{3,2,4,5},{0,2,3,5},{0,5,6,7,0}};
		long t1 = System.nanoTime();
		for(int[] a:test){
			//int[] b = productExceptSelfMySolution(a);
			int[] b = productExceptSelf(a);
			//System.out.println(Arrays.toString(b));
		}
		long t2 = System.nanoTime();
		System.out.println((t2-t1)/test.length);

	}
}
