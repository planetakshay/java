package practice;

public class BinarySearch {

	public static int bnrSearch(int low,int high,int[] a,int n){
		int middle = (low+high)/2;
		if(a[middle]==n){
			return middle;
		}else{
			if(n<a[middle]){
				return bnrSearch(1,middle-1,a,n);
			}
			if(n>a[middle]){
				return bnrSearch(middle,a.length,a,n);
			}
			
			return 0;
	}
	}
	public static void main( String args[]){
		
		int[] a = new int[]{1,4,5,7,9,12,18,19};
		int search = bnrSearch(0,a.length,a,18);
		System.out.println(" number found at "+search);

	}

	
}
