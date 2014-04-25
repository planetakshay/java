package practice;

public class QuickSortFour {
	
	public static void main(String args[]){
		int[] a =  new  int[]{3,8,5,10};
		sort(a,0,a.length-1);
		for(int i:a){
			System.out.print(i+" ");
		}
	}
	
	public static void sort(int[]a,int start,int end){
		int  index = partition(a,start,end);
		if(index-1> start ){
			sort(a,start,index-1);
		}
		if(index< end){
			sort(a,index,end);
		}
		
	}
	
	public static int partition(int[]b,int start,int end ){
		if(start>end){
			return 0;
		}
		int pivot = b[(start+end)/2];
		int i=start;
		int j=end;
		
		if (b!=null && b.length>1) {
			while (i <= j) {
				while (pivot > b[i]) {
					i++;
				}
				while (pivot < b[j]) {
					j--;
				}
				if (i <= j) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
					i++;
					j--;
				}
			}
		}
		return i;
	}

}
