package interviewexcercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


//Given a integer x and an unsorted array of integers, write a function to determine how many combonations of elements add up to x
//
//2,2,1,4,5,3
//
//sorted = 1,2,2,3,4,5
//
//datastructure
//error handling
//documentation
//unit test


public class NumberOfCombinationsAddUpToX{
    private static Map<Integer,Integer> freq = new HashMap<Integer,Integer>(); // Map to store how many times tow elements add up to //given sum
    
    static class Combination{  // type that stores unique combination of indexes
        int i;
        int j;
        Combination(int i,int j){
            this.i=i;
            this.i=j;
        }
    }

    private static Set<Combination> indexCombination = new HashSet<Combination>(); // a set that stores if given combination of indexes //have been accounted for or not previously
    
    public static boolean createFreqMap(int[] array){
        
        if(array==null || array.length<2) return false;
        
        for(int i=0;i<array.length;i++){  // traversal of all elements
            for(int j=0; j<array.length;j++){
                   
                   if(i!=j){
                               Combination comb = new Combination(i,j); //create a new combination object
                               int value=0; 
                               if(! indexCombination.contains(comb)){  //verify that this set of indexes have not been accounted //for
                                   int sum =array[i]+array[j]; //Find the sum and update the freq value
                                   if(freq.containsKey(sum)){
                                       value = freq.get(sum);
                                   }
                                  indexCombination.add(comb); 
                                  freq.put(sum,++value);
                               }                   
                   }
                   
            }
        }
        return  true;
    }
    public static void main(String args[]){
        int[] array = new int[] {2,2,1,4,5,3};
        int  sum = 5;
        
        if(createFreqMap(array) && freq.containsKey(sum)){
            System.out.println( "Number of occurances ="+ freq.get(sum));
        }else{
            System.out.println("Either array is null or the length is less than 2 or the sum was not formed by any two array elements");   
        
    }
      //Unit tests
      int[] array1 = new int[]{}; // sum=3, expected =0 .. empty array
      int[] array2 = new int[]{-2,3,3,5,6}; //sum =1 expected =2 .. negateive elemtns
      int[] array3 = new int[]{3}; // sum 4, expected=0 .. array less than minimum size needed to form the sum
      int[] array4 = new int[] { 4,2,3,2,3,2,5,66,7,5,4,3};// sum that is less than any two elemtns - sum=1
      int[] array5 = null; // just a null references
      int[] array6 = new int[]{2,2,2,2,2}; // sum=4, expected=4 , array with same elements and same sum for any two elements
      int[] array7 = new int[] {2,3,7}; //sum = 5 expected result as 1;
      

    }
}