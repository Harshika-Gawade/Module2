package Chapter6.q1;
class Text {

	String message = "Harshika";

}
public class Main {
 public static void main(String[] args) {
	 Text text = new Text();

		new Thread(new Runnable() {

			@Override
			public void run() {

				synchronized (text) {

					try {
						System.out.println("wating for the text");
						text.wait();
						System.out.println("got the text" + " : " + new Text().message);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				synchronized (text) {
					text.notify();
					System.out.println("sending the text..");
				}

			}
		}).start();

}
}
