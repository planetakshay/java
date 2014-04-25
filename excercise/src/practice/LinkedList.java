package practice;

//import datastructures;

class Link{
	int data;
	Link nextLink;
	Link(int data){
		this.data=data;
	}
	public void printLink(){
		System.out.println("data="+data);
	}
}

public class LinkedList{
	Link head=null;
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		
		
		list.addLinkToTail(5);
		list.addLinkToHead(1);
		list.addLinkToHead(2);
		list.addLinkToTail(3);
		list.addLinkToHead(4);
		list.printListData();
		
		
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
	public Link addLinkToHead(int data){
		Link link = new Link(data);
		link.nextLink=head;
		head = link;
		return head;
	}
	
	public Link addLinkToTail(int data){
		Link link = new Link(data);
		Link currentLink = head;
		if(currentLink==null){
			addLinkToHead(data);
			return head;
		}
		Link prev=null;
		while(currentLink!=null){
			prev = currentLink;
			currentLink = currentLink.nextLink;
		}
		
		

		prev.nextLink=link;
		link.nextLink=currentLink;
		return head;
	}
}