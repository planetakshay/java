package arraymanipulation;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */
public class ProductOfArrayExceptSelf {

    public static Set<Integer> getZeroIndicesAndProduct(int[] num){
        Set<Integer> zeroIndices = new HashSet<>();
        for(int i=0;i<num.length;i++){
            if(num[i] == 0) zeroIndices.add(i);
        }
         return zeroIndices;
    }

    public static int getProductOfelement(int[] num,boolean skipZero){
        int product = num[0];
        if(num[0]==0){
            skipZero = false;
        }
        for(int i=1;i<num.length;i++){
            if(num[i] == 0 && skipZero){
                skipZero = false;
                continue;
            }
            product = product * num[i];
        }
        return product;
    }
    public static int[] getProductOfArrayExceptSelf(int[] num){
        int [] productArray = new int[num.length];
        int productOfElements;
        Set<Integer> zeroIndices;
        zeroIndices = getZeroIndicesAndProduct(num);

        if(zeroIndices.size() == 0){
            productOfElements = getProductOfelement(num,false);
            for(int i=0;i<num.length;i++){
                productArray[i] = productOfElements / num[i];
            }
        }else if(zeroIndices.size()==1){
            productOfElements = getProductOfelement(num,true);
            for(int i=0;i<num.length;i++){
               if(zeroIndices.contains(i)){
                  productArray[i] = productOfElements;
               }else{
                   productArray[i]=0;
               }
            }
        }else if(zeroIndices.size()>1){
            for(int i=0;i<num.length;i++){
                    productArray[i]=0;
                }
        }
        return productArray;
    }
    public static void main(String[] args){
        int[][] nums = {{-1,1,0,-3,3},{1,2,3,4},{0,0},{0},{-1,-2,-3,9}};
        for( int[] num: nums){
            System.out.println(Arrays.toString(getProductOfArrayExceptSelf(num)));
        }
    }

}
