package practice;

public class UniqueChars {
	
	public static boolean ifUniqueChars(String s){
		boolean[] charMap = new boolean[256];
		for(int i=0;i<256;i++){
			charMap[i]=false;
		}
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(charMap[(int)c]){
				return false;
			}else{
				charMap[(int)c]=true;
			}
		}
		return true;
	}
	public static void main(String args[]){
		System.out.println(ifUniqueChars("akshay"));
		System.out.println(ifUniqueChars("akshy"));
		System.out.println(ifUniqueChars("akshyA__"));
		
		
	}

}
