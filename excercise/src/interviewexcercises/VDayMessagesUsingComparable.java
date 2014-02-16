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

class VMsg implements Comparable<VMsg>{
	public String rcp; // receiver of the message
	public VMsg(String rcp){
		this.rcp=rcp;
	}
	@Override
	public int compareTo(VMsg vmsg) {		
		return rcp.compareTo(vmsg.rcp)<-1?-1:rcp.compareTo(vmsg.rcp)==1?1:0;
	}
}
public class VDayMessagesUsingComparable {

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
	
	
	
	public String findLeastPopular(List<VMsg> messages){
		
		Collections.sort(messages); // Sort the collection
		int leastSoFar = messages.size(); // somene could receive all the messages. Start with that possiblity since we are interested in minimum
		int rcpMsg=1; // By default if the receipient is in the list means that at least one message was received.
		String mostunpopular="";
		for(int i=0;i<messages.size()-1;i++){
			if(messages.get(i).rcp.compareTo(messages.get(i+1).rcp)==0  ){
				rcpMsg++; //if the given rcp and next one are same, then increase the message count
				if(rcpMsg>leastSoFar){
					while( ++i<messages.size()-1 && messages.get(i).rcp.compareTo(messages.get(i+1).rcp)==0){}
					rcpMsg=1;
				}
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
		int n = 1000;
		List<VMsg> messages = vdm.generateVDayMessages(n*1000*20);		
		long start,end;
		System.out.println("Starting");
		start = System.currentTimeMillis();
		System.out.println("Mr Unpopular using Comparable ="+ vdm.findLeastPopular(messages));
		end = System.currentTimeMillis();
		System.out.println("Time Using Comparable = "+(end-start));
	}
	
}
