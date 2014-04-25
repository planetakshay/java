package practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringOfUniqueCharacters {
	
	public static String longestSubOfUniqueCharacters(String str){
		StringBuilder sb = new StringBuilder();
		String longestSoFar ="";
		String potentialLongest ="";
		Set<Character> unique = new HashSet<Character>();
		
		for(char ch : str.toCharArray()){
			if(!unique.contains(ch)){
					unique.add(ch);
					sb.append(ch);
					if(sb.toString().length()>longestSoFar.length()){
						longestSoFar = sb.toString();
					}
			}			
			else{
				
					potentialLongest = sb.toString();
					if(potentialLongest.length() > longestSoFar.length()){
						
					}
					sb = new StringBuilder(sb.substring(sb.indexOf(ch+""), sb.length()));
					
				}
			
			
			
		}
		
		return sb.toString();
	}
	
	
public static void main(String args[]){
	final int limit = 8000;
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
	}

}
