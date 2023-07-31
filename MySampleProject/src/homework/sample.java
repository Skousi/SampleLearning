package homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class sample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//quest5
		Scanner multi=new Scanner(System.in);
		System.out.println("enter a number");
		int x=multi.nextInt();
		for(int i=1; i<=10;i++) {
			System.out.println(x*i);
		}
		
	}

}
