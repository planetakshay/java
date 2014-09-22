package matrix;

public class BasicMatrix {
	
	public static void printMatrix(int[][] matrix,int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
