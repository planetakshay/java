package StringOperations;

public class ReplaceUsWithThem {

	
	public static String replace(String str){
		//String  regex="us|US";
	
	//	str = str.replaceAll(regex, "them");
	//	str = str.replaceAll("(^| )us($| )", " them ").trim(); //Got this from Prachi
		str = str.replaceAll("$us", "*them*");
		return str;
	}
	public static void main(String args[]){
		String str = "us We are here and they will give it to us us. They said to us, how are you. US and us";
		System.out.println(ReplaceUsWithThem.replace(str));	
	}
}
