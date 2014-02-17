package datastructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * push:
 *  enqueue in queue1
 *  
 *	pop:
 *	while size of queue1 is bigger than 1, pipe dequeued items from queue1 into queue2
 *	dequeue and return the last item of queue1, then switch the names of queue1 and queue2
 * 
 * @author Akshay
 *
 */

class MyStack{

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	private int peek;
	
	//Always push to q1
	public void push(int i){
		q1.add(i);
		peek=i;
		
	}
	// To pop an element which is at the bottom of the queue, first add all but one elements from q1 to q2
	public int pop() throws Exception{
		
		if(q1.isEmpty()) {
			throw new Exception(" Stack is empty can not pop");
		}
		
		while(q1.size()>1){  // other than the 1 element add all to q2
			q2.add(q1.remove());
		}
		int value = q1.remove(); // store the remaining value to be returned to value
		Queue<Integer> temp = q2;  // Now exchange the references.
		q2=q1;
		q1=temp;
		return value; //return the value
	}
	public int peek(){
		return peek;  // the last element to be pushed to the stack should be returned as peek
	}
	public boolean isEmpty(){
		return (q1.isEmpty() && q2.isEmpty())? true: false; //Only if both are empty then the stack is empty
	}	
}

public class StackUsingQueue {
  
	public static void main(String args[]) throws Exception{
		MyStack ms = new MyStack();
		ms.push(2);
		ms.push(3);
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		ms.push(1);
		ms.push(3);
		System.out.println(ms.pop());
		ms.push(4);
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println("3,2,3,4,1");
	}

}
