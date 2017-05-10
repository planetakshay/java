package StringOperations;

/**
 *  Java program to print all permutations of a given string.
 *   Given a STring "ABC" your program should output
 *   "ABC", "ACB", "CAB", "CBA", "CAB", "CBA"
 *   Combination of a string that is n character long are n! n factorial
 *
 */
public class Permutations {

	//A simple swap of two characters.
   public String swap(String s, int i, int j){
   	char[] schar = s.toCharArray();
   	char tmp = schar[i];
   	schar[i] = schar[j];
	schar[j]=tmp;
	return String.valueOf(schar);
   }

	public void permutation(String s,int start,int end){
		System.out.println("String = " +s +" start="+ start +" end = "+end);
		if(start==end){
			System.out.println(s);
		}else{
			for(int i=start;i<=end;i++){
				s = swap(s,start,i);
				permutation(s,start+1,end);
				s= swap(s,start,i);
			}
		}
	}
	public static void main(String args[]){
//		String[] input  = new String[]{"ABC","","ABCD","AB","A","CCC","1ZA"};
		String[] input  = new String[]{"ABC"};
		Permutations permutations = new Permutations();
		for(String s: input){
			int length = s.length();
			permutations.permutation(s,0,length-1);

		}
	}
}
