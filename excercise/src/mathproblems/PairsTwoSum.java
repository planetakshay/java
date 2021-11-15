package mathproblems;

import java.util.*;

public class PairsTwoSum {

    //Set that stores sum of all pair created by existing data set and new elements passed by array
    Set<Integer> pairSummation = new HashSet<>();
    //list that stores all the elements that are passed. Can not be a set because same number twice could generate more pairs
    List<Integer> data = new LinkedList<>();
    // Simple data structure to store a pair
    class Pair {
        int num1;
        int num2;
        Pair(int num1,int num2){
            this.num1 = num1;
            this.num2 = num2;
        }
    }
    // Map that contains key= sum of existing element of data and the integer being passed to store and all the corresponding pairs that sum corresponds to.
    Map<Integer,List<Pair>> sumPairsMap = new HashMap<>();
    // a method to process next element in data
    public void process(int number){
        //if data is empty add the number and if its has at least one element - then process to get pairs
        if(data.size()>=1){
            for( int element: data){
                int sum = element+number;
                pairSummation.add(sum);
                List<Pair> sumPairs;
                if(sumPairsMap.containsKey(sum)){
                    sumPairs = sumPairsMap.get(sum);
                }else{
                    sumPairs = new LinkedList<>();
                }
                sumPairs.add(new Pair(element,number));
                sumPairsMap.put(element+number,sumPairs);
            }
        }
        data.add(number);
    }

    public boolean test(int sum) {
        return pairSummation.contains(sum);
    }

    public List<Pair> getPairs(int sum){
        if(pairSummation.contains(sum)){
            return sumPairsMap.get(sum);
        }
        return null;
    }
    public static void main(String args[]){

        PairsTwoSum pts = new PairsTwoSum();
        int[] array = new int[]{3,4,5,6,7,8,9,10,5,13,11,2};
        // process each element in the array to find sum with other elements and discover and store sum pairs
        for(int i: array){
            pts.process(i);
        }
        //only if the sum 10 exists in pairSummation set that means we may have corresponding pairs
        if(pts.test(10)){
            List<Pair> pairs = pts.getPairs(10);
            if(pairs!=null){
                for(Pair p : pairs){
                    System.out.println(p.num1+ " , " +p.num2);
                }
            }
        }
    }
}
