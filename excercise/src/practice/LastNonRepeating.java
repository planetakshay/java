package practice;

import java.util.HashMap;
import java.util.Map;

/* Find last non repeating character in a given string */


public class LastNonRepeating{

		public static void main(String args[]){
			String str = "ABCDDDCATRGGTTSG";
			Map<Character,Integer> freqMap = new HashMap<Character,Integer>();
			for(int i=0;i<str.length();i++){
				int freq = 0 ; 
				char c = str.charAt(i);
				if(freqMap.containsKey(c)){
					freq = freqMap.get(c);
				}
				freqMap.put(c,++freq);
			}
			
			for(int i=str.length()-1;i>=0;i--){
				char c = str.charAt(i);
				if(freqMap.get(c) ==1){
				System.out.println("Last Non Repeating = "+c);
				break;
					}
			}
		}

}	