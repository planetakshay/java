package StringOperations;

/**
 * Given two strings find out if one string is a sub string of another one
 * Do not use inbuild methods to find
 * @author Akshay
 *
 */
public class isSubString {

	public static boolean isSubString(String s1,String s2){
		
		if(s1=="" && s2=="") return true;
		
		if(s1=="" && s2.length()>0 || s1.length()>0 && s2=="") return false;
		
		if(s1.length()>s2.length()) return false;
		
		for(int i=0;i<s2.length();i++){
			if(s1.charAt(0)==s2.charAt(i) && (s2.length()-i>=s1.length())){ // if the first character match is found and remaining s2 is greater than s1
				int temp=i;// store position of i
				for(int j=0;j<s1.length();j++,temp++){ //compare next characters between s1 and s2
					if(s1.charAt(j)!=s2.charAt(temp)){ 
						break;  // if characters do not  match, break out of comparision inner loop
					}else if(j==s1.length()-1){ //if all the characters have matched return true;
						return true;
					}
				}
			}
		}
		return false; 
	}
	
	public static void main (String args[]){
		
		System.out.println("True:"+isSubString("subString","mysubString"));
		System.out.println("True:"+isSubString("subString","mysubStringsub"));
		System.out.println("True:"+isSubString("subString","subString"));
		System.out.println("False:"+isSubString("subString","testingsubStrin123"));
		System.out.println("True:"+isSubString("",""));
		 
	}
}
