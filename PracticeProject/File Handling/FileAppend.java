package simpli.learn.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {
	public void fileappend() {
		String data = "This data is appended..";
		try {
			FileWriter output =  new FileWriter("F:\\Mphasis1\\PracticeProject\\src\\simpli\\learn\\filehandling\\data1.txt",true);
			output.write(data);
			System.out.println("Data appended successfully");
			output.close();
		} catch(IOException ex) {
			System.out.println("File appended error");
		}
	}

}
