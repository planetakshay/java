package StringOperations;

import java.io.*;
import java.util.*;

/*

Compress
  aaabbcddcc => a3b2cd2c2
DeCompress
  aabab => a2bab

*/



/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class CompressDeCompress {


	public static String getCompressed(String s){

		StringBuilder op = new StringBuilder();
		int charCount=1;

		if(s.isEmpty() || s.length() ==1) return s;

		for(int i=1;i<s.length();i++){

			if(s.charAt(i)==s.charAt(i-1))
			{
				charCount++;   //Just counts how many times a single character is repeating
			}else{

				if(charCount>1){
					op.append(s.charAt(i-1)+""+charCount);  //if the character is not repeating and if it has been counted to be more than 1 just append the character and the number of times it appears

				}else{
					op.append(""+s.charAt(i-1));   // this is if there are multiple single characters. like aabcdfhh - i.e. b,c,d

				}
				charCount=1;
			}

		}
		//Following code is if there are repeating characters at the end of the string aboce for loop will not take care of that scenario so we need to end the compressed string
		//by simple same logic is is in else close of above for loop.
		if(charCount>1){
			op.append(s.charAt(s.length()-1)+""+charCount);

		}else{
			op.append(""+s.charAt(s.length()-1));

		}
		return op.toString();
	}

	public static String deCompress(String s){

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){

			Character c = s.charAt(i);

			if(Character.isDigit(c)){
				Character prevChar = s.charAt(i-1);
				int count = Integer.parseInt(c+"");
				while(count>1) {
					sb.append(prevChar+"");
					count--;
				}

			}else{
				sb.append(c+"");
			}
		}
		return sb.toString();
	}


	public static void main(String[] args) {
		String[] strings = new String[] {"aaabbcddcc","aabab","ab","","aaaaa","abbb","a","aabbccdd","aabncff"};

		for (String string : strings) {
			System.out.println();
			System.out.println("Compress");
			System.out.print("Input = "+string);
			String op = getCompressed(string);
			System.out.print(" Output = " + op );
			System.out.println();
			System.out.println("DeCompress");
			System.out.print("Input = "+op);
			System.out.print(" Output = " + deCompress(op));
		}
	}
}
