package Chapter5
;

class Test3 extends Thread {

	@Override
	public void run() {
		System.out.println(
				"name : " + Thread.currentThread().getName() + "  priority " + Thread.currentThread().getPriority());
	}

}

public class Priority {
	public static void main(String[] args) throws InterruptedException {
		Test3 test1 = new Test3();
		Test3 test2 = new Test3();
		Test3 test3 = new Test3();

		test1.setPriority(Thread.MIN_PRIORITY);
		test2.setPriority(Thread.MAX_PRIORITY);
		test3.setPriority(Thread.NORM_PRIORITY);

		test1.start();
		
		test2.start();
		
		test3.start();
		

	}
}
