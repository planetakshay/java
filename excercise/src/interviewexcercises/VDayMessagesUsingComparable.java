package interviewexcercises;



import interviewexcercises.VDayMessages.VMsg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

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

public class VDayMessagesUsingComparable {

public String findLeastPopularPerson(List<VMsg> messages){
		
		Map<String,Integer> msgFreq = new HashMap<String,Integer>();
		for(int i=0;i<messages.size();i++){
			int freq=0;
			if(msgFreq.containsKey(messages.get(i).rcp)){
				freq = msgFreq.get(messages.get(i).rcp);
			}
			
			msgFreq.put(messages.get(i).rcp, ++freq);
		}
		
		for(Entry<String, Integer> entry: msgFreq.entrySet()){
			System.out.println(entry.getKey()+entry.getValue());
		}
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
	
	class VMsg implements Comparable<VMsg>{
		public String rcp; // receiver of the message
		VMsg(String rcp){
			this.rcp=rcp;
		}
		@Override
		public int compareTo(VMsg vmsg) {		
			return rcp.compareTo(vmsg.rcp)<-1?-1:rcp.compareTo(vmsg.rcp)==1?1:0;
		}
	}
	
	public List<VMsg> generateVDayMessages(int n){
		List<String> rcp = new ArrayList<String>(Arrays.asList("Akshay","Prachi","Samarth","Vrunda","Deodhar"));
		List<VMsg> messages = new ArrayList<VMsg>();
		while(n-- >0){
			Collections.shuffle(rcp);
			messages.add(new VMsg(rcp.get(0)));
		}
		n=1;
		for(VMsg vmsg: messages){
			System.out.print(n++ +" "+vmsg.rcp +" ");
		}
		return messages;
	}
	public String findLeastPopular(List<VMsg> messages){
		
		Collections.sort(messages); // Sort the collection
		int leastSoFar = messages.size(); // somene could receive all the messages. Start with that possiblity since we are interested in minimum
		int rcpMsg=1; // By default if the receipient is in the list means that at least one message was received.
		String mostunpopular="";
		for(int i=0;i<messages.size()-1;i++){
			if(messages.get(i).rcp.compareTo(messages.get(i+1).rcp)==0 ){
				rcpMsg++; //if the given rcp and next one are same, then increase the message count
			}else{ // if the next one is not same as this recipient that means recipient has changed
				if(rcpMsg<leastSoFar){  // find out if the last recipient received less messages than the least so far 
					mostunpopular=messages.get(i).rcp; //if they did, update mostunpopular
					leastSoFar=rcpMsg; // update least so far variable
				}
				rcpMsg=1; //recet the counter for processing 
			}
		}
		return mostunpopular; //return most unpopular
	}

	
	public static void main(String args[]){
		VDayMessagesUsingComparable vdm = new VDayMessagesUsingComparable();
		List<VMsg> messages = vdm.generateVDayMessages(10);
		System.out.println();
		System.out.println("Mr Unpopular using Comparable ="+ vdm.findLeastPopular(messages));
	}
	
}
