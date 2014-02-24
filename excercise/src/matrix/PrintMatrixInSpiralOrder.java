package matrix;
import util.GenerateData;

public class PrintMatrixInSpiralOrder {

	public static void printArrayInSpiralOrder(int[][] a){
		int rows = a.length;
		int columns = a[0].length;
		int total = rows*columns;
		int rowStart=0;
		int rowEnd=rows-1;
		int columnStart=0;
		int columnEnd=columns-1;
		System.out.println("Printing the metrix in spiral way");
		while(total>0){
			int tempColumnStart = columnStart;
			int tempRowStart  = rowStart;
			while(columnStart<=columnEnd && total>0){
				System.out.print(a[rowStart][columnStart++]+" ");
				total--;
			}
			rowStart++;
			columnStart--;
			while(rowStart<=rowEnd && total>0){
				System.out.print(a[rowStart++][columnEnd]+" ");
				total--;
			}
			rowStart--;
			columnStart--;
			while(columnStart>=tempColumnStart && total>0){
				System.out.print(a[rowStart][columnStart--]+" ");
				total--;
			}
			rowStart--;
			columnStart++;
			while(rowStart>tempRowStart && total>0){
				System.out.print(a[rowStart--][columnStart]+" ");
				total--;
			}
			
			rowStart++;
			columnStart++;
			rowEnd--;
			columnEnd--;
		}
		
	}
	
	public static void main(String args[]){
		GenerateData gd = new GenerateData();
		int [][] a = gd.generateMetrix(5, 2);
		gd.printMetrix(a);
		PrintMatrixInSpiralOrder.printArrayInSpiralOrder(a);
		
		
	}
	
}
