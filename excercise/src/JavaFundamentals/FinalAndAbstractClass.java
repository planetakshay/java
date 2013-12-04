package JavaFundamentals;

abstract class MyAbstractClass{
	
}

final class MyFinalClass{
	//Final class can be instantiated
}

//class C extends MyFinalClass{ // final class can not be extended
	
//}

public class FinalAndAbstractClass {
	
//	MyAbstractClass a = new MyAbstractClass(); //Abstract class can not be instantiated
	
	MyFinalClass finalClassInstance = new MyFinalClass();  // Final class can be instantiated
	
}
