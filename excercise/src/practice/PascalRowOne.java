package practice;

import java.util.Arrays;

/*
 * 
 *        1
 *       2  2
 *      3  4  3
 *     4  7  7  4
 *    5 13 14 13 5    
 */



public class PascalRowOne {
	public static void printTwoRows(){
		System.out.println("1");
		System.out.println("2 2");
		
	}
	public static void printNPascalRows(int n){
		if(n<0){
			return;
		}
		if(n==1){
			System.out.println(1);
			return;
		}
		if(n==2){
			printTwoRows();
			return;
		}
		if(n>2){
			printTwoRows();
			int[] row= new int[]{2,2};
			for(int i=3;i<=n;i++){
				int[] previousRow = row; 
				row = getRow(previousRow);
				for(int j=0;j<row.length;j++){
					System.out.print(row[j]+" ");
				}
				
				System.out.println();
			}
			return;
		}
		
	}
	public static int[] getRow(int[] pascal){
		
		int[] row = new int[pascal.length+1];
		row[0]=pascal[0]+1;
		row[pascal.length]=pascal[0]+1;
		for(int i=1;i<row.length-1;i++){
			row[i]=pascal[i]+pascal[i-1];
		}
		return row;
	}
	
	public static void main(String args[]){
		
		printNPascalRows(14);
		
		
	}
}
