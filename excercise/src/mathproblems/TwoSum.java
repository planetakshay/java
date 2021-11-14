package mathproblems;

/** Given an integer array and a sum, return indexes of the array elements that add up to the sum
 * i/p [ 3,4,2,5] sum = 7   o/p = [0,1]
 * i/p [ 3,4,2,5] sum = 6   o/p = [1,2]
 * i/p [ 3,4,2,5,0,3] sum = 7   o/p = [0,5]
 *
 */
public class TwoSum {

    public static int[] getSumIndex(int[] array, int sum){
        int[] index = new int[2];
        if(array.length <2){
            return null;
        }
        //iterate over all elements of array
        for(int i= 0; i<array.length;i++){
            // To add two elements start from the next one
            //As we move from left to right on the outer for loop, we only need to worry about combinations of elements to the right
            // because other combinations have been already added prior to that. for example in {1,2,3,4} we do 1+2, 1+3,1+4, 2+3,2+4,3+4
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j] == sum){
                    index[0]=i;
                    index[1]=j;
                    return index;
                }
            }
        }
        return index;
    }

    public static void main(String args[]){
        int[][] data = new int[][]{
                {3,4,5}, //0,1 (7) (first two)
                {3,4,2,5}, // 1,2 (6)
                {3,4,2,5,0,3},//0,1 (7)
                {45,2,4,88,56,-3},//1,5 (-1)
                {45,3,5,6,7,8,11,2,10},//2,4 (12)
                {45,3,5,5,7,8,11,2,15}}; // 7,8 (17) last two
        int[] sum = new int[]{7,6,7,-1,12,17};

        for(int i=0;i<data.length;i++){
            int[] index = TwoSum.getSumIndex(data[i],sum[i]);
            if(index !=null ){
                System.out.println(index[0]+" "+index[1] +" ");
            }
        }
    }
}
