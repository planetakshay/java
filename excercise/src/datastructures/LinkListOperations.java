package datastructures;


class LinkList{
	
	private Link head;
	LinkList(){
		head=null;
	}
	public boolean isEmpty(){
		return head==null;
	}
	public void addNode(int data){
		
		Link link = new Link(data);
		link.nextLink = head;
		head = link;
	}

	public void printListData(){
		Link currentLink= head;
		System.out.println("List:");
		while(currentLink !=null){
			currentLink.printLink();
			currentLink = currentLink.nextLink;
		}
		System.out.println(" --- ");
	}
}


public class LinkListOperations {

	
	public static void main(String args[]){
		
		LinkList myList = new LinkList();
		myList.addNode(1);
		myList.addNode(2);
		myList.printListData();
				
	}
	
}

