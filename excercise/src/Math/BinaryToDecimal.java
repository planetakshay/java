package Math;

public class BinaryToDecimal {
	
	public static void binaryToDecimal(String s){
		int i=0;
		int j=0;
		String number = s;
		while(s.length()>0){

			char c = s.charAt(s.length()-1);
			s = s.substring(0, s.length()-1);
			i += Math.pow(2, j) * Integer.parseInt(String.valueOf(c));
			j++;
		}
		System.out.println(number+" Result = "+i+"  ");
		//ConvertDecimalNumberToBinary.printBinary(i);
	}
	public static void main(String args[]){
		binaryToDecimal("101");
		binaryToDecimal("1011");
		binaryToDecimal("10110");
		
	}

}
