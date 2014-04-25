package practice;

public class PascalRow {

	public int[] pascalRow(int[] previous){
		int[] row = new int[previous.length+1];
		row[0]=1;
		row[row.length-1]=1;
		for(int i=1;i<row.length-1;i++){
			row[i]=previous[i]+previous[i-1];
		}
		return row;
	}
	public static void main(String args[]){
		PascalRow p = new PascalRow();
		int n=15; //print 15 rows of pascal row trianggle
		int[] row = new int[0];
		
		for(int c = 1;c<=15;c++){
			int[] previous = row;
			row = p.pascalRow(previous);
			for(int i: row){
				System.out.print(i+",");
			}
			System.out.println();
		}
	}
}
