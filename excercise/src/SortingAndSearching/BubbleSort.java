package SortingAndSearching;

import java.util.Arrays;

/**
 * implement a simple bubble sort method
 * @author Akshay
 *
 */
public class BubbleSort {
	
	public static void sort(int x[]){
		
		 
		    for (int pass=1; pass < x.length; pass++) {  // count how many times
		        // This next loop becomes shorter and shorter
		        for (int i=0; i < x.length-pass; i++) {
		            if (x[i] > x[i+1]) {
		                // exchange elements
		                int temp = x[i];  
		                x[i] = x[i+1];  
		                x[i+1] = temp;
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
