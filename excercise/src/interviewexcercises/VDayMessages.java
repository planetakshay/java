package interviewexcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

	

	public List<VMsg> generateVDayMessages(int n){
		List<String> rcp = new ArrayList<String>(Arrays.asList("Akshay","Prachi","Samarth","Vrunda","Deodhar"));
		List<VMsg> messages = new ArrayList<VMsg>();
		
		while(n-- >0){
			Collections.shuffle(rcp);
			messages.add(new VMsg(rcp.get(0)));
		}
		n=1;
		for(VMsg vmsg: messages){
			//System.out.print(n++ +" "+vmsg.rcp +" ");
		}
		return messages;
	}
public String findLeastPopularPersonUsingMap(List<VMsg> messages){
		
		Map<String,Integer> msgFreq = new HashMap<String,Integer>();
		for(int i=0;i<messages.size();i++){
			int freq=0;
			if(msgFreq.containsKey(messages.get(i).rcp)){
				freq = msgFreq.get(messages.get(i).rcp);
			}
			
			msgFreq.put(messages.get(i).rcp, ++freq);
		}
		//Just a for loop for debugging. Shows how many messages for each participant
//		for(Entry<String, Integer> entry: msgFreq.entrySet()){
//			System.out.println(entry.getKey()+"->"+entry.getValue());
//		}
		//Remember, while finding the lowest occurrences, we need to have complete map built. So 
		// Can not avoid two loops
		String mrunpopular ="";
		int lowestSofar =messages.size(); // Remember, while finding least number of occurrences, initialize lowest so far to the size of the data.
		for(Entry<String, Integer> entry: msgFreq.entrySet()){
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
		System.out.println("Starting to sort using Comparable:");
		
		start = System.currentTimeMillis();
		System.out.println("Mr Unpopular using Comparable ="+ vm.findLeastPopularUsingComparable(messages));
		end = System.currentTimeMillis();
		System.out.println("Time Using Comparable = "+(end-start));	
	}
	
}