package interviewexcercises;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateData {

	public List<VMsg> generateVDayMessages(int n,List<VMsg> messages,boolean printData){
		List<String> rcp = new ArrayList<String>(Arrays.asList("Akshay","Prachi","Samarth","Vrunda","Deodhar"));
		while(n-- >0){
			Collections.shuffle(rcp);
			messages.add(new VMsg(rcp.get(0)));
		}
		n=1;
		if(printData){
			for(VMsg vmsg: messages){
				System.out.print(n++ +" "+vmsg.rcp +" ");
			}
		}
		
		return messages;
	}
	
	
}
