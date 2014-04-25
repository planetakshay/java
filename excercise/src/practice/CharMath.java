package practice;

/**
 * Netflix onsite:
 * Given a remote layout write a method that will move the cursor and print
 * movie name
 * 
 * a b c d 
 * e f g h
 * i j k l
 * m n o p
 * q r s t
 * u v w x
 * y z _
 * 
 * a -(0,0)
 * d - (0,4)
 * h - (1,3)
 * o - (3,2)
 * z - (6,1)
 * 
 * @author Akshay
 *
 */
public class CharMath {

	public static void main (String args[]){
		//String s = "House of Cards";
		String s = "a";
		int cX =0;
		int cY=0;
		int dX=0;
		int dY=0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			System.out.println("c ="+(int)c);
			// h - (1,3)
			// o - (3,2)
			int pX = Integer.valueOf((((int)c/3)%10));
			//System.out.println(pX);
			//int l = 72;
			System.out.println(Math.floor(c/97));
			System.out.println(c%97);
			//System.out.println(l/5);
//			System.out.println(Math.floor(72.56));
//			System.out.println(Math.ceil(72.56));
//			System.out.println(Math.abs(-72.56));
//			System.out.println(Math.round(72.56));
//			System.out.println(Math.round(72.49999));
			
		}
		
		

	}
	
}
