package Series;
/*
*
* 
*        1
*       2  2
*      3  4  3
*     4  7  7  4
*    5 13 14 13 5   
*
*
*
*/

public class PascalRow{
	
	public static void main(String args[]){
		//Write a pascal triangle for n number of rows
		int n=15;
		int[] row = new int[0];
		//Find out the next row
		for(int i=1;i<n;i++){
			//find next row
			row =  pascalRow(row);
			for(int j=0;j<row.length;j++){
				System.out.print(row[j]+" ");
			}
			System.out.println();
		}
	}
	public static int[] pascalRow(int[] previous){
		
		int[] row = new int[previous.length+1];
		row[0]=1;
		row[row.length-1]=1;
		for(int i=1;i<row.length-1;i++){
			row[i]=previous[i-1]+previous[i];
		}
		return row;
	}
	
	
	
	
}