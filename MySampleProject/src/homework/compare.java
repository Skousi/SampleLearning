package homework;

import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first input");
		int a=obj.nextInt();
		System.out.println("enter 2nd input");
		int b=obj.nextInt();
		if (a==b) {
			System.out.println("a==b");
		}
		else if (a>b)	{
			System.out.println("a>b");
		}
		else if (a<b){
			System.out.println("a<b");
		}
	}

}
