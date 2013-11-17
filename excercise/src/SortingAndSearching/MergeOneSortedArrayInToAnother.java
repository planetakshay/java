package SortingAndSearching;

import java.util.Arrays;


/*
 * Problem 9.1 in CareerCup book. Cracking Code.
 * You are given two sorted arrays A and B.A has a large enough buffer at the end to hold B.Write
 * a method to merge B into A in sorted order.
 */
public class MergeOneSortedArrayInToAnother {
	public int[] mergeAnotherSortedArray(int[] a, int[] b){
		int alength=a.length;
		int blength=b.length;
		
		int k=alength-1; // Index of last location of array a
		int j =blength-1; // index of last location of array b
		
		int i=alength-blength-1; // index of last element in array a
		
		System.out.println("a="+Arrays.toString(a)+" b="+Arrays.toString(b));
		while(i>=0 && j>=0){
		
			if(a[i] >= b[j]){
				a[k--]=a[i--];
			}else{
				a[k--] =b[j--];
			}
			System.out.println("a="+Arrays.toString(a)+" b="+Arrays.toString(b));
		}
		while(j>=0)
		{
			a[k--] = b[j--];
		}
		System.out.println("a="+Arrays.toString(a)+" b="+Arrays.toString(b));
		return a;
	}
	public static void main(String args[]){
		MergeOneSortedArrayInToAnother myMerge = new MergeOneSortedArrayInToAnother();
		int[] a = new int[]{3,10,0,0};
		int[] b = new int[]{1,5};
		System.out.println("Answer is = "+Arrays.toString(myMerge.mergeAnotherSortedArray(a, b))+"\n");
		 a = new int[]{10,0,0};
		 b = new int[]{1,5};
		System.out.println("Answer is = "+Arrays.toString(myMerge.mergeAnotherSortedArray(a, b))+"\n"); 
		
		a = new int[]{0,0};
		b = new int[]{1,5};
		System.out.println("Answer is = "+Arrays.toString(myMerge.mergeAnotherSortedArray(a, b))+"\n");
		
		a = new int[]{5,8,0};
		b = new int[]{1};
		System.out.println("Answer is = "+Arrays.toString(myMerge.mergeAnotherSortedArray(a, b))+"\n");
		
		a = new int[]{5,8,0};
		b = new int[]{100};
		System.out.println("Answer is = "+Arrays.toString(myMerge.mergeAnotherSortedArray(a, b))+"\n");
		/* Solution given in the book that does not work
		int m=a.length;
		int n=b.length;
		int k= m+n-1;//index of last location of array b
		int i=n-1;//index of last element in array b
		int j=m-1; //index of last element in array a
		while(i>=0 && j>=0){
			if(a[i] > b[j]){
				a[k--] = a[i--];
			}else{
				a[k--] = b[j--];
			}
			System.out.println(Arrays.toString(a));
		}
		if(j>=0){
			a[k--]=b[j--];
		}
		System.out.println(Arrays.toString(a));
		*/
	}

}
