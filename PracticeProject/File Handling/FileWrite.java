package simpli.learn.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public void filewrite() {
		String data = "Welcome to File handling..";
		
		try {
			FileWriter output = new FileWriter("F:\\Mphasis1\\PracticeProject\\src\\simpli\\learn\\filehandling\\data1.txt");
			output.write(data);
			System.out.println("Data is Written Sucessfully");
			output.close();
		} catch (IOException e) {
			System.out.println("File write error..");
		}
	}

}
