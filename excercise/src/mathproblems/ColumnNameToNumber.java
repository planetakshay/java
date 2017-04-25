package mathproblems;


//Given a column name, find what would be the number of the column.
/*
 * For example A=1... Z=26 , AA=27...AZ=52, AAA=53 and so on
 * 
 */
public class ColumnNameToNumber {
		
	public static int getColumnNumber(String sxCol){
		
		int result= 0;
		
		sxCol = sxCol.toUpperCase(); // This is important as we are going to be
		// using capital letters's value
		// corresponding to its real ascii
		// value. We will subtract 64 from ASCII value of characters during each pass to get result.
		//  Value of A
		// is 1, B is 2, C is 3 and so on...
		
		for(int i=sxCol.length(); i>0;i--){
			char _c = sxCol.charAt(i-1); // Get the last character
			/*
			// Function => (26 ^ reversed_char_index) * char_value
			// A = 1 ------ Z = 26 ------ AA = 27 ------ AZ = 54
			// 64 because Ascii value of Capital letters is 65 and onwards so
			// for 'A' we will get value 1 for B 2 and so on
			 * 
			 */
			result += Math.pow(26, sxCol.length()-i) * (_c-64);
			
		}

		return result;
	}

	public static int getColumnNumberFromColumnName(String s){

		int result = 0;

		for(int i=0;i<s.length();i++){

			result = result *26 + s.charAt(i) - 'A'+1;

		}
		return result;
	}
		public static void main(String args[]){

		System.out.println(" "+getColumnNumber("AABZ"));
			System.out.println(" "+getColumnNumberFromColumnName("AABZ"));
	}
	
}
