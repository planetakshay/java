package arraymanipulation;

import java.util.Arrays;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicates {




	public static int removeDuplicates(int[] nums){

		if(nums.length==0 || nums.length==1) return nums.length;
		int id=1;   // Key of the  algorithm is to maintain another index and use that to fill up the array

		int len = nums.length;

		for(int i=1;i<len;i++)
				// fill up the array using id as index while compare it using index i. if current element is not same as previous one then only add it to the array
				if(nums[i]!=nums[i-1]) nums[id++]=nums[i];
		return id;
	}


	public static void main(String args[]){

		int[][] nums = new int[][]{{1,1,3},{1,2,3,4,4,5,6,6,7}};
		for(int[] num: nums){
			int  result = removeDuplicates(num);
			System.out.println("Result = " +result +"   " +Arrays.toString(num));
		}
	}

}
