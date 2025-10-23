package Chapter5;

class Test2 extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("thread is running");
			Thread.sleep(5000);
			System.out.println("thread awake");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("thread interrupted");
		}
	}

}

public class Sleep {
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.start();
	}
}
