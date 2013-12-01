package datastructures;

import java.util.ArrayList;

class Link{
	public int data;
	Link nextLink;
	public Link(int data){
		this.data=data;
	}
	public void printLink(){
		System.out.println("Data = "+data);
	}
	
}

public class LinkListOps {
	Link head = null;
	
	public static void main(String args[]){
		LinkListOps list = new LinkListOps();
		list.addLinkToTail(5);
		list.addLinkToHead(1);
		list.addLinkToHead(2);
		list.addLinkToTail(3);
		list.addLinkToHead(4);
		list.printListData();
		
		
	}
	public void addLinkToHead(int data){
		
			Link link = new Link(data);
			link.nextLink = head;
			head =link;
			
		
	}
	public void addLinkToTail(int data){
		Link currentLink = head;
		if(currentLink == null){
			addLinkToHead(data);
			return;
		}
		Link prevLink = null;
		while(currentLink !=null){
			prevLink = currentLink;
			currentLink = currentLink.nextLink;
		}
		Link link = new Link(data);
		prevLink.nextLink =link;
		link.nextLink=currentLink;
		
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
	public ArrayList getLinkListData(){
		ArrayList<Integer> al = new ArrayList<Integer>();
		Link l = head;
		while(l !=null){
			al.add(l.data);
			l = l.nextLink;
		}
		return al;
	}
}
