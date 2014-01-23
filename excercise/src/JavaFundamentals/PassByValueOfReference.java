package JavaFundamentals;

public class PassByValueOfReference {
	
	static class BB{
		int i;
		BB(int i){
			this.i=i;
		}
		public void display(){
			System.out.println("i="+this.i);
		}
		public BB nullRef(BB B){
			System.out.println("Assigning null to");
			B.display();
			B=null;
			return B;
		}
	}
	public static BB nullRefClass(BB B1){
		B1=null;
		return B1;
	}
	public static void main(String args[]){
		try{
		BB B = new BB(10);
		B = B.nullRef(B);
		B.display();
		}catch(Exception e){
			e.printStackTrace();
		}
		BB B = new BB(9);
		B.nullRef(B);
		B.display();
		
		
		BB B1 = new BB(8);
		nullRefClass(B1);
		B1.display();
	}

}
