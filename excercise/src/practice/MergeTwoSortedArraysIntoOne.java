package practice;

/*
 * 
 * you are given two sorted arrays A and B. A has large enough buffer at the end to accomodate B.
 * Merge A and B in to a.
 */
public class MergeTwoSortedArraysIntoOne {

	public static void mergeTwoArrays(int[]a ,int[]b){
		
		int k = a.length-1;     //index of last element of a
		int i = b.length-1; // index of b's last index
		int j=  a.length-b.length-1; // last element in a's index
		
		while(i>=0 && j>=0){
			if(a[j] <= b[i]){
				a[k--] = b[i--];
			}else{
				a[k--] =a[j--];
			}
		}
		while(i>=0){
			a[k--]=b[i--];
		}
		
	}
	public static void printarray(int[] a){
		for(int i: a){
			System.out.print(i+" ");
		}
	}
	public static void main(String args[]){
		int[] a = new int[]{4,6,7,0,0,0};
		int[] b = new int[]{1,7,9};
		mergeTwoArrays(a,b);
		
		 a = new int[]{10,0,0};
		 b = new int[]{1,5};
		 mergeTwoArrays(a,b);
		 printarray(a);
	}
	
}
