package generalalgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class FindWhichPairAddUpToTheSum {
	
	List<Integer> data = new ArrayList<Integer>();
	Map<Integer,Integer> numberOfPairsForSum = new HashMap<Integer,Integer>();
	Map<Integer,List<Pair>> sumPair = new HashMap<Integer,List<Pair>>();
	
	
	private class Pair{
		private int i,j;
		Pair(int i,int j){
			this.i= i;
			this.j=j;
		}
		public String toString(){
			return "i="+i+" j="+j;
		}
	}		
	
	public void store(int number){
		
		if(data.size() >0){	
			for(int i: data){
				int freq=0;
				int sum = i+number;
				if(numberOfPairsForSum.containsKey(sum)){
					freq = numberOfPairsForSum.get(sum);
				}
				if(sumPair.containsKey(sum)){
					sumPair.get(sum).add(new Pair(i,number));
				}else{
					List<Pair> listOfPairs = new ArrayList<Pair>();
					listOfPairs.add(new Pair(i,number));
					sumPair.put(sum, listOfPairs);
				}
				numberOfPairsForSum.put(sum,++freq);
			}	
		}
		data.add(number);
	}
	
	public void printNumberOfPairsForSum(){
		System.out.println("Printing number of pairs for each sum");
		for(Map.Entry<Integer, Integer> entry: numberOfPairsForSum.entrySet()){
			System.out.println(entry.getKey() + " = "+ entry.getValue());
		}
	}
	public String getNumberOfPairs(int sum){
		
		List<Pair> pairs  = sumPair.get(sum);
		System.out.print("------For Sum = " + sum+"--------------Pairs Are\n" );
		for(Pair pair: pairs){
		System.out.println(pair.toString());
		System.out.println();
			
		}
		System.out.println("--------------");
		return "";
	}
	public static void main(String args[]){
		int[] array = new int[]{2,3,6,1,5,3,4,0,-2};
		FindWhichPairAddUpToTheSum findHowManyPairs = new FindWhichPairAddUpToTheSum();
		for( int i : array){
			findHowManyPairs.store(i);
		}
		findHowManyPairs.printNumberOfPairsForSum();
		System.out.println("Sum = 6. number of pairs that add up to 6 are "+findHowManyPairs.getNumberOfPairs(6));
		System.out.println("Sum = 4. number of pairs that add up to 4 are "+findHowManyPairs.getNumberOfPairs(4));
		System.out.println("Sum = 0. number of pairs that add up to 0 are "+findHowManyPairs.getNumberOfPairs(0));
		System.out.println("Sum = 8. number of pairs that add up to 8 are "+findHowManyPairs.getNumberOfPairs(8));
	}
	
}

