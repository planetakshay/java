package mathproblems;

/*
 * This was originally a problem that goes like this.
 * You are given a N x N board. In each square of the board you can put a check mark or not.
 * Putting one check mark in one square creates one pattern. putting no check mark anywhere is another.
 * putting two check marks in [2 of N x N board]  is also a pattern and so on.
 * Print all the patterns that are possible with this approach for N X N board.
 * 
 * 000 - 0
 * 001 - 1
 * 010 - 2
 * 011 - 3
 * 100 - 4
 * 101 - 5
 * 110 - 6
 * 111 - 7  
 * 
 * Given n print all binary numbers
 * Or given a a board of game where 1 or zero is a layout, print all layouts.
 * or all combinations of 0 or 1
 * 
 * 
 */
public class PrintAllBinaryNumbers {

	public static int[] increment(int[] array){

		boolean trailingones=false;
		// Start reading array from least significant digit
		for(int i=array.length-1;i>=0;i--){
			
			if(array[i]==0  ){ // if we encounter zero then we need to flip the digit to 1
				if(!trailingones) { // if all trailing digits are not 1 then just turn the digit ON and return
					array[i]=1;
					return array;
				}else{ // if all trailing digits are 1s then turn on this digit to one and set all lower order bit to 0s
					array[i]=1; // turn on current bit thats 0
					while(i<array.length-1){ // set lower order bits to 0
						array[++i]=0;
					}
					return array;
				}
			}else if(array[i]==1 && !trailingones){ // if we encounter 1 that means trailing digits are all ones
				trailingones=true;
			}
		}
		return array;
	}
	
	public static boolean reachedMaxNumber(int[] array){
		
		for(int i:array){
			if(i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		
		int w=5;
		int[] array = new int[w];
		
		for(int i=0;i<w;i++){
			array[i]=0;
			System.out.print(array[i]+" ");
		}
		System.out.println();
		//long i=1;
		while(!reachedMaxNumber(array)){
			array = increment(array);
			//System.out.print(i+"=");
			for(int j:array){
				System.out.print(j+" ");
			}
			System.out.println();
			//i++;
		}
	}
	
	
}
