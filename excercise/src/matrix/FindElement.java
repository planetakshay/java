package matrix;

/**
 * Given a sorted matrix, find out if a particular element exists or not
 * 
 *
 */
public class FindElement extends BasicMatrix {

	public boolean findElement(int[][] matrix,int elm,int m,int n){
		int row = 0;
		int col = n-1;
		 while(row<m && col >=0){ // make sure row does not exceed m and column does not decrease less than 0 
			 if(matrix[row][col]==elm){
				 return true;
			 }else if(elm > matrix[row][col]){ // if given element is greater increase the row
				 row++;
			 }else{ //otherwise decrease the column.
				 col--;
			 }
		 }
		
		return false;
	}
	public static void main(String args[]){
		int matrix[][] = new int[][] { { 10, 50, 80, 100 },
				{ 60, 70, 110, 130 }, { 85, 100, 120, 140 },
				{ 90, 200, 210, 300 } };
		printMatrix(matrix, 4, 4);
		FindElement findElement = new FindElement();
		System.out.println("\nElement 120 is found: "
				+ findElement.findElement(matrix, 120, 4, 4));

	}
}
