package simpli.learn.filehandling;

import java.util.Scanner;

public class FileHandling{
	public static void main(String[] args) {
		System.out.println("File operations\n");
		System.out.println("1.Create a file\n 2.Write a file\n 3.Read a file \n 4.Append text to a file \n 5.Delete a file\n");
		System.out.println("Choose a file operation");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num==1) {
			CreateFile crtfil = new CreateFile();
			crtfil.createfile();
			
		}
		else if(num==2) {
			FileWrite filwrt = new FileWrite();
			filwrt.filewrite();
		}
		else if(num==3) {
			FileRead filrd = new FileRead();
			filrd.fileread();
		}
		else if(num==4) {
			FileAppend filapnd = new FileAppend();
			filapnd.fileappend();
		}
		else if(num==5) {
			FileDelete fildlt= new FileDelete();
			fildlt.filedelete();
		}
		else {
			System.out.println("You have entered a wrong choice");
		}
	}
}