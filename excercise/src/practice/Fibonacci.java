package practice;

public class Fibonacci {

	
	
	
	public int fibor(int n){
		if(n<0) return -1;
		if(n==0) return 0;
		if(n==1) return 1;
		//System.out.print(n+",");
		return fibor(n-1)+fibor(n-2);
		
		
	}
		public static void main(String args[]){
			Fibonacci fibo = new Fibonacci();
			
			for(int i=0;i<=10;i++){
				System.out.print(fibo.fibor(i)+",");
			}
			System.out.println();
			int fibocount = 10;
			int i=0;
			int j=1;
			System.out.print("0,1,");
			for(int c=2;c<fibocount;c++){
						int fibon = i+j;
						System.out.print(fibon+",");
						int temp =j;
						i =j;
						j=fibon;
			}

		}
	}
	
	

