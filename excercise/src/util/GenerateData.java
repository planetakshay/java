package util;

public class GenerateData {
	
	public int[][] generateMetrix(int n,int m){
		int[][] a = new int[n][m];
		int counter=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j] = counter++;
			}
		}
		return a;
	}

	public void printMetrix(int[][] a){
		int rows = a.length;
		int columns = a[0].length;
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		
	}
}
