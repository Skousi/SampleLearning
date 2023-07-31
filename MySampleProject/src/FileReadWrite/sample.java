package FileReadWrite;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class sample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//quest5
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number ");
		int g=obj.nextInt();
		System.out.println("enter a 2nd number ");
		byte h=obj.nextByte();
		System.out.println(g*h);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int b=Integer.parseInt(br.readLine());
		System.out.println("enter 2nd number");
		int c=Integer.parseInt(br.readLine());
		System.out.println(b+c);
		obj.close();
		br.close();
	}

}
