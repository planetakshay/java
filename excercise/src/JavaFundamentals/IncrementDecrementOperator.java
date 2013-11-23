package JavaFundamentals;

public class IncrementDecrementOperator {
	
	public static void main(String args[]){
		
		int x=3;
		int y=9;
		do{
			if(++x > y--){
				continue;
			}
		}while(x<8);
	System.out.println("X = "+x +" Y = "+ y);

	 x=3;
	 y=9;
	do{
		if(++x < y--){
			
		}
	}while(x<8);
System.out.println("X = "+x +" Y = "+ y);

	
	}

}
