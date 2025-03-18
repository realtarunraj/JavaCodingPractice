package testing_16_question;

public class Intermidiate_15 {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for(int i=1; i<=10; i++) {
				try {
					System.out.println("Running Thread : " + i);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
	}
}
