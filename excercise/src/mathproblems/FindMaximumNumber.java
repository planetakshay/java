package mathproblems;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given an integer array find maximum number in the array
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
			if(ary[i] > max2 && ary[i] <max1){
				max2 = ary[i];
				continue;
			}
			if(ary[i] > max1){
				max1 = ary[i];
			}
		}
		
		twoMax.add(max1);
		twoMax.add(max2);
		return twoMax;
	}
		
	
	public static void main(String ary[]){
		int[] array = {3,1,4,7,6,3};
		System.out.println(getMax(array));
		System.out.println(getTwoMax(array));
		System.out.println(getTwoMaxOneForLoop(array));
		
	}
	
}
