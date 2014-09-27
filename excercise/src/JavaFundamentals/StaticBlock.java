package JavaFundamentals;

class TestStatic{
	// static block is executed before even the constructor
	static{
		System.out.println("This is static block1 of TestStatic");
	}
	TestStatic(){
		System.out.println("constructor:TestStatic");
	}
	static{
		System.out.println("This is static block2 of TestStatic");
	}
}
public class StaticBlock {
	int day;
	static{
		System.out.println("This is static block 1 of StaticBlock");
	}
	
	StaticBlock(int day){
		System.out.println("constructor:StaticBlock with day="+day);
		this.day=day;
	}

	public static void main(String args[]){
		
		StaticBlock sb = new StaticBlock(25);
		System.out.println(" ---------------");
		TestStatic ts = new TestStatic();
	}
}
