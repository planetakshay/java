package datastructures;

import java.util.ArrayList;

class Link{
	public int data;
	Link nextLink;
	public Link(int data,int index){
		this.data=data;
	}
	public Link(int data){
		this.data=data;
	}
	public void printLink(){
		System.out.println("Data = "+data);
	}
	
}
public class LinkListOps {
	Link head = null;
	
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
