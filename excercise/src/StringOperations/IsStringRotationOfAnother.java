package StringOperations;

/**
 * Given two strings, find out if one string is rotation of the other
 * 
 * @author Akshay
 *
 */
public class IsStringRotationOfAnother {
	public static void main(String args[]){
		System.out.println(isRotation("dadabc","abcdad"));
		System.out.println(isRotation("dadabc","bcadad"));
		System.out.println(isRotation("dadabc","dadabcdadabcabc"));
	}
	//Find if s1 is rotation of s2
	public static boolean isRotation(String s1,String s2){
		String s22 = s2+s2;
		return s22.indexOf(s1)!=-1 && s1.length()==s2.length();
	}

}
