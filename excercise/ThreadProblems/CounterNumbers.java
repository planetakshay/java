package ThreadProblems;



class CounterThread implements Runnable{
	private String threadName;
	int c,countTill;
	CounterThread(String threadName,int countTill){
		this.threadName = threadName;
		this.countTill=countTill;
	}
	@Override
	public void run() {
		
		for( c=1;c<countTill;c++){
			System.out.println( threadName+"-"+c);
		}
		System.out.println("## "+threadName + " done counting till "+c);
	}
	
}

public class CounterNumbers {
	
	public static void main (String args[]){
		Thread t1 = new Thread(new CounterThread("First Counter",100));
		Thread t2 = new Thread(new CounterThread("Second Counter",150));
		t1.start();
		t2.start();
	}
}
