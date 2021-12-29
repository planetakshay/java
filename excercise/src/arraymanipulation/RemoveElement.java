package arraymanipulation;


import java.util.Arrays;

/**
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 *
 *
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args){
        int[][] nums_array = new int[][]{{3,2,2,3},{0,1,2,2,3,0,4,2}};
        int[] val = new int[]{3,2};
        for(int i=0;i<nums_array.length;i++){
                System.out.println("\n\nArray = "+ Arrays.toString(nums_array[i]));
                System.out.println("Val = "+val[i]);
                int elements = removeElement(nums_array[i],val[i]);
                System.out.println("Output = "+elements);
                System.out.println("Array = "+Arrays.toString(nums_array[i]));
        }
    }
}
