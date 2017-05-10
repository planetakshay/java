package arraymanipulation;

import java.util.*;

/**
 * Shuffle a set of numbers without duplicates.
 * // Init an array with set 1, 2, and 3.
 int[] nums = {1,2,3};
 Solution solution = new Solution(nums);

 // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
 solution.shuffle();

 // Resets the array back to its original configuration [1,2,3].
 solution.reset();

 // Returns the random shuffling of array [1,2,3].
 solution.shuffle();
 */


class ShuffleAnArray {
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	int[] nums;
	public ShuffleAnArray(int[] nums) {
		this.nums = nums;
		for(int i=0;i< nums.length;i++){
			map.put(i,nums[i]);
		}

	}

	private int getRandom(){
		return (int)Math.floor(Math.random()*nums.length); // Gives me random number from 0 to nums.length-1
	}
	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return nums;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		Set<Integer> indexSet = new HashSet<Integer>();
		int [] shuffled = new int[nums.length];
		for(int i=0;i<shuffled.length;i++){
			int index=0;
			boolean uniqueIndexFound = false;
			while(!uniqueIndexFound){
				index = getRandom();
				if(indexSet.add(index)) uniqueIndexFound=true;
			}
			if(map.containsKey(index)){
				shuffled[i] = map.get(index);
			}
		}
		return shuffled;

	}
}

public class ShuffleArray {

	public static void main(String args[]){

		int nums[] = new int[]{1,2,3,4,5,10};
		ShuffleAnArray shuffleAnArray = new ShuffleAnArray(nums);
		System.out.println(Arrays.toString(shuffleAnArray.shuffle())+ Arrays.toString(shuffleAnArray.reset())+Arrays.toString(shuffleAnArray.shuffle()));
	}


}
