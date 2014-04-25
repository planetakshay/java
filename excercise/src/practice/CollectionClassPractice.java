package practice;

import java.util.ArrayList;

public class CollectionClassPractice {

	public static ArrayList<Integer> printArraList(int n){
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		while(n>0){
			mylist.add(n--);
		}
		return mylist;
	}
	
	public static void main(String args[]){
		ArrayList<Integer>mylist = printArraList(100);
		int n=99;
		while(n >0){
			System.out.println(mylist.get(n--));
		}
	}
}
