package StringOperations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Given a jumbled up string, find out if it can form a palindrome or not.
public class CanStringFormPalindrome {
	
	// Akshay's solution
	private static boolean canStringFormPalindrome(String str){
		boolean oneOddCharterFound = false;
		StringBuilder sb  = new StringBuilder(str);
		
		for(int i=0;i<((str.length()/2)+1);i++){ //We only need to traverse the loop str.lengh/2 times since we delete duplicate characters.
			if(sb.length()>0){
				char ch = sb.charAt(0); 
				sb.deleteCharAt(0); //Delete the character at 0th index and store it in ch. next find if its there in the string.
				if(sb.indexOf(""+ch)!=-1){
					sb.deleteCharAt(sb.indexOf(""+ch)); //If there is a similar character in the string, just delete that one
				}else if(!oneOddCharterFound){
					oneOddCharterFound=true; // First unique character found. For a Palindrome, there can only be one odd character.
				}else if(oneOddCharterFound){
					return false; //Looks like there are two unique (i.e. only one occurrence )characters // As soon as we find second unique characters algorithm returns
				}
			}else{
				break;
			}
		}
		return sb.length()==0;
	}
	
	//Rayan's solution
	private static boolean canStringFormPalindromeUsingMap(String str){
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char c  = str.charAt(i);
			if(charMap.containsKey(c)){
				int freq = charMap.get(c);
				charMap.put(c, ++freq);
			}else{
				charMap.put(c, 1);
			}
		}
		int oddCharacters=0;
		for(Map.Entry<Character, Integer> entry: charMap.entrySet()){
			if(entry.getValue()%2 != 0){
				oddCharacters++;
			}
		}
		return  (oddCharacters==1 || oddCharacters==0) ? true:false;
	}
	public static void main(String args[]){
		String[] palindromes = new String[]{"malayalam","dad","dadd","perpe","perrrpe","erthyu","PAAP","AKSSKQ"};
		
		System.out.println("\nAkshay's solution\n");
		for(String p: palindromes){
			System.out.println("String= "+p+" "+ canStringFormPalindrome(p));
		}
		System.out.println("\nRayan's solution\n");
		for(String p: palindromes){
			System.out.println("String= "+p+" "+ canStringFormPalindromeUsingMap(p));
		}
	}

}
