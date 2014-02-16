package SortingAndSearching;

public class InsertionSort {

	
	public void sort(int a[]){
		int sorted=0; // variable that tracks size of the array that is already sorted.
		for(int i=0;i<a.length-1;i++){
			
			if(a[i]>a[i+1]){
				int goBackTo=i;
				while(i>=0 && a[i+1]<a[i] ){//i >=0 is important if we have to move an array element all the way to the begining, we get array index out of bounds
					int temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
					i--;
				}
				i=goBackTo;
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
