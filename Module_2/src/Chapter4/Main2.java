package Chapter4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {

		try {
			FileWriter fileWriter = new FileWriter("demo.txt");
			fileWriter.write("we have created new file");
			fileWriter.close();
			System.out.println("data inserted..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("deta not inserted..");
		}

	}
}
