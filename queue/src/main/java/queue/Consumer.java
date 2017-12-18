package queue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<String> queue;
	
	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("In consumer : " + queue.take());
				System.out.println("in Consumer total values : " +  queue.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
