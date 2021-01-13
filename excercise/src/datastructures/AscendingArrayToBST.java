package datastructures;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 */
class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	TreeNode(int value){ this.value=value;}
}

class Solution{

	public TreeNode sortedArrayToBST(int[] nums){
		TreeNode head = convert(0,nums.length-1,nums);
		return head;
	}

	public TreeNode convert(int low,int high,int[] nums){
		if(low > high){
			return null;
		}
		int  mid = (low+high)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left=convert(low,mid-1,nums);
		node.right=convert(mid+1,high,nums);
		return node;
	}
}

public class AscendingArrayToBST {
		static int[][] nums = new int[][] {{ 1,3,5,6,7},{2,5,7,9,11,14},{0,1},{0},{99,101,130,1000,1001}};
		Solution solution = new Solution();
		public static void main(String args[]){
			AscendingArrayToBST ascendingArrayToBST = new AscendingArrayToBST();

			for(int[] num: nums ){
				System.out.println();
				Queue<TreeNode >  nodes = new LinkedList<>();
				nodes.add(ascendingArrayToBST.solution.sortedArrayToBST(num));

				while(!nodes.isEmpty()){
					TreeNode node = nodes.remove();
					System.out.print(" "+node.value+" ");
					if(node.left!=null) nodes.add(node.left);
					if(node.right!=null) nodes.add(node.right);
				}
			}

		}
}
