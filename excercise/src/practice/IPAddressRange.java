package practice;

import java.util.HashMap;
import java.util.Map;

public class IPAddressRange {

	public static int highestPartNeedsChanging(String[] startsegments,String[] endsegments){
		 boolean findHighestPart = false;
		    int j = 0;
		    for(int i=0;i<=3;i++){
		    	if(!findHighestPart){
		    		if(Integer.parseInt(endsegments[i])>Integer.parseInt(startsegments[i])){
		    			findHighestPart=true;
		    			j=i;
		    			break;
		    		}
		    	}
		    }
		    return j;
	}
	public static void main(String args[]) {
	    String start = "192.168.0.2";
	    String end = "192.168.1.200";
	    
	  //  String[] startParts = start.split("(?<=\\.)(?!.*\\.)");
	  //  String[] endParts = end.split("(?<=\\.)(?!.*\\.)");
	    String[] startsegments = start.split("\\.");
	    String[] endsegments = end.split("\\.");
	    
	    Map<Integer,Integer> maxValue = new HashMap<Integer,Integer>();
	    for(int i=0;i<3;i++){
	    	maxValue.put(i, Integer.parseInt(startsegments[i]));
	    }
	    int j= highestPartNeedsChanging(startsegments,endsegments);
	    System.out.println("j="+j);
	    
	    
//	    int first = Integer.parseInt(startParts[1]);
//	    int last = Integer.parseInt(endParts[1]);

//	    for (int i = first; i <= last; i++) {
//	        System.out.println(startParts[0] + i);
//	    }
//	    for(String s: segments){
//	    	System.out.println(s);
//	    }
	}
}
