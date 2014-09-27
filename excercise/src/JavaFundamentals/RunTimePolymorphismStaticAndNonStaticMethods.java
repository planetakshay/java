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
		System.out.println("CoffeeShop: Original - Public Static Method");
	}
	public void regular(){
		System.out.println("CoffeeShop: Regular - public void method");
	}
	protected void latte(){
		System.out.println("CoffeeShop: Latte - protected void method");
	}
}
class StarBucks extends CoffeeShop{
	
	public static void original(){
		System.out.println("StarBucks:Original - public static void method");
	}
	public void regular(){
		System.out.println("StarBucks: Regular - public void method");
	}
	protected void latte(){
		System.out.println("StarBucks: Latte - protected void method");
	}
}
public class RunTimePolymorphismStaticAndNonStaticMethods {
	
	
	public static void main(String args[]){
		System.out.println("\nCalling all methods on the objects of those class using the reference that points to that class\n");
		CoffeeShop cs = new CoffeeShop();
		cs.original();
		cs.regular();
		cs.latte();
		StarBucks sb = new StarBucks();
		sb.original();
		sb.regular();
		sb.latte();
		System.out.println("-----------");
		System.out.println("\nCoffeeshop reference points to a StarBucks Object\n");
		CoffeeShop csbs = new StarBucks();
		csbs.original(); // since original is static, type of the reference matters and coffee shop original method is executed
		csbs.regular(); // since regular is non static, the object to which csbs reference points to matters and regular of starbucks is executed
		csbs.latte(); // since latte is protected and not static, the object to which csbs reference points to matters and starbucks's latte method is executed
	}

}
