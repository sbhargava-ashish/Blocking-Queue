package queue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	private BlockingQueue<String> queue;
	
	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			Random ran = new Random();
			int nextInt = ran.nextInt(100);
			queue.add(String.valueOf(nextInt));
			System.out.println("in producer adding value : " +  nextInt);
			System.out.println("in producer total values : " +  queue.size());
			
		}

	}

}
