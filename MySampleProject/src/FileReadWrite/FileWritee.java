package FileReadWrite;
import java.io.File;
import java.io.FileWriter;

public class FileWritee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File path=new File("D:\\example.txt");
			FileWriter writ=new FileWriter(path);
			writ.write("my life");
			writ.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
