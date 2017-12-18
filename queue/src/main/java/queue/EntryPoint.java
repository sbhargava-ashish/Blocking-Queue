package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class EntryPoint {

	public static void main(String[] args) {
		
		BlockingQueue<String> queue = new LinkedBlockingQueue<>();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Thread t1 = new Thread(new Producer(queue));
		Thread t2 = new Thread(new Consumer(queue));
		executor.execute(t1);
		executor.execute(t2);

		

	}

}
