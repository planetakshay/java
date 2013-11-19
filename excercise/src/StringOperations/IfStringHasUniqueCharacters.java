package StringOperations;

//Problem 1.1 in coding interview book
public class IfStringHasUniqueCharacters {
	
	public boolean ifStringHasUniqueChars(String str){
		//Assuming all characters are ASCII characters
		boolean[] characters = new boolean[256]; //Array values by default are false
		
		for(int i=0;i<str.length();i++){
			int c = str.charAt(i); // Converts the ASCII character in to an integer.
			if(characters[c]){
				return false;
			}
			characters[c]=true;
		}
		return true;
		
	}
	public static void main(String args[]){
		String str = "abcdefghg";
		IfStringHasUniqueCharacters isuc = new 	IfStringHasUniqueCharacters();
		System.out.println("String-> " +str +" has unique characters = "+isuc.ifStringHasUniqueChars(str));
	    str = "abcdefgh";
		System.out.println("String-> " +str +" has unique characters = "+isuc.ifStringHasUniqueChars(str));
		str = "aaaabcdeeeefgh";
		System.out.println("String-> " +str +" has unique characters = "+isuc.ifStringHasUniqueChars(str));
		str = "";
		System.out.println("String-> " +str +" has unique characters = "+isuc.ifStringHasUniqueChars(str));
	}

}
