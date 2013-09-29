package matrix;
/**
 * Given an NxN Matrix rotate the matrix fully
 * 
 * @author Akshay
 *
 */
public class rotateMatrix {

	// 3X3 matrix
	
	public static void main(String args[]){
	    int [][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		print(array);
	    rotateMatrix.rotate(array);
	    print(array);
	}
	
	public static void print(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix.length; j++) {

				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
	
	public static void rotate(int[][] array){
		int length = array.length-1;
		int row=array.length;
		int column=array.length;
		int temp=0;
		for(int i=0;i<row/2;i++){
			for(int j=0;j<(column+1)/2;j++){
				System.out.println("i=" +i+" and j="+j);
				print(array);
				temp=array[i][j];
				array[i][j] = array[length-j][i];
				array[length-j][i]=array[length-i][length-j];
				array[length-i][length-j] = array[j][length-i];
				array[j][length-i]=temp;
			}
		}
		System.out.println("Rotation Complete Ne Matrix is");
	}
}
