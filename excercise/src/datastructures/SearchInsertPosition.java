package datastructures;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * Example 4:
 *
 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 * Example 5:
 *
 * Input: nums = [1], target = 0
 * Output: 0
 *
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length, m;
        while(l<r){
            m = (l+r)/2;
            if(nums[m]<target)l=m+1;
            else r=m;
        }
        return l;
    }



    public static void main(String[] args){
        int[] nums = new int[]{1,3,5,6};
        int[] targets = new int[]{5,2,7,0};

    }
}
