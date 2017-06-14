package StringOperations;



	public class StringToInteger{

	    public int stringToInteger(String str){
	    
	        if(str==null || str.isEmpty() ) return 0;
	        
	        char[] strArray = str.toCharArray();
	        int number=0;
	        for( char c: strArray){
	            int ch = (int) c;
	            if(ch>48 && ch<57){ 
	                try{
	                        number = number*10+(ch-48);
	                    }catch(Exception e){
	                        System.out.print(e.getMessage());
	                     }    
	            }else{
	                
	                return number;
	            }
	        }
	        
	        return number;
	    }
	    public static void main(String args[]){
	        StringToInteger sti = new StringToInteger();
	        String[] testInput = new String[]{
	            "34", // positive test expected:34
	            "", // boundry //error
	            "0", // boundry //expected : 0
	            "-23",// negative number "expected : -23
	            "+23",// just a number with plus expected: 23
	            "45 56", //  expected: 4556
	            "3434344445555343434343434334", // number larger than can be stored in an Integer EXPECTED - exception
	            "null", // Null string expected: 0
	           // String.valueOf(null), // String representation of null  expected: 0
	            "3.56", // expected: 3
	            "-34.44", // expted:-34
	            "34...43",
	            "34+55",
	            "56-34",
	            "+++",
	            "---",
	            "+++---", 
	            "...",
	            " ", // Only space
	            "++ ",//combination of sign and space
	            "45 ",// white space at the end
	            " 45", //white space at beginning
	            "454\n", // new line character
	            "%%^35", // special characters
	            "\'",// single quote
	            
	        };
	        
	        int i = sti.stringToInteger("34");
	        for(String s: testInput){
	            System.out.println(sti.stringToInteger(s));
	        }
	    }

	}
