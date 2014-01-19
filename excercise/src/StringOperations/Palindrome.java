package StringOperations;

public class Palindrome {
	//This method relies on the fact that two characters are similar at the end and at the begining
	// also when you increase or decrease the indices.
	public static boolean isPalindromeCompare(String s){
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
	//This method first reverses the given string and then compares it with its original form to find out
	// if the given string is a palindrome or not
	public static boolean isPalindromeStringReverse(String s2){
		char[] c = s2.toCharArray();
		int start = 0;
		int end = c.length-1;
		while(start<end){
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
		//System.out.println(c);
		return s2.equalsIgnoreCase(String.valueOf(c));
	}
	
	public static void main(String args[]){
		System.out.println(isPalindromeCompare("birdrib"));
		System.out.println(isPalindromeStringReverse("birddrib1"));
		
		}
	

}
