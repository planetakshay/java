package workunderprogress;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * WORK UNDER PROGRESS. DOES NOT WORK
 * This algorithm breaks for certain inputs.
 * @author Akshay
 *
 */

public class SortQueueUsingQueue {
	public void rotateTheQueueBySizeMinusOne(Queue<Integer> q1){
		int size = q1.size();
		while(size>1){
			q1.add(q1.poll());
			size--;
		}
	}
	public boolean isQueueSortedAscending(Queue<Integer> q1){
		boolean sorted=true;
		int size = q1.size();
		
		while(!q1.isEmpty() && size>1){
			int value;
			value = q1.remove();
			if(value>q1.peek() && sorted){
				sorted =false;
			}
			q1.add(value);
			size--;
		}
		q1.add(q1.poll());
		return sorted;
	}
	public Queue<Integer> sortQueue(Queue<Integer> q1){
		Queue<Integer> q2  = new LinkedList<Integer>();
		int lastValue = 0;
		boolean sortingStarted = false;
			if (!q1.isEmpty()) {
				while(!q1.isEmpty() && !isQueueSortedAscending(q1)){
					int value = q1.poll();
					if (value < q1.peek()) {
						
						if(lastValue>value && sortingStarted){
							rotateTheQueueBySizeMinusOne(q1);
							q1.add(value);
						}else{
							q1.add(value);
						}
					}
					else{
						q2.add(value);
						while (!q2.isEmpty())
							q1.add(q2.poll());
						}
					sortingStarted =true;
					lastValue = value;
					}
				}
			return q1;
		
	}
	public static void main(String args[]){
		SortQueueUsingQueue sq = new SortQueueUsingQueue();
		Queue<Integer> q = new LinkedList<Integer>();
		//q.add(1);
		//q.add(3);
		//q.add(10);
//		System.out.println(sq.isQueueSortedAscending(q));
		q.add(3);
		q.add(2);
		q.add(10);
		q.add(1);
		//q.add(14);
		System.out.println("Unsorted Queue"+q);
		sq.sortQueue(q);
		System.out.println("Sorted Queue="+q);		
	}
	
	
}
