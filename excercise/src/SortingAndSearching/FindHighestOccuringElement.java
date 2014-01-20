package SortingAndSearching;

import java.util.Arrays;

/**
 * Given an array find which element occurs most number of times
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
		int currentElmCount=0;
		for( i=0;i<array.length;i++ ){
			if(array[majorIndex]==array[i] ){
				currentElmCount++;
			}else if(array[i]!=array[i-1]){
				currentElmCount=1;
			}else if(array[i]==array[i-1]){
				currentElmCount++;
			}
			
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
	}
}
