package StringOperations;

import java.util.HashMap;
import java.util.Map;

public class LastNonRepeatingCharacter {
	
	public static void main(String args[]){
		lastNonRepeatedCharacter("AABCDB");
		lastNonRepeatedCharacter("AABCDBDEFGHG");
		lastNonRepeatedCharacter("AVBFGRE");
		lastNonRepeatedCharacter("AABCDEBCDE");
		lastNonRepeatedCharacter("AABCDEBCDEE");
		
	}
	
	/**
	 * PayPal on-site - Akshay
	 * 
	 * @param str
	 * @return
	 */
	public static char lastNonRepeatedCharacter(String str) {

		Map<Character, Integer> charFrequency = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			int frequency = 0;
			char c = str.charAt(i);
			
			if (charFrequency.containsKey(c)) {

				frequency = charFrequency.get(c);
			}
			charFrequency.put(c, ++frequency);
			
		}
		for (int i = str.length()-1; i >=0 ; i--) {
			char c = str.charAt(i);
			
			if (charFrequency.get(c) == 1) {
				System.out.println("Answer = "+c);
				return c;
			}
		}

		return '\0';
	}



}
