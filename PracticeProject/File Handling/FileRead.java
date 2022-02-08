package simpli.learn.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public void fileread() {
		char[] data = new char[100];
		
		try {
			FileReader input = new FileReader("F:\\Mphasis1\\PracticeProject\\src\\simpli\\learn\\filehandling\\data1.txt");
			input.read(data);
			System.out.println("Data received from a file");
			System.out.println(data);
			input.close();
		} catch(IOException ex) {
			System.out.println("File error");
		}
	}

}
