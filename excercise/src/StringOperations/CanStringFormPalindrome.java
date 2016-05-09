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
				char ch = sb.charAt(0); //Get the first character
				sb.deleteCharAt(0); //Delete the first character  
				if(sb.indexOf(""+ch)!=-1){ // If the same character is found again
					sb.deleteCharAt(sb.indexOf(""+ch)); // Delete that character too
				}else if(!oneOddCharterFound){ //If the same character is not found store it.
					oneOddCharterFound=true; // First unique character found. 
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
		String[] palindromes = new String[]{"ABA","malayalam","dad","dadd","perpe","perrrpe","erthyu","PAAP","AKSSKQ"};
		long a = System.currentTimeMillis();
		System.out.println("\nAkshay's solution\n");
		for(String p: palindromes){
			System.out.println("String= "+p+" "+ canStringFormPalindrome(p));
		}
		long b = System.currentTimeMillis();
		
		System.out.println("\nAkshay's solution took milliseconds\n "+  (b-a));
		a = System.currentTimeMillis();
		System.out.println("\nRayan's solution\n");
		for(String p: palindromes){
			System.out.println("String= "+p+" "+ canStringFormPalindromeUsingMap(p));
		}
		b = System.currentTimeMillis();
		System.out.println("\nRayan's solution took milliseconds\n "+ (b-a));
	}

}
