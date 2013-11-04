package datastructures;

public class BinarySearchTree {
	
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		TreeStructure node=null;
		
	}

	public TreeStructure insert(TreeStructure node, int value){
		
		if(node==null){
			node = new TreeStructure();
			node.data=value;
			
		}else{
			if(node.data < value){
				node.right = insert(node.right,value);
			}
			if(node.data >= value){
				node.left = insert(node.left,value);
			}
		}
		
		return node;
	}
}

class TreeStructure{
	int data;
	TreeStructure left;
	TreeStructure right;
	
}