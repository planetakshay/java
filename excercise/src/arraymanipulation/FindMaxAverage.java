package arraymanipulation;
/**
You are given an integer array nums consisting of n elements, and an integer k.

        Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.



        Example 1:

        Input: nums = [1,12,-5,-6,50,3], k = 4
        Output: 12.75000
        Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
        Example 2:

        Input: nums = [5], k = 1
        Output: 5.00000
 **/
public class FindMaxAverage {
    public static double findMaxAverage(int[] nums, int k) {
        double max_avg=Integer.MIN_VALUE;
        double total=0;
        if(nums.length == 0 || k > nums.length) {
            return 0;
        }
        for(int i=0;i<nums.length;i++) {
            total += nums[i];
            if (i >= k - 1) {
                max_avg = Math.max(total / k, max_avg);
                total = total - nums[i - k + 1];
            }
        }
        return max_avg;
    }
    public static void main(String[] args){
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }

}
