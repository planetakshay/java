package StringOperations;
/**
 * This program substitutes  %20 every time it encounters space.
 * 
 * @author Akshay
 *
 */
public class substituteTwentyAtSpace {

	public static void main(String args[]){
		String str = "This is a string with spaces. ";
		String newStr = substituteWithStringBuilder(str);
		System.out.println(newStr);
		
	}
	
	public static String substituteWithStringBuilder(String str){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(String.valueOf(c).equalsIgnoreCase(" ")){
				sb.append("%20");
			}
			else{
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
