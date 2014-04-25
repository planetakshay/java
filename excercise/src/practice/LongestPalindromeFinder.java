package practice;

public class LongestPalindromeFinder {
	
	public static void main(String args[]){
		LongestPalindromeFinder lpf = new LongestPalindromeFinder();
		 System.out.println(lpf.longestPalindromeString("1221"));    
	        System.out.println(lpf.longestPalindromeString("1234"));
	        System.out.println(lpf.longestPalindromeString("12321"));
	        System.out.println(lpf.longestPalindromeString("9912321456"));
	        System.out.println(lpf.longestPalindromeString("9912333321456"));
	        System.out.println(lpf.longestPalindromeString("12145445499"));
	}
	public String longestPalindromeString(String s){
		char[] input = s.toCharArray();
		int lpstart=0;
		int lpend=0;
		for(int mid=0;mid<input.length;mid++){
			//for odd palindrome left and and right would be next to the middle.
			int left=mid-1;
			int right=mid+1;
			while(left>=0 && right<input.length){
				if(input[left]==input[right]){
					if(right-left > lpend-lpstart){
						lpstart=left;
						lpend=right;
					}
				}
				left--;
				right++;
			}
			
			//For even palindrome
			 left=mid-1;
			 right=mid+2;
			 while(left>=0 && right<=input.length){
				 if(input[left]==input[right]){
					 if(right-left >lpend-lpstart){
						 lpend=right;
						 lpstart=left;
					 }
				 }
				 left--;
				 right++;
			 }
			 
		}
		return s.substring(lpstart,lpend+1);
	}

}
