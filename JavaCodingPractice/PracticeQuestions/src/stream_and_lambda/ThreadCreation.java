package stream_and_lambda;

public class ThreadCreation {
	public static void main(String[] args) {
		String str = "Thread Example";

		Runnable runnableWithLAmbda = () -> {
			System.out.println(str.trim());
			for (int i = 0; i < str.length(); i++) {
				System.out.println("Count : " + i);
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.out.println("Current Thread has been interrupted");
				}
			}
		};

		Thread thread1 = new Thread(runnableWithLAmbda);
		thread1.start();

		// Waiting for thread to finish
		try {
			thread1.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Main thread has been interrupted");
		}

		System.out.println("Thread Died");
	}
}
