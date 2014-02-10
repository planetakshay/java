package StringOperations;

import java.util.ArrayList;


/**
 * Implement replace all method for a string without using inbuilt methods.
 * 
 * @author Akshay
 *
 */
public class ReplaceAll {
	
	//given a string s1,s2, find all indexes where s1 occurs in s2.
		public static ArrayList<Integer> getSubStringIndexes(char[] s1, char[] s2){
			
			if((s1!=null && s2!=null) && ( s2.length<s1.length || s1.length==0 )) return new ArrayList<Integer>();
			
			ArrayList<Integer> indexes = new ArrayList<Integer>();
			for(int i=0;i<s2.length;i++){
				
				if(s1[0]==s2[i] && s2.length-i>=s1.length){ // if the first character matches and part of s2 thats remaining to be processed is greater than the s1.length
					int originalIndex = i;
					for(int j=0;j<s1.length;j++){
						if(s2[originalIndex++]!=s1[j]) break;
						if(j==s1.length-1) indexes.add(i); // Add the start index at which the match was found
					}
				}
			}
			return indexes;
		}
	public static String replaceAll(char[] s1,char[] tobeReplaced,char[] replaceWith  ){
		ArrayList<Integer> indexes = getSubStringIndexes(tobeReplaced,s1);
		//if tobeReplaced not found in s1, return original string back.
		if(indexes.size() == 0) return String.valueOf(s1);
		
		char [] result = new char[Math.abs(s1.length +indexes.size()*replaceWith.length - (indexes.size()*tobeReplaced.length))];
		
		for(int i=0,ni=0;ni<result.length;ni++,i++){
			if(indexes.contains(i)){
				
				for(int j=0;j<replaceWith.length;j++){ // add replace with to result string.
					result[ni++]=replaceWith[j];
				}
				i=i-1+tobeReplaced.length; // (i-1) to bring for loop back to one character before the match was found
				ni--;// decrease ni index after string has been replaced to compensate for extra ni++ inside inner for loop.
			}else{
				result[ni]=s1[i];
			}
		}
		return String.valueOf(result);
	}
	
	public static void main(String args[]){
		String s1 = "Today is Sunday.";
		String tobeReplaced = "day";
		String replaceWith = "1234";
		System.out.println("In-> "+s1);
		System.out.println("replacing "+tobeReplaced +" with "+replaceWith);
		System.out.println(replaceAll(s1.toCharArray(),tobeReplaced.toCharArray(),replaceWith.toCharArray()));
		System.out.println("--");
		
		s1 = "Today is Sunday.Which day is tomorrow?";
		tobeReplaced = "day";
		replaceWith = "**";
		System.out.println("In-> "+s1);
		System.out.println("replacing "+tobeReplaced +" with "+replaceWith);
		System.out.println(replaceAll(s1.toCharArray(),tobeReplaced.toCharArray(),replaceWith.toCharArray()));
		System.out.println("--");
		
		s1 = "Today is day.";
		tobeReplaced = "day";
		replaceWith = "*This is just insanely long string*";
		System.out.println("In-> "+s1);
		System.out.println("replacing "+tobeReplaced +" with "+replaceWith);
		System.out.println(replaceAll(s1.toCharArray(),tobeReplaced.toCharArray(),replaceWith.toCharArray()));
		System.out.println("--");
		
		s1 = "Today is day.";
		tobeReplaced = "day";
		replaceWith = "";
		System.out.println("In-> "+s1);
		System.out.println("replacing "+tobeReplaced +" with "+replaceWith);
		System.out.println(replaceAll(s1.toCharArray(),tobeReplaced.toCharArray(),replaceWith.toCharArray()));
		System.out.println("--");
		
		s1 = "Today is day.";
		tobeReplaced = "";
		replaceWith = "";
		System.out.println("In-> "+s1);
		System.out.println("replacing "+tobeReplaced +" with "+replaceWith);
		System.out.println(replaceAll(s1.toCharArray(),tobeReplaced.toCharArray(),replaceWith.toCharArray()));
		System.out.println("--");
		
	}
}
