package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramFreq {
	public static String sort(String s){
		char[] c = new char[s.length()];
		c = s.toCharArray();
		Arrays.sort(c);
		return String.valueOf(c).replace(" ", "");
	}
	public static void main(String args[]){
		String[] list = new String[]{"i love java","ADD" , "DAD" , "TOY", "ABC" , "ACB", "BAC" , "XYZ", "XYY" , "YYX" };
		Map<String,String> anaGroup = new HashMap<String,String>();
		
		for(String s: list){
			String sorted =sort(s);
			String value="";
			if(anaGroup.containsKey(sorted)){
				value = anaGroup.get(sorted);
				value = value+","+s;
				anaGroup.put(sorted, value);
			}
			else{
				value = sort(s);
				anaGroup.put(sorted, value);
			}
		}
		for(Map.Entry<String, String> e: anaGroup.entrySet()){
			System.out.println(e.getValue());
		}
		
	}
}
