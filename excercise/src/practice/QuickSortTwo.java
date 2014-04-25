package practice;

public class QuickSortTwo {

	public static int partition(int[]a, int start, int end){
		if(start > end){
		return 0;
		}
		int i=start;
		int j=end;
		int pivot = a[(start+end)/2];
		if(a!=null && a.length>1){
		while(i<=j){
			while(a[i]< pivot){
			 i++;
			}
			while(a[j]> pivot){
				j--;
			}
		if(i<=j){
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		}
		}
		return i;
		}

		public static void sort(int[] a, int start, int end){
			int index = partition(a,start,end);
			if(start<index-1){
				sort(a,start,index-1);
			}
			 if(end >index){
				sort(a,index,end);
			 }	

		}

		public static void main(String args[]){
			int[] a = new int[]{4,3,5,1,6,9,18,7};
			sort(a,0,a.length-2);
			for(int i: a){
				System.out.print(i+" ");
		}
		}
	
}
