package interviewexcercises;





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

	
	
	
	public String findLeastPopularUsingComparable(List<VMsg> messages){
		long start,end;
		start = System.currentTimeMillis();
		Collections.sort(messages); // Sort the collection
		end = System.currentTimeMillis();
		System.out.println("Time to sort = "+(end-start));
//		for(int i=0;i<messages.size()-1;i++){
//			System.out.println(i+" "+messages.get(i).rcp);
//		}
		int leastSoFar = messages.size(); // somene could receive all the messages. Start with that possiblity since we are interested in minimum
		
		int rcpMsg=1; // By default if the receipient is in the list means that at least one message was received.
		String mostunpopular="";
		for(int i=0;i<messages.size()-1;i++){
			if(messages.get(i).rcp.compareTo(messages.get(i+1).rcp)==0  ){
				rcpMsg++; //if the given rcp and next one are same, then increase the message count
				if(i==messages.size()-2){ // Check if we have reached end of collection. if so process messages for last recipient.
					//System.out.println("i="+i+" For "+messages.get(i).rcp+" Change at +"+i +" This occurrence="+rcpMsg);
					if(rcpMsg<leastSoFar){  // find out if the last recipient received less messages than the least so far 
						mostunpopular=messages.get(i).rcp; //if they did, update mostunpopular
						leastSoFar=rcpMsg; // update least so far variable
					}
				}
			}else { // if the next one is not same as this recipient that means recipient has changed
				//System.out.println("i="+i+" For "+messages.get(i).rcp+" Change at +"+i +" This occurrence="+rcpMsg);
				if(rcpMsg<leastSoFar){  // find out if the last recipient received less messages than the least so far 
					mostunpopular=messages.get(i).rcp; //if they did, update mostunpopular
					leastSoFar=rcpMsg; // update least so far variable
				}
				//System.out.println("New Least So Far = "+leastSoFar);
				rcpMsg=1; //recet the counter for processing 
			}
		}
		return mostunpopular; //return most unpopular
	}

	   

        public static void main(String args[]){
		
		
		VDayMessagesUsingComparable vm = new VDayMessagesUsingComparable();
		int n = 1000;
		List<VMsg> messages = new ArrayList<VMsg>(); 
		messages = new GenerateData().generateVDayMessages(n*1000*20,messages,false);
				
		long start,end;
		System.out.println("Starting to sort using Comparable:");
		start = System.currentTimeMillis();
		System.out.println("Mr Unpopular using Comparable ="+ vm.findLeastPopularUsingComparable(messages));
		end = System.currentTimeMillis();
		System.out.println("Time Using Comparable = "+(end-start));	

	}
	
}
