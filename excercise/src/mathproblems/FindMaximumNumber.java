package mathproblems;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given an integer array find maximum number in the array
 * 
 * Also given an integer array find the two maximum number
 * max1 is maximum / largest number
 * max2 is second largest number
 * 
 * @author akshayd094
 *
 */
public class FindMaximumNumber {
	
	//returns the maximum amount.
	public static int getMax(int[] ary){
		if(ary.length <= 0) return 0;
	
		int max = ary[0];
		for(int i = 1;i<ary.length;i++){
			if(ary[i] >= max){
				max = ary[i];
			}
		}
		
		return max;
	}
	
	//Method-1 but uses two for loops.
	public static List<Integer> getTwoMax(int[] ary){
	
		List<Integer> twoMax = new ArrayList<Integer>();
		int max1=ary[0];
		int max2 = ary[0];
		int maxIndex=0;
		for(int i=1;i<ary.length;i++){
			
			if(ary[i] > max1){
				max1 = ary[i];
				maxIndex = i;
			}
		}
		for(int i=1;i<ary.length;i++){
			if(i!= maxIndex){	
				if(ary[i] > max2){
					max2 = ary[i];
				}
			}
		}
		twoMax.add(max1);
		twoMax.add(max2);
		return twoMax;
	}
	
	// Most efficient way of doing this. uses one for loop.
	public static List<Integer> getTwoMaxOneForLoop(int[] ary){
		
		List<Integer> twoMax = new ArrayList<Integer>();
		
		int max1=Math.max(ary[0], ary[1]);
		int max2=Math.min(ary[0], ary[1]);
		int diff = Math.abs(max1-max2);	
		for(int i=1;i<ary.length;i++){
			
			if(ary[i] > max2 && ary[i] <max1){ // if we find a value thats between max2 and max1 then we only need to update max2.
				max2 = ary[i];
				continue; //We do not need any more processing of this array element - so skip the for loop
			}
			if(ary[i] > max1){ //If we find a number thats greater than max1 then we need to update both of our values.
				
				max2 = max1;
				max1 = ary[i];
				
			}
		}
		
		twoMax.add(max1);
		twoMax.add(max2);
		return twoMax;
	}
		
	
	public static void main(String ary[]){
		//max1 is largest number, max2 is second largest 
		//TestDat - 1. max 2 is to the right of max 1, 2. max2 is to the left of max 1, 3. only two numbers 
		//4. negative numbers and 0 with max1 and max2 both positive 5. max1 positive max2 negative
		int[][] testData = {{3,1,4,7,6,3},{3,1,4,6,7,9,0},{4,0},{-3,-4,-4,3,0},{-3,-4,-4,3,-10}};
		
		for(int[] array: testData){
			 for(int i: array) System.out.print( " "+i+"" );
			 System.out.println();
			System.out.println(getTwoMaxOneForLoop(array));
		}
	}
	
}
