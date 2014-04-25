package practice;

public class PascalRowThree {

	
	public static int[] getPascalRow(int[] row){
		int[] newRow  = new int[row.length+1];
		newRow[0]=row[0]+1;
		newRow[row.length]= row[0]+1;
		for(int j=1;j<newRow.length-1;j++){
			newRow[j]=row[j]+row[j-1];
		}
		
		return newRow;
	}

   public static void printPascalTriangle(int n){
	   if(n<1){
		   return;
	   }
	   if(n==1){
		   System.out.println("1");
		   return;
	   }
	   if(n>1){
		   System.out.println("1");
	   }
	   int[] row = new int[]{1};
	   for(int i=2;i<=n;i++){
		   		row = getPascalRow(row);
		   		for(int elm: row){
		   			System.out.print(elm+" ");
		   		}
			   System.out.println();
		   }
	   
	   }
	   
   
	

	   public static void main(String args[]){
		printPascalTriangle(10);
	   }
}
