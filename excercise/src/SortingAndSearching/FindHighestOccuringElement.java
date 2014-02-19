package SortingAndSearching;

import java.util.Arrays;

/**
 * Given a SORTED array find which element occurs most number of times
 * 
 * @author Akshay
 *
 */

public class FindHighestOccuringElement {
	
	public static int findHighestOccuringElement(int[] array){
		int i=0;
		if (array == null)
			return Integer.MIN_VALUE;
		Arrays.sort(array);
		for(int j: array){
			System.out.print(j+",");
		}
		System.out.println();
		
		int majorIndex=0;
		int maxCountSofar=0;
		int currentElmCount=1;
		//note that array traversal starts with 1. Since array[i-1] could result in error if i=0;
		for( i=1;i<array.length;i++ ){
			//increment the current element count when previous element and current element are same
			if(array[i]==array[i-1]){
				currentElmCount++;
			}else if(array[i]!=array[i-1]){ //reset the current element count when current element is different from previous one
				currentElmCount=1;
			}
			//Every time check if the current element counter is greater than max so far. if so reset the index and update max count so far
			if(currentElmCount>maxCountSofar) {
				majorIndex=i;
				maxCountSofar =currentElmCount;
			}
		}
		System.out.println("maxCount="+maxCountSofar);
		System.out.println(array[majorIndex]);
		return majorIndex;
	}
	public static void printResults(int[]array){
		int index = findHighestOccuringElement(array);
		System.out.println("Element at index "+index+" occurs highest number of time and"
				+ "that element is "+array[index]);
	}
	public static void main(String args[]){
		int[] array = new int[]{2,3,4,3,4,2,2,8};
		printResults(array);
		array = new int[]{2,2,2,2,3,3,4,4,8};
		printResults(array);
		array = new int[]{2,3,3,4,4,5,5,5,5,8};
		printResults(array);
		array = new int[]{2,2,2,2,3,3,4,4,5,5,5,5,5,6,6,7,7,9};
		printResults(array);
		array = new int[]{2,2,3,3,4,4,5,6,6,7,7,9,9,9,9,9};
		printResults(array);
	}
}
