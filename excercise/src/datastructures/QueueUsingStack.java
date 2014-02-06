package datastructures;

import java.util.Stack;

/*
 * Implement a Queue functionality using Stack data structure.
 * 
 */
class MyQueue{
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	//Always add to s1
	public void add(int value){
		//s1.add(value);
		System.out.println("adding"+value);
		s1.push(value);
	}
	
	/* First find out if S2 is not empty. If so, just peek from s2.
	 * If s2 is empty, then push s1 on to s2 and then peek from s2.
	 */
	public int peek(){
		
		if(!s2.isEmpty()) return  s2.peek();
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		return s2.peek();
	}
	/*
	 * First find out if s2 is not empty. if so, just pop from s2.
	 * if s2 is empty then push s1 on to s2 and then peek from s2.
	 * 
	 */
	public int remove(){
		if(!s2.isEmpty()) return s2.pop();
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		return s2.pop();
	}
	
	public boolean isEmpty(){
//		if(s1.isEmpty() && s2.isEmpty()){
//			return true;
//		}
//		return false;   OR
		return (s1.isEmpty() && s2.isEmpty())? true:false;
	}
}

public class QueueUsingStack {

	public static void main(String args[]){
		MyQueue mq = new MyQueue();
		mq.add(5);
		mq.add(10);
		mq.add(15);
		mq.add(1);
		while(! (mq.peek()==15)){
		System.out.println("removing"+mq.remove());
		}
		mq.add(2);
		mq.add(3);
		mq.add(4);
		System.out.println("Printing Queue Content");
		while(!mq.isEmpty())
			System.out.println(mq.remove());
	}
	
}
