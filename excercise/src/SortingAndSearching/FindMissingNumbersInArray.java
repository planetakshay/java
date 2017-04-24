package SortingAndSearching;
/**
 * Find missing elements in an array
 * @author Akshay
 *
 */

import java.util.*;

public class FindMissingNumbersInArray {

	public static void printMissingNumberUsingSortAndWhile(int[] a ){
		Arrays.sort(a);// You could use quick sort for that.
		int j=0;
		for(int i=0;i<=a[a.length-1];i++){
			//if array element matches i, then if there are more elements with same value, increment j index
			if(a[j]==i ){
				while(j<a.length && a[j]==i  ) j++; 
				continue;
			}
			else{ //if i does not match with a[j] then just print it
				System.out.print(i+" ");
			}
		}
		System.out.println("printMissingNumberUsingSortAndWhile is complete");
	}
	public static void printMissingNumbersUsingSort(int[] a){
		Arrays.sort(a);// You could use quick sort for that.
		int j=0;
		int lastFoundIndex=0;
		for(int i=0;i<=a[a.length-1];i++){
			boolean found =false;
			for(j=lastFoundIndex;j<a.length;j++){
				if(a[j]==i){  //if we find the number in array, turn on the flag, store the index and break
					found=true;
					lastFoundIndex = j;
					break;
				}
				if(a[j]>i) break; // if the array element is already greater than i, break;
			}
			if(!found){
				System.out.print(i+" ");
			}	
		}
		System.out.println("printMissingNumbersUsingSort complete");
	}
	
	public static void printMissingNumbersUsingMap(int[]a){
		
		Map<Integer,Boolean> freqMap = new HashMap<Integer,Boolean>();
		int max=0;
		for(int i=0;i<a.length;i++ ){
			if(a[i]>max){ // This max variable is to ultimately find out what the last number in array is. This is used in the for loop next that prints the missing numbers
				max=a[i];
			}
			if(!freqMap.containsKey(a[i])){
				freqMap.put(a[i], true);
			}
		}
		for(int i=0;i<=max;i++){
			if(!freqMap.containsKey(i)){
				System.out.print(i+" ");
			}
		}
		System.out.println("printMissingNumbersUsingMap is complete");	
	}
	public static void main(String args[]){
		
		int[] a = new int[]{2,5,1,3,3,10,7,15};
		printMissingNumberUsingSortAndWhile(a);
		printMissingNumbersUsingSort(a);
		printMissingNumbersUsingMap(a);
		
		a = new int[]{2,15,7,5,1,10,7,15};
		printMissingNumberUsingSortAndWhile(a);
		printMissingNumbersUsingSort(a);
		printMissingNumbersUsingMap(a);
	}
	
	
}
