package practice;

class Callme {
	   void call(String msg) {
	      System.out.print("[" + msg);
	      try {
	         Thread.sleep(1000);
	      } catch (InterruptedException e) {
	         System.out.println("Interrupted");
	      }
	      System.out.println("]");
	   }
}

	// File Name : Caller.java
class Caller implements Runnable {
	   String msg;
	   Callme target;
	   Thread t;
	   public Caller(Callme targ, String s) {
	      target = targ;
	      msg = s;
	      t = new Thread(this);
	      t.start();
	   }
	   
	   // synchronize calls to call()
	   public void run() {
	      synchronized(target) { // synchronized block
	         target.call(msg);
	      }
	   }
	}
