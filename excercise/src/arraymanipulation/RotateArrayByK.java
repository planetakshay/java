package arraymanipulation;

import java.util.Arrays;

/**
 *
 * Rotate an array of n elements to the right by k steps.

 For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 *
 */
public class RotateArrayByK {


	//Following is a brute force method and works ok however the time complexity is n^2 and that is not an efficient solution.

	public static void rotate(int[] nums,int k){
		k = k%nums.length; // This is to make sure that if supplied k is more than value of the length of the array we only rotate for the difference /remainder.
		// for exmple if you rotate 5 times an array that is 4 in length you are essentially only rotating it 1 place. [ 5-4 ]
		for(int i=0;i<k;i++){
			int tmp = nums[nums.length-1];
			for(int j=nums.length-1;j>0;j--){
				nums[j]=nums[j-1];
			}
			nums[0]=tmp;
		}
	}

	/**
	 * Efficient Way
	 * The basic idea is that, for example, nums = [1,2,3,4,5,6,7] and k = 3, first we reverse [1,2,3,4], it becomes[4,3,2,1]; then we reverse[5,6,7], it becomes[7,6,5], finally we reverse the array as a whole, it becomes[4,3,2,1,7,6,5] ---> [5,6,7,1,2,3,4].
	 * Reverse is done by using two pointers, one point at the head and the other point at the tail, after switch these two, these two pointers move one position towards the middle.
	 */

	public static void rotateWithReverse(int[] nums,int k){

		if(nums==null|| nums.length==0|| nums.length==1) return;
		reverse(nums,0,nums.length-k-1);
		reverse(nums,nums.length-k,nums.length-1);
		reverse(nums,0,nums.length-1);
	}

	public static void reverse(int[] nums,int start,int end){
		if(start>end) return;
		int tmp=0;
		while(start<end) {
			tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			start++;
			end--;
		}
	}
	public static void main(String args[]){
		int [][] test = new int[][]{{2,3,4,5},{2,3,4,5,6,7},{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}};
		int [][] test1 = new int[][]{{2,3,4,5},{2,3,4,5,6,7},{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}};

		int size = 125000;

		int [] testBruteForce = new int[size];
		int [] testEfficient = new int[size];
		for(int i=0;i<size;i++){
			testBruteForce[i]=i;
			testEfficient[i]=i;
		}

		for(int[] nums: test){
			rotate(nums,2);
			System.out.println(Arrays.toString(nums));
		}
		long t1=System.currentTimeMillis();
		rotate(testBruteForce,size/2);
		long t2=System.currentTimeMillis();
		System.out.println(Arrays.toString(testBruteForce));
		System.out.println("Time takenvia brute force="+ (t2-t1)+ " miliseconds");

		///////////Now using efficient method
		for(int[] nums: test1){
			rotateWithReverse(nums,2);
			System.out.println(Arrays.toString(nums));
		}
		long t3=System.currentTimeMillis();
		rotateWithReverse(testEfficient,size/2);
		long t4=System.currentTimeMillis();
		System.out.println(Arrays.toString(testEfficient));
		System.out.println("Time taken for efficient solution ="+ (t4-t3)+" milisoconds");

	}

}
