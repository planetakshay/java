package arraymanipulation;

/**
 * Given an array that has zeros at random places,
 * move all of them to the right most positions in the array.
 * 
 * Do not care about the order of the other elements or the positions
 * Motorola - a google company
 * 
 * @author Akshay
 *
 */
public class MoveZerosToTheRight {

	public static int[] moveZerosToRight(int[] array){
		int startIndex=0;
		int endIndex = array.length-1;
		for(startIndex=0;startIndex<endIndex;startIndex++){
			if(array[startIndex]==0){
				array[startIndex]=array[endIndex]; // Swap the variables
				array[endIndex]=0; // we know that array[startIndex] was 0 so just assigned 0 to array[endIndex]
				endIndex--; // Since we placed zero at the end
				startIndex--; // What if the original array[endIndex] that we assigned to array[startIndex] itself was 0? we need to decrease startIndex so that it is considered again
			}	
		}
		return array;
	}
	
	public static void printArray(int[] array){
		for(int i: array){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int[] array = new int[]{4,6,0,4,6,0,4,5,6,0};
		moveZerosToRight(array);
		printArray(array);
		array = new int[]{0,0,6,7,4,0,5,6,7,0,0};
		moveZerosToRight(array);
		printArray(array);
		array = new int[]{6,7,4,5,6,7,0,0};
		moveZerosToRight(array);
		printArray(array);
		array = new int[]{6,0,0,5,0,7,0,0};
		moveZerosToRight(array);
		printArray(array);
	
	}
	
}
