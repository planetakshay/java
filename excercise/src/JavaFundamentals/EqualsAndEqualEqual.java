package JavaFundamentals;

public class EqualsAndEqualEqual {
	
	 public static void main(String[] args) {
		 
		   String s1 ="abc";
		   String s2 = s1;
		   String s3 = "abc";
		 	 System.out.println("== comparison : " + (s1 == s3));
		   System.out.println("== comparison : " + (s1 == s2));

		   System.out.println("Using equals method : " + s1.equals(s2));


		   String s44 = new String("abc");
		   String s55 = new String("abc");
		   System.out.println("== comparison : " + (s44 == s55));
		   System.out.println(" == comparison : " + String.valueOf(s44==s55));
		   System.out.println("Using equals method : " + s44.equals(s55));
	 }
}
