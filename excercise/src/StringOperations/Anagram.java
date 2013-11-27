package StringOperations;

public class Anagram {
	
	/** using string builder
	 * 
	 * @param word
	 * @param anagram
	 * @return
	 */
	public boolean isAnagram(String word,String anagram){
		char[] wordArray = word.toCharArray();
		StringBuilder sb = new StringBuilder(anagram);
		
		for(char ch: wordArray){
			int index = sb.indexOf(""+ch); // "" would convert the ch in to a string
			if(index != -1){ // If the character was found in anagram, then the index will not be -1
				sb.deleteCharAt(index);
			}else{ // if the character is not found in anagram, that means word and anagram are not anagrams
				return false;
			}
		}
		return sb.length()==0? true:false;
	}
	
	public static void main(String args[]){
		Anagram a = new Anagram();
		System.out.println("DAD and DDA -"+ a.isAnagram("DAD", "DDA"));
		System.out.println("DDDD and DDDA -"+ a.isAnagram("DDDD", "DDDA"));
	}

}
