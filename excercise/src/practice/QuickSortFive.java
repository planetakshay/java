package practice;

public class QuickSortFive {
	
	public static int partition(int[] a, int start,int end){
		int i=start;
		int j=end;
		int temp=0;
		if(a!=null && a.length>1){
			int pivot = a[(start + end) / 2];
			while (i<=j) {
				
				while (pivot>a[i]) {
					i++;
				}
				while (pivot<a[j]) {
					j--;
				}
				if (i <= j) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
					j--;
				}
			}	
		}
		return i;
	}
	public static void sort(int[] a, int start,int end){
		int index = partition(a,start,end);
		if(start<index-1){
			sort(a,start,index-1);
		}
		if(end> index){
			sort(a,index,end);
		}
	}
	public static void printarray(int[] a){
		for(int i: a){
			System.out.print(i+" ");
		}
	}
	public static void main(String args[]){
		int [] a = new int[]{5,4,5,3,3,3,6,7,1};
		sort(a,0,a.length-1);
		printarray(a);
		
	}

}
