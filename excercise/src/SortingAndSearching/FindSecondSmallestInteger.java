package SortingAndSearching;

import junit.framework.Assert;



/*
 * Write a method to find the second-smallest integer in an array of integers.
 * Use Junit tests to exercise the method.
 *
 * Example:
 *   int[] values = { 5, 7, -3, -8, 9 };
 *   int secondSmallest = -3;
 *
 */
public class FindSecondSmallestInteger {
	static int smallest,secondSmallest;
	
	public static void setVariables(int i,int j){
		if(i<=j){
			smallest=i;
			secondSmallest=j;
		}else{
			smallest=j;
			secondSmallest=i;
		}
		
	}
	public static int findSecondSmallest(int[] values){
		
		int i=0;
		setVariables(values[i],values[i+1]);
		
		for(i=2;i<values.length;i++){
			if(values[i]<smallest){
				secondSmallest=smallest;
				smallest=values[i];
				
			}
			if(values[i]>smallest && values[i]<secondSmallest){
				secondSmallest=values[i];
			}
		}		
		return secondSmallest;
	}

	public static void main(String args[]){
		
		final int[][] testData ={
				{ 2, 9, 10, 3, 15 },
				{  5, 7, -3, -10, 9},
				{ 5, 7, 9, -10, -3 },
				{ -3, 5, 7,-8, 9, -10 },
				{ -3, 5, -10, 7, -3, 9, -10,-5 },
				{ 5, -10, 7, -3, 9, -10 },
				{ 5, -10, 7, -3, 9, -3 },
				{ 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69 },
				{3,4,5,6},
				{-3,-4,-5,-6},
				{0,0,0}
		}; 
		for(int[] values: testData){
			final int result = FindSecondSmallestInteger.findSecondSmallest(values);
			System.out.println(result);
		}
	    
	    
	}
	
}
 