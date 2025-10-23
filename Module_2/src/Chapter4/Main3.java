package Chapter4;

import java.io.File;

public class Main3 {
	public static void main(String[] args) {

		File file = new File("demo.txt");
		if (file.delete()) {
			System.out.println("file deleted : " + file.getName());

		} else {
			System.out.println("file not deleted");
		}

	}

}
