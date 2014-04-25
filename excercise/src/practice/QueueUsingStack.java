package practice;

import java.util.Stack;

public class QueueUsingStack {
	public Stack<Integer> s1 = new Stack<Integer>();
	public Stack<Integer> s2 = new Stack<Integer>();
	
	public void push(int i){
		s1.push(i);
	}

	public int pop(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	public int peek(){
		return s2.peek();
	}
	
	public static void main(String args[]){
		QueueUsingStack qus = new QueueUsingStack();
		qus.push(1);
		qus.push(2);
		qus.push(3);
		
		System.out.println(qus.pop());
		System.out.println(qus.pop());
		System.out.println(qus.pop());
	}
}
