package arraymanipulation;

public class MaxSubArray {
	
	//Adding comment.
	public static void main(String[] args) {

		
		
		int[] intArr1 = { -3, -1, -1, -1, -1, -1, -2, -5, -3, -2 };
		int[] intArr2 = { -3, -1, -1, -1, -1, -1, -2, 1,2, -3, -2 };

		int[][] data = {intArr1,intArr2};
		for(int[] ary: data){
			findMaxSubArray(ary);
			System.out.println("Next Set ");
		}
		
	}
	
	private static void findMaxSubArray(int[] intArr) {
		
		int maxStartIndex = 0;
		int maxEndIndex = 0;
		int maxSum = Integer.MIN_VALUE;
		int cummulativeSum = 0;
		int maxStartIndexUntilNow = 0;  
		
		for(int currentIndex=0; currentIndex < intArr.length;currentIndex++){
			cummulativeSum += intArr[currentIndex];
			
			if(cummulativeSum > maxSum){
				maxSum = cummulativeSum;
				maxStartIndex = maxStartIndexUntilNow;
				maxEndIndex = currentIndex;
				
			}else if(cummulativeSum <0){
				maxStartIndexUntilNow = currentIndex+1;
				cummulativeSum=0;
			}
			
			
		}
		
		System.out.println("Max sum         : " + maxSum);
		System.out.println("Max start index : " + maxStartIndex);
		System.out.println("Max end index   : " + maxEndIndex);
		System.out.println();
	}


}
