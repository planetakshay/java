package practice;

import java.util.Stack;

public class SortStackUsingStackOne {
	
	Stack<Integer> s = new Stack<Integer>();
	
	public void sortStatck(Stack<Integer>s){
		Stack<Integer> sorted = new Stack<Integer>();
		while(!s.isEmpty()){
			int elm = s.pop();
			while(elm> sorted.peek() && !sorted.isEmpty()){
				s.push(sorted.pop());
			}
			sorted.push(elm);
			
		}
		
	}
	

}
