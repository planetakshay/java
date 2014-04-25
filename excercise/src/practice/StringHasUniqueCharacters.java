package practice;

public class StringHasUniqueCharacters {

	public static boolean stringHasUniqueCharacters(String s){
		boolean[] charSet = new boolean[256];
		for(int i=0;i<charSet.length;i++){
			charSet[i]=false;
		}
		for(int i=0;i<s.length();i++){
			int c = s.charAt(i);
			if(charSet[c]){
				return false;
			}else{
				charSet[c]=true;
			}
		}
		
		return true;
	}
	public static void main(String args[]){
		System.out.println("ABCDEFGH"+"->"+stringHasUniqueCharacters("ABCDEFGH"));
		System.out.println("ABA"+"->"+stringHasUniqueCharacters("ABA"));
	}
}
