package FileReadWrite;

import java.util.Scanner;
import java.io.File;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		File path=new File("D:\\example.txt");
		Scanner read=new Scanner(path);
		while(read.hasNextLine()) {
			System.out.println(read.nextLine());
			read.close();
			}
	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
