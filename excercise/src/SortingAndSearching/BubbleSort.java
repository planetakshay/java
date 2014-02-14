package SortingAndSearching;

import java.util.Arrays;

/**
 * implement a simple bubble sort method
 * @author Akshay
 *
 */
public class BubbleSort {
	
	public static void sort(int a[]){
		
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a.length;j++){
				if(a[i]<a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j]=temp;
				}
			}
			
		}
		
	}
	
	public static void printarray(int[] a){
		for(int i: a){
			System.out.print(i+" ");
		}
	}
	public static void main(String args[]){
		int[] a = new int[]{8,4,6,34,22,11,6,0};
		sort(a);
		printarray(a);
	}
	
}
