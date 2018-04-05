package SortingAndSearching;

/**
Write a function, in C++, Java, or C#, to find the largest odd integer in an array.  For example, from [ 7, 9, 2, 10 ], return  9.
method should return 0 in case no odd number found or array is empty.

*/

public class LargestOddIntegerInArray {

    public static boolean isOdd(int num){

      if(num %2 ==0 ) return false;  // even if the number is negative for example -8%2 -> answer is 0 and for -3%2 answer is -1 which is not 0.

      return true;
    }
    public static int getLargestOddInt(int[] array){

      if(array.length==0) return 0;

      int largest = Integer.MIN_VALUE; // start with the smallest value

      for(int number: array){
        //If the number is ODD and also if it is greater than the largest number we have so far, update the largest number
        if(isOdd(number) && largest< number) largest=number;
      }
      if(largest == Integer.MIN_VALUE ) largest=0;
      return largest;
    }

    public static void main(String args[]){

      //All the test data i can send
      int[][] testData = new int[][]{

          {},
          {0},
          {4,6,8},
          {-5,6,-8,-9,4,8},
          {1,2,3,4,5},
          {3,5,6,8,9,19},
          {3,-5,6,-8,-9,}
      };
      for(int[] array: testData){
        for(int i: array) {
          System.out.print(i + " ");
        }
        int largest = getLargestOddInt(array);
        System.out.println("  -> Largest Odd ="+largest );
        System.out.println( );

      }

    }
}
