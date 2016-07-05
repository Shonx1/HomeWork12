package Task01;

public class Main extends Thread {
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
		Thread t1 = new Main();
		Thread t2 = new Main();
		Thread t3 = new Main();
		Thread t4 = new Main();
		Thread t5 = new Main();
		t1.setName("Thread one: ");
		t2.setName("Thread two: ");
		t3.setName("Thread three: ");
		System.out.print(t1.toString());
		System.out.print(t2.getName());
		System.out.print(t3.getName());
		t1.start();
		t2.start();
		t3.start();
	}
}