package JavaFundamentals;

class A {
	boolean b;
	int i;
	A(int i){
		this.i = i;
	}
	A go(A a){
		a =null; // a2copy is set to null
		return a; // null is returned
	}
	public String toString(){	
		return ""+i;
	}
}
public class GarbageCollectionEligibility {
		
	static void test(A a) {
        try { System.out.println(a); } 
        catch(Exception e) { System.out.println((String)null); }
    }

	public static void main(String args[]){
		A a1 = new A(1);
		A a2 = new A(2);
		A a3 = new A(3);
		a3 = a1.go(a2); // A Copy of a reference a2 [ie.e a2copy] is passed.  a3 is set to null. 
		a1=null; // a1 is set to null.
		
		//So now, object earlier referred to by a1 and a3 are now eligible for garbage collection.
		// object referred by a2 is not eligible for GC.
		
		test(a1);
		test(a2);
		test(a3);
		
	}
	
}
