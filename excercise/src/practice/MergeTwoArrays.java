package practice;

public class MergeTwoArrays {

	public static int[] mergeTwoArrays(int[] a,int[]b){

		int[]merged = new int[a.length+b.length];
		int i=a.length-1; //last index of a
		int j=b.length-1; // last index of b
		int k=a.length+b.length-1; // last index of merged array

		while(i>=0 && j>=0){
			if(a[i]>=b[j]){
			merged[k--]=a[i];
		i--;	
		}else
			if(a[i]<b[j]){
			merged[k--]=b[j];
			j--;
			}
		 }
		 while(i>=0){
			 merged[k--]=a[i];
			 i--;
		 }
		 while(j>=0){
			 merged[k--]=b[j];	
			 j--;
		 }
			return merged;
	}

	public static void main(String args[]){
		int[] a = {3,4,6,7};
		int[]b={1,2,3};
			int[] mergedArray = mergeTwoArrays(a,b);
			for(int i: mergedArray){
				System.out.print(i+" ");
			}	
	
		}
		
    }


