package matrix;

public class PrintDiagonals extends BasicMatrix {
	
	public void printMainDiagonal(int[][] matrix,int row,int column){
		
		if(matrix!=null && row==column){
			System.out.println("\n Printing main diagonal");
			for(int i=0;i<row;i++){
				System.out.print(matrix[i][i]+"\t");
			}

		}else{
			System.out.println("Either the matrix is null or number of rows is not same as number of columns so can not print a diagonal");
		}
				
	}
	public void printSecondDiagonal(int[][] matrix, int row,int column){
		
		if(matrix!=null && row==column){
			System.out.println("\n printing second diagonal");
			int n= matrix.length -1;
			for(int i=0;i<row;i++){
				System.out.print(matrix[i][n-i]+"\t");
			}
		}else{
			System.out.println("Either the matrix is null or number of rows is not same as number of columns");
		}
		
	}
	public static void main(String args[]){
		int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		PrintDiagonals printDiagonals = new PrintDiagonals();
		printMatrix(array,3,3);
		printDiagonals.printMainDiagonal(array,3, 3);
		printDiagonals.printSecondDiagonal(array, 3, 3);
		
	}

}
