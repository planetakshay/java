package mathproblems;

/*
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
 */
public class PrintAllBinaryNumbers {

	public static int[] increment(int[] array){

		boolean trailingones=false;
		
		for(int i=array.length-1;i>=0;i--){
			
			if(array[i]==0  ){
				if(!trailingones) {
					array[i]=1;
					return array;
				}else{
					array[i]=1;
					while(i<array.length-1){
						array[++i]=0;
					}
					return array;
				}
			}else if(array[i]==1 && !trailingones){
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
