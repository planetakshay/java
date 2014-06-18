package SortingAndSearching;
/**
 * Find missing elements in an array
 * @author Akshay
 *
 */

import java.util.*;

public class FindMissingNumbersInArray {

	public static void printMissingNumbersUsingSort(int[] a){
		Arrays.sort(a);// You could use quick sort for that.
		int j=0;
		int lastFoundIndex=0;
		for(int i=0;i<=a[a.length-1];i++){
			boolean found =false;
			for(j=lastFoundIndex;j<a.length;j++){
				if(a[j]==i){
					found=true;
					lastFoundIndex = j;
				}
			}
			if(!found){
				System.out.print(i+" ");
			}	
		}
		System.out.println();
	}
	
	public static void printMissingNumbersUsingMap(int[]a){
		
		Map<Integer,Boolean> freqMap = new HashMap<Integer,Boolean>();
		int max=0;
		for(int i=0;i<a.length;i++ ){
			if(a[i]>max){
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
		System.out.println();	
	}
	public static void main(String args[]){
		
		int[] a = new int[]{2,5,1,3,3,10,7,15};
		printMissingNumbersUsingSort(a);
		printMissingNumbersUsingMap(a);
		a = new int[]{2,15,7,5,1,10,7,15};
		printMissingNumbersUsingSort(a);
		printMissingNumbersUsingMap(a);
	}
	
	
}
