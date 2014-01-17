package StringOperations;

public class Palindrome {
	
	public static boolean isPalindrome(String s){
		char[]c = s.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j){
			if(c[i]!=c[j]){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	
	public static void main(String args[]){
		System.out.println(isPalindrome("birdrib"));
		System.out.println(isPalindrome("birddrib1"));
		
		}
	

}
