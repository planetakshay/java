package practice;

import SortingAndSearching.BinarySearch;

public class BinarySearchOne {
	
	public static int binarySearch(int[] a, int min, int max,int value){
		if(min>max) return -1;
		int middle = (min+max)/2;
		if(a[middle]==value){
			return middle;
		}else if(value<a[middle]){
			return binarySearch(a,min,middle-1,value);
		}else if(value>a[middle]){
			return binarySearch(a,middle+1,max,value);
		}
		return -1;
	}
	
	public static void main (String args[]){
		int[] a = new int[]{5,6,7,8,9,11,15,17};
		BinarySearchOne bs = new BinarySearchOne();
		
		System.out.println(bs.binarySearch(a, 0, a.length, 5));
		System.out.println(bs.binarySearch(a, 0, a.length, 17));
		System.out.println(bs.binarySearch(a, 0, a.length, 11));
		System.out.println(bs.binarySearch(a, 0, a.length, 6));
		System.out.println(bs.binarySearch(a, 0, a.length, 10));
	}
}
