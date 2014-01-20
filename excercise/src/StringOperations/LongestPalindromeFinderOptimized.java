package StringOperations;

public class LongestPalindromeFinderOptimized {
    //int longestPalindromeStart = 0;
    //int longestPalindromeEnd = 0;
         
    public static void main(String[] args) {
        LongestPalindromeFinderOptimized lpf = new LongestPalindromeFinderOptimized();
        System.out.println(lpf.longestPalindromeString("1221"));    
        System.out.println(lpf.longestPalindromeString("1234"));
        System.out.println(lpf.longestPalindromeString("12321"));
        System.out.println(lpf.longestPalindromeString("9912321456"));
        System.out.println(lpf.longestPalindromeString("9912333321456"));
        System.out.println(lpf.longestPalindromeString("12145445499"));
    }
 
    public int[] getLongest(char[] input,int left,int right,int longestPalindromeStart,int longestPalindromeEnd){
    	
    	while (left >= 0 && right < input.length) {
           // System.out.println("inside while of odd palindrome");
        	// below check to find out if its a palindrome
            if (input[left] == input[right]) {
                // update global indexes only if this is the longest one till now
                if (right - left > longestPalindromeEnd
                        - longestPalindromeStart) {
                    longestPalindromeStart = left;
                    longestPalindromeEnd = right;
                }
            }
        	
            left--;
            right++;
        }
    	return new int[]{longestPalindromeStart,longestPalindromeEnd};
    }
    
    /**
     * This method returns the longest palindrome in the input String
     * 
     * @param in
     * @return
     */
    public String longestPalindromeString(String in) {
        char[] input = in.toCharArray();
        LongestPalindromeFinderOptimized lpf = new LongestPalindromeFinderOptimized();
        int longestPalindromeStart = 0;
        int longestPalindromeEnd = 0;
        
         
        for (int mid = 0; mid < input.length; mid++) {
            // for odd palindrom case like 12321, 3 will be the mid
            int left = mid-1;
            int right = mid+1;
            int[] indx =   lpf.getLongest(input, left, right, longestPalindromeStart, longestPalindromeEnd);
            longestPalindromeStart = indx[0];
            longestPalindromeEnd = indx[1];
            // we need to move in the left and right side by 1 place till they reach the end

            // for even palindrome, we need to have similar logic with mid size 2
            // for that we will start right from one extra place
            left = mid-1;
            right = mid + 2;// for example 12333321 when we choose 33 as mid
            int[] indx1 =   lpf.getLongest(input, left, right, longestPalindromeStart, longestPalindromeEnd);
            longestPalindromeStart = indx1[0];
            longestPalindromeEnd = indx1[1];
           
        }
        // we have the start and end indexes for longest palindrome now
        return in.substring(longestPalindromeStart, longestPalindromeEnd + 1);
    }
 
}