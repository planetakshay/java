package datastructures;

import java.util.Stack;

public class SortStackUsingStack {
	
	public Stack<Integer> sortAscending(Stack<Integer> stackToSort){
		Stack<Integer> sortedStack = new Stack<Integer>();
		
		// Until the stack to sort is not completely empty repeat.
		while(!stackToSort.isEmpty()){
		// Pop the top element from stack to sort for comparison	
		int value = stackToSort.pop();
			//find place for value in sorted stack. if the peek of sorted stack is less than
			// the value then value belongs further down in the stack. This is because we want sorted stack in ascending order
			// So keep pushing sorted stack values to stack to sort
			while(!sortedStack.isEmpty() && value > sortedStack.peek() ){
				stackToSort.push(sortedStack.pop());
			}
			
			sortedStack.push(value);
		}
		
		return sortedStack;
		
	}
	public static void main(String args[]){
		
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> r = new Stack<Integer>();
		s.add(3);
		s.add(2);
		s.add(4);
		SortStackUsingStack sort = new SortStackUsingStack();
		r = sort.sortAscending(s);
		while(!r.isEmpty()){
			System.out.print(r.pop()+",");
		}
	}
	

}
