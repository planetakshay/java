package StringOperations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceOrExtractAPhoneNumber {
	private final static String regEx = "[0-9]{3}[-][0-9]{3}[-][0-9]{4}|[(][0-9]{3}[)][-][0-9]{3}[-][0-9]{4}";
	public static String removePhoneNumbers(String phoneNumber){

		String noPhoneNumber="";
		noPhoneNumber = phoneNumber.replaceAll(regEx, "");
		return noPhoneNumber;
		
	}
	public static void extractPhoneNumbers(String s1){
       
		Pattern pattern = Pattern.compile(regEx);
		
		Matcher matcher = pattern.matcher(s1);
		
		while (matcher.find()) {
		    System.out.println(matcher.group(0));
		    
		}
		
	}
	
	public static void main(String args[]){
		String s ="djfhjhaf(408)-333-5555 kjdskljflk  454-555-3333 dfdsafkjk dsfdsfs dsjfsfnfsdf(343-334-4444 dsfadsdfdkjf ";
		System.out.println("403--4bc-33-3555 ="+removePhoneNumbers(" 403--4bc-33-3555"));
		System.out.println("123-456-7890="+removePhoneNumbers("123-456-7890"));
		
		System.out.println(s+"===\n"+removePhoneNumbers(s));
		System.out.println("-----------------");
		extractPhoneNumbers(s);
	}
}
