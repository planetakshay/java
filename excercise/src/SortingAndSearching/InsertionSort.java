package SortingAndSearching;

public class InsertionSort {

	
	public void sort(int a[]){
		int sorted=0; // variable that tracks size of the array that is already sorted.
		for(int i=0;i<a.length-1;i++){
			
			if(a[i]>a[i+1]){
				int m=i; // Store index in to m and then traverse array backward to place the element at the correct position in ascending order 
				while(m>=0 && a[m+1]<a[m] ){//i >=0 is important if we have to move an array element all the way to the beginning, we get array index out of bounds
					int temp=a[m+1];
					a[m+1]=a[m];
					a[m]=temp;
					m--;
				}
			}
		}	
	}
	public void printarray(int[] a){
		for(int i: a){
			System.out.print(i+" ");
		}
	}
	public static void main(String args[]){
		int[] a = new int[]{4,6,45,10,8};
		InsertionSort insertionsort = new InsertionSort();
		insertionsort.sort(a);
		insertionsort.printarray(a);
		a = new int[]{4,6,45,10,8,80,23,1,3,45,66,68};
		insertionsort.sort(a);
		insertionsort.printarray(a);
	}
	
}
