package practice;

public class PascalRowTwo {

	public static int[] getRow(int[] row){
		if(row.length==0){
			return new int[]{1};
		}
		int[] newRow = new int[row.length+1];
		newRow[0]=row[0]+1;
		newRow[row.length]=row[0]+1;
		for(int i=1;i<newRow.length-1;i++){
		newRow[i]=row[i]+row[i-1];
		 }
		return newRow;
  }

	public static void main(String args[]){

		int[] row = new int[0];
		for(int i=0;i<10;i++){
			row = getRow(row);
			for(int m: row) {
				System.out.print(m+" ");
			}
				System.out.println();
				
		}
	}

	
}
