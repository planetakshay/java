package practice;

import java.util.Arrays;

public class QuickSort {
	public static void main(String args[]){
		int[] a = new int[]{8,4,6,34,22,11,6,0};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void sort(int[] array,int start, int end){
		int index = partition(array,start,end);
		if(start<index-1){
			sort(array,start,index-1);
		}
		if(end>index){
			sort(array,index,end);
		}
	}

	public static int partition(int[]array,int start,int end){
		int i=start;
		int j=end;
		int temp=0;
		if(array!=null && array.length>1){
			int pivot = array[(start+end)/2];
			while(i<=j){
				while(array[i]<pivot){
					i++;
				}
				while(array[j]>pivot){
					j--;
				}
				if(i<=j){
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
					i++;
					j--;
				}
			}
		}
		return i;
	}
}
