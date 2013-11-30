package JavaFundamentals;

/**
 * Final, Finalize and Finally.
 * Here is a good reference that explains it all
 * http://javarevisited.blogspot.com/2012/11/difference-between-final-finally-and-finalize-java.html
 * 
 * @author Akshay
 *
 */
final class  FinalClass{   // Final class can not be instantiated
	boolean b;
	int i;
	FinalClass(int i){
		this.i=i;
	}
	public void display(){
		System.out.println("i="+i);
	}
}
class ClassWithFinalVariables{
	final boolean b=true;
	int apples;
	ClassWithFinalVariables(boolean b,int i){
		// this.b=b; // final variable can not be assigned any other value
		this.apples=i;
	}
	final public String getApples(){
		return ""+apples;
	}
}
class SubClassOfClassWithFinalVariables extends ClassWithFinalVariables{

	SubClassOfClassWithFinalVariables(boolean b, int i) {
		super(b, i);
		// TODO Auto-generated constructor stub
	}
	/* final method can not be overloaded in a subclass
//	public String getApples(){ 
//		
//		return "";
//	} */
	
}

class AA{
	int i;
	AA(int i){
		this.i=i;
	}
	public AA nullRef(AA a){
		a = null;
		return a;
	}
	public String toString(){
		return ""+i;
	}
	public void finalize(){
		System.out.println(" Finalized called by garbage collection. i = "+i);
	}
}

public class FinalFinallyFinalize {
	static void test(AA a) {
        try { System.out.println(a); } 
        catch(Exception e) { System.out.println((String)null); }
    }
	
	public static void main(String args[]){
		
		int x=10;
		int y=0;
		
		try{
			int z = x/y;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("finally is always called called");
		}
		
		// FinalClass fc = new FinalClass(3);  // Final Class can not be instantiated
		AA a1 = new AA(1);
		AA a2 = new AA(2);
		AA a3 = new AA(3);
		a3 = a1.nullRef(a2); // Copy of the reference a2 is passed which is made null and returned.
		a1=null; // a3 in previous instruction is null and now a1 is also null. Object referred to by a2 is not distroyed
		test(a1);
		test(a2);
		test(a3);
		System.gc();
	
	}

}
