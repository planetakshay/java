package practice;

/*
 * 
 *        1
 *       2  2
 *      3  4  3
 *     4  7  7  4
 *    5 13 14 13 5    
 */

public class PascalRowFour {

	public static int[] getRow(int[] row){
		
		int[] newrow = new int[row.length+1];
		newrow[0]=row[0]+1;
		newrow[row.length]=row[0]+1;
		for(int i=1;i<newrow.length-1;i++){
			newrow[i] = row[i]+row[i-1];
		}
		return newrow;
	}
	
	public static void printPascalRows(int n){
		int row[ ] = new int []{1};
		System.out.println("1");
		for(int i=1;i<=n;i++){
			row = getRow(row);
			for(int j :row){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		printPascalRows(10);
	}
}
