package simpli.learn.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public void createfile() {
		File myFile = new File("F:\\Mphasis1\\PracticeProject\\src\\simpli\\learn\\filehandling\\data1.txt");
		
		try {
			if (myFile.createNewFile()) {
				System.out.println("File created successfully");
			}
			else {
				System.out.println("File creation error.");
			}
		} catch(IOException ex) {
			System.out.println("File error...");
		}
	}	
	

}
