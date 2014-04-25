package practice;
import java.util.Map;
import java.util.HashMap;
public class FirstNotRepeatingCharacter {

	public void firstNonRepeating(String s){
		char ch[] = s.toCharArray();
		
		Map<Character,Integer> freqMap = new HashMap<Character,Integer>();
		
		for(char c:ch){
			int freq=0;
			if(freqMap.containsKey(c)){
				freq = freqMap.get(c);
			}
			freqMap.put(c, ++freq);
		}
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(freqMap.get(c)==1){
				System.out.println("First Non Repeating character ="+c);
				return;
			}
		}
		System.out.println("There are no non repeating characters in string "+s);
		
	}
	public static void main(String args[]){
		
		
		FirstNotRepeatingCharacter fnr = new FirstNotRepeatingCharacter();
		fnr.firstNonRepeating("Akshay");
		fnr.firstNonRepeating("deodhar");
		fnr.firstNonRepeating("akshdywn");
		fnr.firstNonRepeating("akshaksh");
		
	}
	
}
