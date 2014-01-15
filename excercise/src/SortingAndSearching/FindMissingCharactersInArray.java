package SortingAndSearching;

import java.util.Arrays;

public class FindMissingCharactersInArray {
	
	public static void printMissingCharacters(char[] c){
		
		int  start = (int) new Character('a');
		int end = (int) new Character('z');
		Arrays.sort(c);
		int j=0;
		for(int i=start;i<=end ; i++){
			if(c[j]!=(char)i){
				System.out.print((char)i+" ");
			}else{
				// if match is found then ignore printing of character and increase the index
				if(c[j]==(char)i && j<c.length-1){ // if match is found and also make sure j does not go over last index
					j++;   // Basically j can be increased only until last index -1 or it would cause array index out of bounds when c[j] is accessed next time
				}
			}
			
		}
		
	}
	
	public static void main(String args[]){
		char[] c = new char[]{'d','f','g','h'};
		printMissingCharacters(c);
	}

}
