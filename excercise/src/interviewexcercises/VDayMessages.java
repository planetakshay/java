package interviewexcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Amazon - phone
 * There are n V day messages.
 * Each message has an author, message and a receipient.
 * 
 * Find the least popular person. The person who received the least number of 
 * valentine messages.
 * 
 * @author Akshay
 *
 */


public class VDayMessages {


public String findLeastPopularPersonUsingMap(List<VMsg> messages){
		
		Map<String,Integer> recipientToMessageFreq = new HashMap<String,Integer>();
		for(int i=0;i<messages.size();i++){
			int freq=0;
			if(recipientToMessageFreq.containsKey(messages.get(i).rcp)){
				freq = recipientToMessageFreq.get(messages.get(i).rcp);
			}
			
			recipientToMessageFreq.put(messages.get(i).rcp, ++freq);
		}
//		List<Integer> msgValues = new ArrayList<Integer>(recipientToMessageFreq.values());
//		Collections.sort(msgValues);
//		System.out.println(" most popular ="+msgValues.get(msgValues.size()-1));
//		System.out.println(" least popular ="+msgValues.get(0));
//		
//		Map<String,Integer> rcpToMsgs = new TreeMap<String,Integer>(recipientToMessageFreq);
//		System.out.println("\nPrinting Hash Map");
//		//Just a for loop for debugging. Shows how many messages for each participant
//		for(Entry<String, Integer> entry: recipientToMessageFreq.entrySet()){
//			System.out.println(entry.getKey()+"->"+entry.getValue());
//		}
//		System.out.println("\nPrinting Tree Map");
//		//Just a for loop for debugging: printing a tree map
//		for(Map.Entry<String,Integer> entry: rcpToMsgs.entrySet() ){
//			System.out.println(entry.getKey()+"->"+entry.getValue());
//		}
		//Remember, while finding the lowest occurrences, we need to have complete map built. So 
		// Can not avoid two loops
		String mrunpopular ="";
		int lowestSofar =messages.size(); // Remember, while finding least number of occurrences, initialize lowest so far to the size of the data.
		for(Entry<String, Integer> entry: recipientToMessageFreq.entrySet()){
			if(entry.getValue() < lowestSofar){
				lowestSofar = entry.getValue();
				mrunpopular = entry.getKey();
			}
		}
		
		return mrunpopular;
	}
	public static void main(String args[]){
		VDayMessages vdm = new VDayMessages();
		VDayMessagesUsingComparable vm = new VDayMessagesUsingComparable();
		int n = 1000;
		List<VMsg> messages = new ArrayList<VMsg>(); 
		messages = new GenerateData().generateVDayMessages(n*1000*20,messages,false);
		
		System.out.println("Starting to sort using Map: ");
		long start,end;
		start = System.currentTimeMillis();
		System.out.println("Mr Unpopular Using Map ="+ vdm.findLeastPopularPersonUsingMap(messages));
		end = System.currentTimeMillis();
		System.out.println("Time Using Map = "+(end-start));
		System.out.println();
		
//		System.out.println("Starting to sort using Comparable:");
//		start = System.currentTimeMillis();
//		System.out.println("Mr Unpopular using Comparable ="+ vm.findLeastPopularUsingComparable(messages));
//		end = System.currentTimeMillis();
//		System.out.println("Time Using Comparable = "+(end-start));	
	}
	
}
