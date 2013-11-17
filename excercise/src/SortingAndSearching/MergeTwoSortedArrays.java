package SortingAndSearching;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	//Given two sorted array, merge them in ascending order
	public int[] merge(int[] a, int[] b){
		int m= a.length;
		int n= b.length;
		int[] mergedArray = new int[m+n];
		int i=m-1; //index of last element in a
		int j=n-1;// index of last element in b
		int k=m+n-1; //index of last element of merged array
		//while loop until the smallest size array is exhausted
		while(i>=0 && j>=0){
			if(a[i] >= b[j]){ // if the element in a is greater, put that a[i] in merged array.
				mergedArray[k--]=a[i--];
			}else{ // if b[j] is greater, put b[j] in to mergedArray
				mergedArray[k--]=b[j--];
			}
			
		}
		if(i>=0){ // if a was a bigger array, put the remaining elements in merged array
			while(i>=0){
				mergedArray[k--] = a[i--];
			}
		}
		if(j>=0){ // if b was a bigger array, put the remaining elements in merged array
			while(j>=0){
				mergedArray[k--]= b[j--];
			}
		}
		return mergedArray;
	}

	public static void main(String args[]){
		int[] a = new int[]{4,7,9};
		int[] b = new int[]{1,10,11};
		int[] merged = new MergeTwoSortedArrays().merge(a, b);
		System.out.println(Arrays.toString(merged));
	}
}
