package StringOperations;


public class ReverseString {

	public static void main(String[] args){
		String str = "I love JAVA";
		String rev = reverseString(str);
		System.out.println(rev);
		String reverseone = reverseStringOne(str.toCharArray(),0,str.length()-1);
		System.out.println(reverseone);
		String s = reverseStringTwo(str.toCharArray(),0,str.length()-1);
		System.out.println(s);
	}
	
	public static String reverseString(String str){
		char[] ch = str.toCharArray();
		char[] reverse = new char[ch.length];
		int j= ch.length;
		for(int i=0;i<=ch.length-1;i++){
			reverse[i]=ch[j-1];
			j--;
		}
		return String.valueOf(reverse);
	}
	public static String reverseStringOne(char[] str, int start,int end){
		char ch;
		while (end > start) {
			ch =str[start];
			str[start]=str[end];
			str[end] = ch;
			start++;
			end--;
		}
		return String.valueOf(str);
	}
	
	private static String reverseStringTwo(char[] inputString, int start, int end) {

		char character;

		int wStartIndex = start;
		int wEndIndex = end;

		while (wEndIndex > wStartIndex) {

			character = inputString[wStartIndex];

			inputString[wStartIndex] = inputString[wEndIndex];

			inputString[wEndIndex] = character;

			wEndIndex--;

			wStartIndex++;
		}
	return String.valueOf(inputString);
	}
}
		
	



 
	

	


