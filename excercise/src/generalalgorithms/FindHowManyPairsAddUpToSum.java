package generalalgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;



/** 
 * 
 * Given an unsorted array of integers and a given sum find number of pairs in the array
 * that would add up to that sum
 * 
 * @author akshayd094
 *
 */
public class FindHowManyPairsAddUpToSum {

	
	Map<Integer,Integer> numberOfPairs = new HashMap<Integer,Integer>(); // For a given sum, store number of pairs that exist
	List<Integer> data = new ArrayList<Integer>();  // List that stores all the data for which pair sums are stored
	
	//As the new array elements are stored .. iterate over all previous data and get the sum. Store that as a key and increase the freq at which the
	// the pair has been calculated to have the given sum
	public void store(int number){ 
		
		if(data.size()>0){
			for(int i: data){
				//Now find out if a numberOfPairs map has a key that is for the current sum
				int freq=0;
				if(numberOfPairs.containsKey(i+number)){
					freq = numberOfPairs.get(i+number);
				}
				numberOfPairs.put(i+number, ++freq);
			}
		}
		data.add(number);
		
	}
	
	public int getNumberOfPairs(int sum){
		if(numberOfPairs.containsKey(sum)){
			return numberOfPairs.get(sum);
		}
		return 0;
	}
	public static void main(String args[]){
		int[] array = new int[]{2,3,6,1,5,3,4,0};
		FindHowManyPairsAddUpToSum findHowManyPairs = new FindHowManyPairsAddUpToSum();
		for( int i : array){
			findHowManyPairs.store(i);
		}
		System.out.println("Sum = 6. number of pairs that add up to 6 are "+findHowManyPairs.getNumberOfPairs(6));
		System.out.println("Sum = 4. number of pairs that add up to 4 are "+findHowManyPairs.getNumberOfPairs(4));
	}
	
	
}
