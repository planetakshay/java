package arraymanipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
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
	
	public static Set<String> biggestWord(String[] words,char[] ch){
		
		String biggestWord="";
		Set<String> candidateWords = new LinkedHashSet<String>(){};
		
		for(String word: words){
			StringBuilder sbword = new StringBuilder(word);
			StringBuilder sbch = new StringBuilder(String.valueOf(ch));
			boolean allmatch = false;
			for(int i=0;i<word.length();i++){
				
				char c = word.charAt(i);
				int indexc = sbch.indexOf(c+"");
				int indexw = sbword.indexOf(c+"");
				if(indexc == -1){
					break;
				}
				else{
					sbword.deleteCharAt(indexw);
					sbch.deleteCharAt(indexc);
				}
				if(sbword.length()==0){
					allmatch = true;
					break;
				}
			}
			if(allmatch && word.length()>biggestWord.length() ){
				candidateWords.removeAll(candidateWords);
				candidateWords.add(word);
				biggestWord=word;
			}
			if(allmatch && word.length()==biggestWord.length() ){
				candidateWords.add(word);
			}
		
		}
		
		
		return  candidateWords;
	}
	
	public static void main(String args[]){
		String[] words = new String[] { "abc" , "baa" , "caan" , "an" , "banc","bancbanc","bancaak" }; 
		char[] ch = new char[]{ 'a' , 'a' , 'n' , 'c' , 'b'};
		System.out.println(biggestWord(words,ch));
		
	}

}
