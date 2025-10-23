package Chapter5;

class Test extends Thread {

	@Override
	public void run() {
		System.out.println("thread running");
	}

}

public class NewThread {
	public static void main(String[] args) {
		Test test = new Test();
		test.start();
		
		Thread thread  = new Thread(test);
		thread.start();
		
		new Thread() {
			public void run() {
				System.out.println("thread2 is running");
			};
		}.start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("thread 3 is running");

			}
		}).start();
		
	
	}
}
