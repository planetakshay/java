package StringOperations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
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

public class AnagramGroupFreq {
	
	
	public static String sort(String str){
		char[] c = str.toCharArray();
		Arrays.sort(c);
		return String.valueOf(c);
	}
	public static void main(String[] args){
		
		String[] list = new String[]{"i love java","ADD" , "DAD" , "TOY", "ABC" , "ACB", "BAC" , "XYZ", "XYY" , "YYX" };
		Map<String,String> anaMap = new HashMap<String,String>();
        for (String str : list) {
            String key = AnagramGroupFreq.sort(str);
            String value = "";
            if (anaMap.containsKey(key)) {
                value = anaMap.get(key);
                value = value + "," + str;
                anaMap.put(key, value);
            } else {
                value = str;
                anaMap.put(key, value);
            }
        }
		for(Map.Entry<String, String> entry: anaMap.entrySet()){
			System.out.println(" Key = "+entry.getKey() + " and Value ->"+entry.getValue().toString());
		}
	}
	
}
