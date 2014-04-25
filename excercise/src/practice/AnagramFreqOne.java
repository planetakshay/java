package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * Google interview 2007
 * 
 * Basically given an array of strings, find which strings are anagrams and
 * group them and print them.
 * 
 * Given input array of:
 * ADD , DAD , TOY, ABC , ACB, BAC , XYZ, XYY , YYX 
 * 
 * Output should be:
 * ADD, DAD
 * TOY
 * ABC, ACB, BAC
 * XYZ, XYY, YYX
 * 
 * @author Akshay
 *
 */

public class AnagramFreqOne {

	public static void main(String args[]){
		
		String[] inputArray = new String[]{"ADD" , "DAD" , "TOY", "ABC" , "ACB", "BAC" , "XYZ", "XYY" , "YYX" };
		Map<String,String> myMap = new HashMap<String,String>();
		for(String s: inputArray){
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String sSorted = String.valueOf(ch);
			if(myMap.containsKey(sSorted)){
				myMap.put(sSorted, myMap.get(sSorted)+" "+s);
			}else{
				myMap.put(sSorted, s);
			}
		}

		for(Map.Entry<String, String> entrySet: myMap.entrySet()){
			System.out.println(entrySet.getValue());
		}
		
	}
	
	
}
