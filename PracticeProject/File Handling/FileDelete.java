package simpli.learn.filehandling;

import java.io.File;

public class FileDelete {
	public void filedelete() {
		File myFile = new File("F:\\Mphasis1\\PracticeProject\\src\\simpli\\learn\\filehandling\\data1.txt");
		
		if(myFile.delete()) {
			System.out.println("File Deleted: "+myFile.getName()+"Successfully Deleted");
			
		} else {
			System.out.println("Failed to delete a file. ");
		}
	}
}
