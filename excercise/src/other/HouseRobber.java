package other;

/**
 *
 *You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of
 * money you can rob tonight without alerting the police.
 *
 * SOLUTION:
 *
 *
 * For every house k, there are two options: either to rob it (include this house: i) or not rob it (exclude this house: e).
 * Include this house:
 * i = num[k] + e (money of this house + money robbed excluding the previous house)
 * Exclude this house:
 * e = max(i, e) (max of money robbed including the previous house or money robbed excluding the previous house)
 (note that i and e of the previous step, that's why we use tmp here to store the previous i when calculating e, to make O(1) space)
 */
public class HouseRobber {

	public static int rob(int[] nums){
		int i = 0; //include this house
		int e = 0; //money robbed excluding previous houe

		for(int k=0;k<nums.length;k++){
			int tmp = i;
			i = nums[k] +e;
			e = Math.max(tmp,e);
		}
		return Math.max(i,e);



	}
	public static void main(String args[]){
		int nums[] = new int[] {1000,2000,3000,10000,11000,500};

		System.out.println("Maximum money that can be robbed = "+rob(nums));
	}
}

