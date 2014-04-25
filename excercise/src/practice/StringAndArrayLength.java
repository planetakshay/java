package practice;

public class StringAndArrayLength {
	
	public static void main(String args[]){
		String s="Akshay";
		char[]ch = s.toCharArray();
		System.out.println(s.length());
		System.out.println(ch.length);
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i));
		}
	}

}
