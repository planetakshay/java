package arraymanipulation;

public class MaxSubArray {
	
	public static void main(String[] args) {

		int[] intArr = { -3, -1, -1, -1, -1, -1, -2, -5, -3, -2 };

		findMaxSubArray(intArr);
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
