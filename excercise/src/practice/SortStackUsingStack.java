package practice;

import java.util.Stack;

public class SortStackUsingStack {
	
	public static Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> sorted = new Stack<Integer>();
		
		while(!s.isEmpty()){
			int i = s.pop();
			
			while(!sorted.isEmpty() && sorted.peek()<i){
				s.push(sorted.pop());
			}
			sorted.push(i);
			
		}
		
		return sorted;
	}
	public static void main(String args[]){
		Stack<Integer> s = new Stack<Integer>();
		s.push(2);
		s.push(10);
		s.push(3);
		s.push(100);
		s = sort(s);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}
	
}
