package ThreadProblems;

import java.util.Date;

class Message{
	
	private String text="";
	Message(String text){
		this.text = text;
	}
	public void setText(String value){
		this.text = value;
	}
	public String getText(){
		return text;
	}
	
}

class Waiter implements Runnable{
	Message message;
	public Waiter(Message message) {
		this.message = message;
	}

	
	@Override
	public void run(){
		synchronized(message){
			System.out.println("Waiter is waiting at "+new Date());
			try {
				message.wait();
			} catch (InterruptedException e) {
				System.out.println("Waiter got interrupted ");
				e.printStackTrace();
			}
		}
		System.out.println("Waiter read message = "+message.getText());
	}
}

class Notifier implements Runnable{
	Message message;
	public Notifier(Message message) {
		this.message = message;
	}

	
	@Override
	public void run(){
		System.out.println("Notifier is sleeping for 3 seconds at " + new Date());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		synchronized(message){
			message.setText("Notifier is done sleeping for 3 seconds at " + new Date());
			System.out.println("Notifier is notifying waiting thread to wake up at " + new Date());
			message.notify();
		}
		
	}
}

public class WaiterNotifierWithRunnable {

	public static void main(String args[]){
		
		Message message = new Message("India"); 
		Waiter waiter = new Waiter(message);
		Thread waiterThread = new Thread(waiter, "waiterThread");
		

		Notifier notifier = new Notifier(message);
		Thread notifierThread = new Thread(notifier, "notifierThread");
		waiterThread.start();
		notifierThread.start();
		
		
	}
	
	
}
