package fsd_sheet_java8;

public class Question15 {
	public static void main(String[] args) {
		Thread th = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Thread is running : " + i);
				try {
					Thread.sleep(400); // time gap of 0.4 sec
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		th.start(); // starting the thread
	}
}
