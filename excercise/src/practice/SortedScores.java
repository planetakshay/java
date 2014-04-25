package practice;
import java.util.*;

class Score implements Comparable<Score> {
    int score;
    String name;

    public Score(int score, String name) {
    //public Score(String name) {
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Score o) {
        //return score < o.score ? -1 : score > o.score ? 1 : 0;
    	return name.compareTo(o.name)<1? -1: name.compareTo(o.name)==1? 1:0;
    }
}

public class SortedScores {

    public static void main(String[] args){
        List<Score> scores = new ArrayList<Score>();
       
        scores.add(new Score(23, "Peter"));  
        scores.add(new Score(21, "Peter"));
        scores.add(new Score(11, "Tony"));  
        scores.add(new Score(110, "Claire"));  
        scores.add(new Score(13, "ferca"));  
        scores.add(new Score(55, "Julian"));  
        scores.add(new Score(13, "Pedro"));
        scores.add(new Score(2, "Peter"));
       // System.out.println("Printing sorted list");
       
    /*
        scores.add(new Score( "Peter"));  
        scores.add(new Score( "Peter"));
        scores.add(new Score( "Tony"));  
        scores.add(new Score( "Claire"));  
        scores.add(new Score( "ferca"));  
        scores.add(new Score( "Julian"));  
        scores.add(new Score( "Pedro"));
        scores.add(new Score( "Peter"));
      */  
        for(int i=0;i<scores.size();i++){
        	System.out.println(scores.get(i).score+" -> "+scores.get(i).name);
        	//System.out.println(scores.get(i).name);
        }
        Collections.sort(scores);
        System.out.println("Printing sorted list");
        for(int i=0;i<scores.size();i++){
        	System.out.println(scores.get(i).score+" -> "+scores.get(i).name);
        	//System.out.println(scores.get(i).name);
        }
        
    }
}
