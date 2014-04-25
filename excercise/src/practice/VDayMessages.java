package practice;

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

	
	class VMsg{
		public String msg;
		public String rcp; // Receipient of the message
		public String author; // sender of the message
		
		VMsg(String rcp){
			this.rcp=rcp;
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
public String findLeastPopularPerson(List<VMsg> messages){
	  String mrunpopular="";
		Integer[] frequency = new Integer[messages.size()];
		
		int count = 0;
		for(int i = 0; i< messages.size();i++) {
			
			frequency[i]++;
		}
		
		return mrunpopular;
	}
	public static void main(String args[]){
		VDayMessages vdm = new VDayMessages();
		List<VMsg> messages = vdm.generateVDayMessages(100);
		System.out.println();
		System.out.println("Mr Unpopular ="+ vdm.findLeastPopularPerson(messages));
	}
	
}
