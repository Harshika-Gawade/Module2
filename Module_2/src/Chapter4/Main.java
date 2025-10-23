package Chapter4;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		try {
			File file = new File("demo.txt");
			file.createNewFile();
			System.out.println("file created...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not created...");
		}

	}
}
