package datastructures;

import java.util.LinkedList;
import java.util.Queue;



class TreeStructure{
	int data;
	TreeStructure left;
	TreeStructure right;
}
public class BinarySearchTree {
	
	public int treeDiameter(TreeStructure node){
		
		if(node==null){
			return 0;
		}
		int lHeight = heightLeft(node.left);
		int rHeight = heightRight(node.right);
		int lDiameter = treeDiameter(node.left);
		int rDiameter = treeDiameter(node.right);
		return Math.max(lHeight+rHeight+1, Math.max(lDiameter, rDiameter));
		
	}
	public int minDepth(TreeStructure node){
		if(node==null){
			return 0;
		}
		return 1+Math.min(minDepth(node.left), minDepth(node.right));
	}
	public int maxDepth(TreeStructure node){
		if(node==null){
			return 0;
		}
		return 1+Math.max(maxDepth(node.left),maxDepth(node.right));
	}
	public int heightRight(TreeStructure node){
		if(node==null){
			return 0;
		}
		return 1+heightRight(node.right);
	}
	public int heightLeft(TreeStructure node){
		if(node==null){
			return 0;
		}
		return 1+heightLeft(node.left);
	}
	public void inOrderTraversal(TreeStructure node ){
	
		if(node == null) return;
		inOrderTraversal(node.left);
		System.out.println(node.data+" ");
		inOrderTraversal(node.right);
	}
	public void printAllLayers(TreeStructure node){
		System.out.println("Printing All Layers");
		
		Queue<TreeStructure> queue = new LinkedList<TreeStructure>();
		queue.add(node);
		while(!queue.isEmpty()){
			node =queue.poll();
			System.out.println(node.data+" ");
			if(node.left!=null){
				queue.add(node.left);
			}
			if(node.right!=null){
				queue.add(node.right);
			}
		}
		
	}
	public TreeStructure insert(TreeStructure node,int value){
		
		if(node==null){
			node = new TreeStructure();
			node.data  = value;
		}else if(value<node.data){
			node.left = insert(node.left,value);
		}else if(value>node.data){
			node.right = insert(node.right,value);
		}
		return node;
	}
	public static void main(String args[]){
		TreeStructure rootNode = null;
		TreeStructure node =null;
		BinarySearchTree bst = new BinarySearchTree();
		node = bst.insert(rootNode,20);
		TreeStructure root = node;
		node = bst.insert(node,10);
		node = bst.insert(node, 5);
		node = bst.insert(node, 30);
		node = bst.insert(node, 25);
		node = bst.insert(node, 35);
		node = bst.insert(node, 45);
		node = bst.insert(node, 55);
		System.out.println();
		bst.printAllLayers(root);
		System.out.println("In order Traversal");
		bst.inOrderTraversal(node);
		System.out.println("Height Left");
		System.out.println(bst.heightLeft(root));
		System.out.println("Height Right");
		System.out.println(bst.heightRight(root));
		System.out.println("Tree Diameter");
		System.out.println(bst.treeDiameter(root));
	}
}
