package Math;

public class ConvertDecimalNumberToBinary {
	public static void printBinary(int i){
		StringBuffer sb = new StringBuffer();
		int rem=0;
		while(i>0){
			rem = i%2; // reminder will be either 1 or 0
			sb.append(rem);
			i=i/2; // number will decrease and finally we will have 1/2 and i will be 0.
		}
		sb.reverse();
		System.out.println(sb.toString());
	}
	public static void main(String args[]){
		int array[]  = new int[]{4,5,11,16,3}; 
		
		for(int i: array){
			printBinary(i);
		}
	}

}
