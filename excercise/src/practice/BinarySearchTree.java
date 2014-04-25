package practice;

import java.util.LinkedList;
import java.util.Queue;


class TreeStruct{
	int data;
	TreeStruct left;
	TreeStruct right;
}
public class BinarySearchTree {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		TreeStruct node = null;
	}
	
	public TreeStruct insert(TreeStruct node,int value){
		if(node==null){
			node = new TreeStruct();
			node.data=value;
		}else{
			if(value< node.data){
				return insert(node.left, value);
			}else if(value>node.data){
				return insert(node.right,value);
			}
		}
		return node;
	}

	public void printTreeLaers(TreeStruct root){
		
		Queue<TreeStruct> queue = new LinkedList<TreeStruct>();
		queue.add(root);
		TreeStruct node;
		while(!queue.isEmpty()){
			node = queue.poll();
			if(node.left!=null){
				queue.add(node.left);
			}
			if(node.right!=null){
				queue.add(node.right);
			}
		}
		
	}
	
	public int heightLeft(TreeStruct root){
		if(root==null){
			return 0; 
		}else{
			return 1+heightLeft(root.left);
		}
	}
	
	public int heightRight(TreeStruct root){
		if(root==null){
			return 0;
		}else{
			return 1+heightRight(root.right);
		}
		
	}

	public int maxDepth(TreeStruct root){
		if(root==null){
			return 0;
		}
		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	public int minDepth(TreeStruct root){
		if(root==null){
			return 0;
		}
		return 1+Math.min(minDepth(root.left), minDepth(root.right));
	}
	
	public int treeDiameter(TreeStruct node){
		if(node==null){
			return 0;
		}
		int lHeight = heightLeft(node.left);
		int rHeight = heightRight(node.right);
		int ldiameter = treeDiameter(node.left);
		int rdiameter = treeDiameter(node.right);
		return Math.max(lHeight+rHeight+1, Math.max(ldiameter,rdiameter));
	}
	
	public TreeStruct lowestCommonAncenstor(TreeStruct root,int value1,int value2){
		while(root!=null){
			if(value1<root.data && value2<root.data){
				root = root.left;
			}else if(value1>root.data && value2>root.data){
				root = root.right;
			}else{
				return root;
			}
		}
		return null;
	}
}

