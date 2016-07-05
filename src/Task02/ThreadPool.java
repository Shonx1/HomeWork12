package Task02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The thread is started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The thread complete");
		}
	}

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		pool.submit(new ThreadPool());
		pool.submit(new ThreadPool());
		pool.submit(new ThreadPool());
		pool.submit(new ThreadPool());
		pool.submit(new ThreadPool());
		pool.submit(new ThreadPool());
		pool.submit(new ThreadPool());
		pool.shutdown();
	}

}