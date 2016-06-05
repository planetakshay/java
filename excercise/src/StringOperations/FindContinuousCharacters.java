package StringOperations;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousCharacters {
	
//	Problem:
//		Given a string, find all the continuously repeating chars. E.g. Input, "AAPL eat ... apple  ####$$$ ,,," the output is, ['AA', '...', 'pp', '  ', '####', '$$$', ',,,']
//
//		Design Test Cases & Write Code as in TDD
		/////////////////////
		// TC:1 "AAPL eat ... apple  ####$$$ ,,," the output is, ['AA', '...', 'pp', '  ', '####', '$$$', ',,,'] //P0
		// TC:2 "" // Boundry / negative // OP: []
		// TC:3 "Akshay Deodhar" // boundry  // Negative //Op: []
		// TC:4 "Akshayyy" //Op: ['yyy']
		// TC:5 "YYAkshay" //Op ['YY']
		// TC:6 "Akshay 567  aks" // Op: []
		// TC:7 "56573"  // Op: []
		// TC:8 "554" - //op: [ '55' ]
		// TC:9 "^^&&" - // Op: ['^^,'&&']
		// TC:10 <limit of the ninput> 
		 
		public static  void addToOutPut(StringBuilder sb,List<String> op,char pc){
			sb.append(pc); //append the previous character to account for all repeating character since we process current one
			op.add(sb.toString()); // append the string to output list
			sb = sb.delete(0, sb.length()); // empty out string builder
		}
		public static List<String> find_ct_char(final String str){
			
			List<String> op = new ArrayList<String>();  //List that holds the output
			StringBuilder sb = new StringBuilder(); // String builder that constructs the string of repeating characters
			
			for(int i=1;i<str.length();i++){  //Start processing string at second character
				char c = str.charAt(i); //current character
				char pc = str.charAt(i-1); //previous character
				if(c==pc) //If current and previous character match, append the current character
				{
					sb.append(c); //appending current character
					if(i == str.length()-1){  //if all characters going forward are repeating and we reach end of string, we need to collect these set of repeating characters to output list
						addToOutPut(sb,op,pc);
					}
					
				}else{ //If current character does not match with previous one
					if(sb.length()>=1 ){   //If sb has a length is 1 or more that means previously characters have been repeating and now going forward they do not. so collect these set of repeating characters to output list
						addToOutPut(sb,op,pc);
					}
					//If sb length is less than 1 that means previously characters have not been repeating, so no need to do anything.
				}
			}
			return op; //return the output list to the calling method.
		}
		public static void printOutPut(List<String> op){
			for(String s: op){
				System.out.print(s +",");
			}
		}
		
		public static void main(String args[]){
			String [] input = new String[]{"AAPL eat ... apple  ####$$$ ,,,","","Akshay Deodhar","Akshayyyy","YYakshay","Akshay 567","56573","554343","^^&&dsdfs##","aaaksh","Tryuui000056766TT"};
			//String [] input = new String[]{"Akshayyyy"};
			for(String s: input){			
				System.out.println("\n --It---Starts-----");
				System.out.println(s);
				List<String> op = find_ct_char(s);
				printOutPut(op);
				System.out.println("\n---End-----");
			}
		}

}
