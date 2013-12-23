package JavaFundamentals;

public class IncrementDecrementOperator {
	
	public static void main(String args[]){
		
		int x=5;
		int y=9;
		do{
			System.out.println(" inside do before if x="+x+"y="+y);
			if(++x > y--){ 
				System.out.println(" inside if x="+x+"y="+y);
				continue;
			}
			System.out.println(" inside do after if x="+x+"y="+y);
		}while(x<8);
		System.out.println();
	System.out.println(" -- X = "+x +" Y = "+ y);

	 x=5;
	 y=9;
	do{
		if(++x < y--){
			
		}
	}while(x<8);
System.out.println("## X = "+x +" Y = "+ y);

	
	}

}
