package StringOperations;

/**
 * Problem 1.3 in career cup. The algorithm in the book seems to have an issue.
 * This algorithm seems to work just fine.
 * @author Akshay
 *
 */
public class RemoveDuplicateCharacters {
	
public static String removeDuplicateCharacters(String s){
		
		StringBuilder sb = new StringBuilder();
		int tail=0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			boolean found = false;
			for(int j=0;j<tail;j++){
				char ch = s.charAt(j);
				if(ch==c){
					found=true;
					break;
				}
			}
			if(!found){
				sb.append(c);
			}
			tail++;
		}
		return sb.toString();
	}

	public static String removeDup(String str){
		if(str==null ){
			return "";
		}
		if(str.length()<2){
			return str;
		}
		char[] ch = str.toCharArray();
		int tail=1;
		for(int i=1;i<ch.length;i++){  //  Traverse all characters in the string from left to right
			int j;
			for( j=0;j<=tail;j++){  // Start traversing the string from the beginning again to see if we have already encountered current character at ith position
				if(ch[j]==ch[i]){  //If we have already found the character then break out of the inner for loop
					break;
				}
			}
			if(j<tail){ // if we broke out of the inner for loop because we have already encountered the character then replace current ith position with a space
				ch[i]=' ';
			}
				ch[tail]=ch[i]; //if j==tail meaning we have not encountered the character before, then assign
				tail++;
		}
		return String.valueOf(ch);
	}
	public static void main(String args[]){
		
		System.out.print(RemoveDuplicateCharacters.removeDup("ABCDDE"));
		System.out.println();
		System.out.print(RemoveDuplicateCharacters.removeDup("ABDCC34CDDE"));
		System.out.println();
		System.out.print(RemoveDuplicateCharacters.removeDup("i love love java"));
		System.out.println();
		System.out.print(RemoveDuplicateCharacters.removeDup("abcd"));
		System.out.println();
		System.out.print(RemoveDuplicateCharacters.removeDup("aav"));
		System.out.println();
		System.out.print(RemoveDuplicateCharacters.removeDup("B"));
		System.out.println();
		System.out.print(RemoveDuplicateCharacters.removeDup("aA"));
	}


}
