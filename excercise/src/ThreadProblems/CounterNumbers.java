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
			System.out.println( threadName+" reached "+c);
		}
		System.out.println("## "+threadName + " done counting till "+c);
	}
	
}

public class CounterNumbers {
	
	public static void main (String args[]){
		Thread t1 = new Thread(new CounterThread("First Counter",100));
		Thread t2 = new Thread(new CounterThread("Second Counter",150));
		System.out.println("Starting both threads");
		t1.start();
		t2.start();
		System.out.println("Waiting for both threads to finish");
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Both thread finished executing");
	}
}
