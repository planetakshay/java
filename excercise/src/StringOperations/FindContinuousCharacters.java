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
		 
		
		public static List<String> find_ct_char(final String str){
			
			List<String> op = new ArrayList<String>();
			StringBuilder sb = new StringBuilder();
			
			for(int i=1;i<str.length();i++){
				char c = str.charAt(i);
				char pc = str.charAt(i-1);
				if(c==pc){
					sb.append(c);
					if(i == str.length()-1){
						sb.append(pc);
						op.add(sb.toString());
						sb = sb.delete(0, sb.length());
					}
					
				}else{
					if(sb.length()>=1 ){
						sb.append(pc);
						op.add(sb.toString());
						sb = sb.delete(0, sb.length());
					}
				}
			}
			return op;
		}
		public static void printOutPut(List<String> op){
			for(String s: op){
				System.out.print(s +",");
			}
		}
		
		public static void main(String args[]){
			String [] input = new String[]{"AAPL eat ... apple  ####$$$ ,,,","","Akshay Deodhar","Akshayyyy","YYakshay","Akshay 567","56573","554343","^^&&dsdfs##"};
			//String [] input = new String[]{"Akshayyyy"};
			for(String s: input){			
				System.out.println("---Start-----");
				System.out.println(s);
				List<String> op = find_ct_char(s);
				printOutPut(op);
				System.out.println("\n---End-----");
			}
		}

}
