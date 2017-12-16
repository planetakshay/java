package JavaFundamentals;

public class EqualsAndEqualEqual {
	
	 public static void main(String[] args) {
		 
		   String s1 ="abc";
		   String s2 = s1;
		   String s3 = "abc";

		   //For a primitive type - reference comparision via == or object comparison bia .equals method both result in same answer - that is true
		 	 System.out.println("== comparison : " + (s1 == s3));
		   System.out.println("== comparison : " + (s1 == s2));

		   System.out.println("Using equals method : " + s1.equals(s2));
		   System.out.println("Using equals method : " + s1.equals(s3));


		   //For a String non primitive type - actual object - reference comparision results in answer false whereas object content comparision via .equals method results answer true
		   String s44 = new String("abc");
		   String s55 = new String("abc");
		   System.out.println("== comparison : " + (s44 == s55));  //false - because both objects have different references
		   System.out.println("Using equals method : " + s44.equals(s55)); // true -  becasue both objects have same content 'abc'



	 }
}
