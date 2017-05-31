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
				charCount++;
			}else{

				if(charCount>1){
					op.append(s.charAt(i-1)+""+charCount);

				}else{
					op.append(""+s.charAt(i-1));

				}
				charCount=1;
			}

		}

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
