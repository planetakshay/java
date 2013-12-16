package JavaFundamentals;

/**
 * Class demonstrates run time polymorphism.
 * for static method, the type of reference matters and the static method of the type is executed
 * for non static regular method, the object to which the reference points to matters. and that objects method gets executed.
 * 
 * @author Akshay
 *
 */
class CoffeeShop{
	
	public static void original(){
		System.out.println("CoffeeShop: Original");
	}
	public void regular(){
		System.out.println("CoffeeShop: Regular");
	}
}
class StarBucks extends CoffeeShop{
	
	public static void original(){
		System.out.println("StarBucks:Original");
	}
	public void regular(){
		System.out.println("StarBucks: Regular");
	}
}
public class RunTimePolymorphismStaticAndNonStaticMethods {
	
	
	public static void main(String args[]){
		StarBucks sb = new StarBucks();
		sb.original();
		CoffeeShop cs = new CoffeeShop();
		cs.original();
		System.out.println("-----------");
		CoffeeShop csbs = new StarBucks();
		csbs.original(); // since original is static, type of the reference matters and coffee shop original method is executed
		csbs.regular(); // since regular is non static, the object to which csbs reference points to matters and regular of starbucks is executed
		
	}

}
