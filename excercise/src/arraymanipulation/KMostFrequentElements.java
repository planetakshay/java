package arraymanipulation;

import java.util.*;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 */
public class KMostFrequentElements {

	public static List<Integer> topKFrequent(int[] nums, int k) {

		List<Integer> topK = new ArrayList<Integer>();
		Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();


		for (int n : nums) {
			freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
		}
		int[] values = new int[freqMap.size()];
		int i=0;
		for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
			values[i++]=entry.getValue();
		}

		Arrays.sort(values);
		List<Integer> highestValueList = new ArrayList<Integer>();
		

		for(int j=values.length-1;j>values.length-k-1;j--){
			highestValueList.add(values[j]);
		}
		for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
			if(highestValueList.size()==0) break;
			if(highestValueList.contains(entry.getValue()) ){
				topK.add(entry.getKey());
				highestValueList.remove(entry.getValue());
			}
		}

		return topK;
	}

//	public static List<Integer> topKFrequent1(int[] nums, int k) {
//
//		List<Integer>[] bucket = new List[nums.length + 1];
//		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
//
//		for (int n : nums) {
//			frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
//		}
//
//		for (int key : frequencyMap.keySet()) {
//			int frequency = frequencyMap.get(key);
//			if (bucket[frequency] == null) {
//				bucket[frequency] = new ArrayList<>();
//			}
//			bucket[frequency].add(key);
//		}
//
//		List<Integer> res = new ArrayList<>();
//
//		for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
//			if (bucket[pos] != null) {
//				res.addAll(bucket[pos]);
//			}
//		}
//		return res;
//
//	}


	public static void main(String args[]){
		int[][] array = new int[][]{{4,1,-1,2,-1,2,3},
				{1,1,1,2,2,3},
				{1,1,1,2,2,2,2,3,3,3,3,3}
	};
		for(int[] a: array){
			List<Integer> topK = topKFrequent(a,2);
			for(int i: topK){
				System.out.print( i +" ");
			}
			System.out.println();
		}
	}

}
