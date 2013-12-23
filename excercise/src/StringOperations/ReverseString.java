package StringOperations;

public class ReverseString {
	
	public static void reverse(char[] s,int start,int end){
		char temp = 0;
		System.out.println(temp);
		while(start<end){
			temp = s[start];
			s[start] = s[end];
			s[end] =temp;
			start++;
			end--;
		}
	}
	
	public static void reverseEachWord(char[] s,int start, int end){
		char ch=0;
		int wEnd=0;
		int wStart=0;
		for(int i=0;i<s.length-1;i++){
			ch = s[i];
			if(ch==' '){
				wEnd--;
				ReverseString.reverse(s, wStart, wEnd);
				wEnd+=2;
				wStart=wEnd;
			}
			else{
				wEnd++;
			}
		}
	}
	public static void main(String args[]){
		String s  = "i love java so much that i am practicing it";
		char[] schar = s.toCharArray();
		ReverseString.reverse(schar, 0, schar.length-1);
		for(char c: schar){
			System.out.print(c);
		}
		ReverseString.reverseEachWord(schar, 0, schar.length-1);
		for(char c: schar){
			System.out.print(c);
		}
	}

}
