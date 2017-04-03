package SortingAndSearching;

import java.util.*;

/**
 * Given a digit string, return all possible letter combinations
 * that the number could represent. (Check out your cellphone to see the mappings)
 * Input:Digit string "23", Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */


public class PhoneNumberCombination {

	public List<String> letterCombinations(String digits) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		map.put(0, "");

		ArrayList<String> result = new ArrayList<String>();

		if(digits == null || digits.length() == 0)
			return result;

		ArrayList<Character> temp = new ArrayList<Character>();
		getString(digits, temp, result, map);

		return result;
	}
	public void getString(String digits, ArrayList<Character> temp, ArrayList<String> result,  HashMap<Integer, String> map){
		if(digits.length() == 0){
			char[] arr = new char[temp.size()];
			for(int i=0; i<temp.size(); i++){
				arr[i] = temp.get(i);
			}
			result.add(String.valueOf(arr));
			return;
		}

		Integer curr = Integer.valueOf(digits.substring(0,1));
		String letters = map.get(curr);
		for(int i=0; i<letters.length(); i++){
			temp.add(letters.charAt(i));
			getString(digits.substring(1), temp, result, map);
			temp.remove(temp.size()-1);
		}
	}
	//////////////  Another approach using string builer that is much cleaner /////////////////////////


	public List<String> letterCombinationsSB(String digits) {

		List<String> result = new LinkedList<String>();

		if(digits==null || digits.length() <1){
			return result;
		}
		HashMap<Character, String> map = new HashMap<Character, String>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		map.put('0', "");

		StringBuilder sb = new StringBuilder();
		dfs(digits,0,sb,map,result);

		return result;
	}

	public void dfs(String digits,int step,StringBuilder b,HashMap<Character,String> map,List<String> result){
		if(step == digits.length()){
			result.add(b.toString());
			return;
		}
		Character curr = digits.charAt(step);
		String s = map.get(curr);
		for(int i=0;i<s.length();i++){
			b.append(s.charAt(i));
			dfs(digits,step+1,b,map,result);
			b.deleteCharAt(b.length()-1);
		}
	}

	public static void main(String args[]){
		PhoneNumberCombination pc = new PhoneNumberCombination();
		List<String> values =  pc.letterCombinations("23");
		System.out.println(String.valueOf(values));


		List<String> values_sb =  pc.letterCombinationsSB("234");
		System.out.println(String.valueOf(values_sb));
	}
}
