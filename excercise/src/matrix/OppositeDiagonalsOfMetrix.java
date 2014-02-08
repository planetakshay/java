package matrix;

/*
 * Given an N x N metrix, print opposite diagonals of the metris
 * 
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * program should print
 * diagonal1- 1 5 9
 * diagonal2 -3 5 7
 */

public class OppositeDiagonalsOfMetrix {

	public static void main (String args[]){
		int[][] metrix = new int[][]{{1,2,3,4},{4,5,6,7},{7,8,9,10},{11,12,13,14}};
		int length = metrix.length;
		System.out.println(length);
		int[] diagonal1 = new int[length];
		int[] diagonal2 = new int[length];
		int j=0;
		for(int i=0;i<length;i++){
			diagonal1[i]=metrix[i][j]; // increase the column every iteration
			diagonal2[i]=metrix[i][length-j-1]; // decrease the column count every iteration
			j++;
		}
		for(int i:diagonal1){
			System.out.print(i+ " ");
		}
		System.out.println();
		for(int i:diagonal2){
			System.out.print(i+ " ");
		}	
	}
}
