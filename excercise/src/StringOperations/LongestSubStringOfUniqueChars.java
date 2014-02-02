package StringOperations;

import java.util.HashSet;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class LongestSubStringOfUniqueChars {
	
	
	
	public static String longestSubStringOfUniqueCharacters(String s){
		String lsub =""; //Longest substring with uniqu characters
		String lsofar=""; // Longest so far
		Set<Character> uniqChar = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for(int n=0;n<s.length();n++){
			if(! (s.length()-n>lsub.length())) break;
			if(s.length()-n>lsub.length()){
				for(int i=n;i<s.length();i++){
					char c = s.charAt(i);
					if(!uniqChar.contains(c)){
						uniqChar.add(c);
						sb.append(c);
						lsofar = sb.toString();
						if(lsofar.length()>lsub.length()){
							lsub = lsofar;
						}
					}else{
							uniqChar.removeAll(uniqChar);
							lsofar ="";
							sb = new StringBuilder();
							break;
					}
					
				}
			}
		}
		return lsub;
		
	}
	public static String longestSubOfUniqueCharacters(String str) {

		if (str == null || str.isEmpty()) {

			return str;
		}

		Set<Character> characters = new HashSet<Character>();

		StringBuilder builder = new StringBuilder();

		String longestSoFar = "", potentialLongest = "";

		for (char c : str.toCharArray()) {

			if (!characters.contains(c)) {

				builder.append(c);

				characters.add(c);

				if (builder.toString().length() > longestSoFar.length()) {

					longestSoFar = builder.toString();
				}

			} else {

				potentialLongest = builder.toString();

				if (potentialLongest.length() > longestSoFar.length()) {

					longestSoFar = potentialLongest;
				}

				builder = new StringBuilder(
						potentialLongest.substring(potentialLongest.indexOf(c) + 1));

				builder.append(c);

			}

		}

		return longestSoFar;
	}
	
	public static void main(String args[]){
		final int limit = 1;
		int test;
		test=limit;
		while(test>0){
			System.out.print(test+" ");
			test--;
		}
		System.out.println();
		test=limit;
		
		long startp = System.currentTimeMillis();
		while(test>0){
			System.out.println("Longest Substring with unique chars= akshayxdk is "+longestSubOfUniqueCharacters("akshayxdk"));
			System.out.println("Longest substring with unique characters=SAMARTH is : "+ longestSubOfUniqueCharacters("SAMARTH"));
			System.out.println("Longest substring with unique characters:SAMARTHAKSHAYDEODHAR is  "+longestSubOfUniqueCharacters("SAMARTHAKSHAYDEODHAR"));
			System.out.println("Longest substring with unique characters: PRACHIDEODHAR is "+longestSubOfUniqueCharacters("PRACHIDEODHAR"));
			System.out.println("Longest substring with unique characters: a123a45a6 is "+longestSubOfUniqueCharacters("a123a45a6"));
			test--;
		}
		long endp = System.currentTimeMillis();
		System.out.println();	
		test=limit;
		long starta = System.currentTimeMillis();
		while(test>0){
		
		System.out.println("Longest Substring with unique chars= akshayxdk is "+longestSubStringOfUniqueCharacters("akshayxdk"));
		System.out.println("Longest substring with unique characters=SAMARTH is : "+ longestSubStringOfUniqueCharacters("SAMARTH"));
		System.out.println("Longest substring with unique characters:SAMARTHAKSHAYDEODHAR is  "+longestSubStringOfUniqueCharacters("SAMARTHAKSHAYDEODHAR"));
		System.out.println("Longest substring with unique characters: PRACHIDEODHAR is "+longestSubStringOfUniqueCharacters("PRACHIDEODHAR"));
		System.out.println("Longest substring with unique characters: a123a45a6 is "+longestSubStringOfUniqueCharacters("a123a45a6"));
		test--;
		}
		long enda = System.currentTimeMillis();
		
		
		
		System.out.println("Diff P = "+String.valueOf(endp-startp));
		System.out.println("Diff A = "+String.valueOf(enda-starta));
		System.out.println("Diff P-A = "+String.valueOf(endp-startp - (enda-starta)));
		
	}

}
