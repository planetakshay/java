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
		boolean increment=false;
		boolean trailingones=false;
		int j=0;
		for(int i=array.length-1;i>=0;i--){
			j=i;
			if(array[i]==0 ){
				if(trailingones==false) {
					array[i]=1;
					increment=true;
					break;
				}else{
					break;
				}
				
			}else if(array[i]==1){
				trailingones=true;
			}
		}
		if(!increment && trailingones){
			array[j]=1;
			while(j<array.length-1){
				array[++j]=0;
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
		
		int w=16;
		int[] array = new int[w];
		
		for(int i=0;i<w;i++){
			array[i]=0;
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int i=1;
		while(!reachedMaxNumber(array)){
			array = increment(array);
			System.out.print(i+"=");
			for(int j:array){
				System.out.print(j+" ");
			}
			System.out.println();
			i++;
		}
	}
	
	
}
