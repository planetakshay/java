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
			 * 26^reverse_index_
			 * 
			 */
			result += Math.pow(26, sxCol.length()-i) * (_c-64);
			
		}
		
		
		
		
		return result;
	}
	
		public static void main(String args[]){
		System.out.println(" "+getColumnNumber("AABZ"));
	}
	
}
