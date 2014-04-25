package practice;

/*
 * given two strings find out if they are anarams or not
 */
public class Anagram {
	
	public boolean isAnagram(String s1,String s2){
		if(s1.length()!=s2.length()) return false;
		char[] ch = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s2);
		for(char c:ch){
			int index = sb.indexOf(""+c);
			if(index!=-1) sb.deleteCharAt(index);
			if(index==-1) return false;
		}
		return sb.length()==0;
	}
	
	public static void main(String args[]){
		Anagram an = new Anagram();
		System.out.println(an.isAnagram("dad", "add"));
		System.out.println(an.isAnagram("dadd", "add"));
		System.out.println(an.isAnagram("aadd", "dada"));
		System.out.println(an.isAnagram("aad1", "dada"));
	}
}
