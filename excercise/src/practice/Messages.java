package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Msg implements Comparable<Msg>{
	
	 
	    String rcp;

	    public Msg( String name) {
	        this.rcp = name;
	    }

	    @Override
	    public int compareTo(Msg o) {
	       // return score < o.score ? -1 : score > o.score ? 1 : 0;
	    	return rcp.compareTo(o.rcp)==1? 1:0;
	    }
}
public class Messages {
	
	public void printMessageRcps(List<Msg> messages){
		
		for(int i=0;i<messages.size();i++){
			System.out.println(messages.get(i).rcp);
		}
	}
	
	public static void main(String args[]){
		List<Msg> messages = new ArrayList<Msg>();
		Messages m= new Messages();
		messages.add(new Msg("Akshay"));
		messages.add(new Msg("Prachi"));
		messages.add(new Msg("Akshay"));
		
		m.printMessageRcps(messages);
		System.out.println();
		Collections.sort(messages);
		m.printMessageRcps(messages);
		
		
	}
	
	

}
