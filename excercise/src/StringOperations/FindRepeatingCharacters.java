package StringOperations;

import java.util.ArrayList;
import java.util.List;

public class FindRepeatingCharacters {
	
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
		 
		////////
		public List<String> find_c_chars(final String str ) {

		    
		    List<String> op = new ArrayList<String>();
		    StringBuilder rp;
		    if(str.isEmpty()){
		        return op;
		    }
		    
		    for(int i=0;i<str.length();i++){
		        char c = str.charAt(i);
		        rp = new StringBuilder();
		        rp.append(c);
		        for(int j=i; j<str.length();j++){
		            char nc = str.charAt(j);
		            //if the characters do not match then basically next character is now different from the one we are comparing 
		            if(nc!=c){
		                int diff = j-i; // Find how many characters were same
		                if(diff==0){  // If no characters were same, break and go back to outer for loop
		                    break;
		                }
		                if(diff>0){ //if there are more than one characters that have matched then just add them to outpul list and 
		                // reset the string builder
		                    op.add(rp.toString());
		                    rp = null;
		                    i=j;
		                }
		            }
		            //If characters match, append to string builder to create the string
		            if(nc==c){
		                rp.append(c);
		            }
		        }
		        
		    }
		    return op;

		} 

}
