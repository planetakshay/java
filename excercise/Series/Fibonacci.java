package Series;

import java.util.ArrayList;

public class Fibonacci {
	
	
	public static void main(String args[]){
		Fibonacci fibo = new Fibonacci();
		System.out.println("Dynaic programming");
		fibo.fibonacciDynamic(0);
		System.out.println();
		fibo.fibonacciDynamic(1);
		System.out.println();
		fibo.fibonacciDynamic(2);
		System.out.println();
		fibo.fibonacciDynamic(3);
		System.out.println();
		fibo.fibonacciDynamic(10);
		System.out.println();
		System.out.println("Non Recursive Method");
		fibo.fibonacciNonRecursive(10);
		System.out.println("Recursive Method");
		for(int i=0;i<10;i++){
			System.out.print(fibo.fibonacciRecursion(i)+",");
		}
	}
	
	//Fibonaccci with dynamic programming
	public void fibonacciDynamic(int n){
		//System.out.println();
		if(n<=0){
			return;
		}
		if(n==1){
			System.out.print(0+",");
			return;
		}
		if(n==2){
			System.out.print(0+","+1+",");
			return;
		}
		
		int[] remember = new int[n];
		remember[0]=0;
		remember[1]=1;
		System.out.print(remember[0]+","+remember[1]+",");
		for(int i=2;i<n;i++){
			remember[i] = remember[i-1]+remember[i-2];
			System.out.print(remember[i]+",");
		}
		
	}
	//Fibonacci non recursive
	public void fibonacciNonRecursive(int n){
		int i=0;
		int j=1;
		System.out.print(i+","+j+",");
		for(int c=2;c<n;c++){
			int fibo = i+j;
			i=j;
			j=fibo;
			System.out.print(fibo +",");
		}
	System.out.println();
	}
	
	//Fibonacci series with recursion
	public int fibonacciRecursion(int n){
		
		
		if(n<0){
			return -1;
		}
		if(n==0 ){
			return 0;
		}
		if(n==1){
			return 1;
		}
		return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
	}
}
