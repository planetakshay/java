package arraymanipulation;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums){
		Set<Integer> set = new HashSet<Integer>();
		for(int i:nums){
			if(!set.add(i)) return true;
		}
		return false;
	}
	public static void main(String args[]){
		int nums[] = new int[]{1,4,5,7,5};
		System.out.println(containsDuplicate(nums));

	}
}
