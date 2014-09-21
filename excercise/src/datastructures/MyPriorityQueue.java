package datastructures;

import java.util.PriorityQueue;

class MyTask implements Comparable<MyTask>{
	final int priority;
	final String name;
	MyTask(int priority,String name){
		this.priority = priority;
		this.name = name;
	}
	
	public  String toString(){
		return this.priority +" "+ name;
	
	}
	@Override
	public int compareTo(MyTask task) {
		// TODO Auto-generated method stub
		if(this.priority<task.priority){
			return -1;
		}else if(this.priority>task.priority){
			return 1;
		}
		return 0;
	}
	
}
public class MyPriorityQueue {

	public static void main(String args[]){
		PriorityQueue<MyTask> pq = new PriorityQueue<MyTask>();
		pq.add(new MyTask(2,"Brush Teeth"));
		pq.add(new MyTask(1,"wake up"));
		pq.add(new MyTask(3,"drink milk"));
		pq.add(new MyTask(5,"study"));
		pq.add(new MyTask(4,"go to school"));
		while(!pq.isEmpty()){
			System.out.println(pq.remove().toString());
		}
	}
	
}
