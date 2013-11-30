package JavaFundamentals;

/**
 * 
 * important thing to note is that inner class has access to all varialbes and methods of the 
 * enclosing class. However, outer class does not have access to variables and methods inside
 * inner class.
 * @author Akshay
 *
 */
class Outer {	
	public int outer_a=100;
	
	public void test(){
		System.out.println("Outer test:");
		Inner inner = new Inner();
		inner.display();
	}
	public void display(){
		System.out.println("Outer display:");
		System.out.println("Outer display: inner a via new inner object "+ new Inner().inner_a);
		System.out.println("Outer display: does not have access to inner_a");
		//System.out.println("outer display: inner a "+ inner_a); //Outer Display does not have acces to inner_a
	}
	class Inner{
		public int inner_a=200;
		
		void display(){
			
			System.out.println("Inner display: outer_a="+outer_a );
		}
	}
	

}
public class InnerClassDemo {
	
	public static void main(String args[]){
		Outer outer = new Outer();
		outer.test();
		outer.display();
	}
		
}
	

