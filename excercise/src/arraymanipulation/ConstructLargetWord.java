package arraymanipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* 
 * 
 * 
 * 
 *given 2 arrays wrds[] , chars[] as an input to a function such that 
 *wrds[] = [ "abc" , "baa" , "caan" , "an" , "banc" ] 
 *chars[] = [ "a" , "a" , "n" , "c" , "b"] 
 *Function should return the longest word from words[] which can be constructed from the chars in chars[] array. 
 * for above example - "caan" , "banc" should be returned 

 *Note: Once a character in chars[] array is used, it cant be used again. 
 *eg: words[] = [ "aat" ] 
 *characters[] = [ "a" , "t" ] 
 *then word "aat" can't be constructed, since we've only 1 "a" in chars[].
 */


/**
 * This algorithm mostly works but need more tests and think through
 * 
 * @author Akshay
 *
 */
public class ConstructLargetWord {
//	
//	public static Set<String> biggestWord(String[] words,char[] ch){
//		
//		String biggestWord="";
//		Set<String> candidateWords = new LinkedHashSet<String>(){};
//		
//		for(String word: words){
//			StringBuilder sbword = new StringBuilder(word); //initialize string builder with word
//			StringBuilder sbch = new StringBuilder(String.valueOf(ch)); // convert the character array in to string. initialize the string builder with that
//			boolean allmatch = false; //match = false
//			for(int i=0;i<word.length();i++){
//				
//				char c = word.charAt(i);   // get each character of word 
//				int indexc = sbch.indexOf(c+"");  // find indexes in word and character array string
//				int indexw = sbword.indexOf(c+""); //
//				if(indexc == -1){ // if the character from word is not even in character array - that word can not be formed. so break with allmatch=false;
//					break;		// This will also be -1 when word is bigger than total characters in array. even then word can not be considered as created using character array so break with allmatch=false;
//				}
//				else{ // if the character is contained in word and character array string then delete it
//					sbword.deleteCharAt(indexw);
//					sbch.deleteCharAt(indexc);
//				}
//				if(sbword.length()==0){  // Since we can only match characters from char array once, lets check if all characters from word have been matched and deleted.
//					allmatch = true;     // if all characters have been deleted then allmatched=true and break.
//					break;
//				}
//			}
//			if(allmatch && word.length()>biggestWord.length() ){
//				candidateWords.removeAll(candidateWords);
//				candidateWords.add(word);
//				biggestWord=word;
//			}
//			if(allmatch && word.length()==biggestWord.length() ){
//				candidateWords.add(word);
//			}
//		}
//		return  candidateWords;
//	}
	
	public static Set<String> biggestWord(String[]  words, char[] ch){
		//Just a comment
		Set<String> candidateWords = new LinkedHashSet<String>(){};
		String biggestSoFar = null;
		for(int i=0;i<words.length;i++){
			// if the 
			if(biggestSoFar!=null && words[i].length()<biggestSoFar.length()){
				continue;
			}
			StringBuilder sb = new StringBuilder(String.valueOf(ch));
			for(int j = 0 ; j<words[i].length();j++){
				char ch1 = words[i].charAt(j);
				int index = sb.indexOf(ch1+"");
				if(index==-1){
					break;
				}else{
					sb.deleteCharAt(index);
				}
				if(j==words[i].length()-1){
					if(biggestSoFar !=null && j>biggestSoFar.length()-1  ){
						candidateWords.removeAll(candidateWords);
					}
					biggestSoFar = words[i];
					candidateWords.add(biggestSoFar);
				}
			}
		}
		
		return candidateWords;
	}
	
	public static void main(String args[]){
		char[] ch = new char[]{ 'a' , 'a' , 'n' , 'c' , 'b'};
		
		String[] words = new String[] { "abc" , "baa" , "caan" , "an" , "banc","bancbanc","bancaak" }; 
		System.out.println(biggestWord(words,ch));
		
		words = new String[] { "abc" , "baa" , "caan" , "an" , "banc","bancbanc","bancaak","434","aacbn","aacbnn" }; 
		System.out.println(biggestWord(words,ch));
		
		words = new String[] { "","abc" , "baa" , "caan" ,"caan", "an" , "banc","bancbanc","bancaak" }; 
		System.out.println(biggestWord(words,ch));
		
	}

}
