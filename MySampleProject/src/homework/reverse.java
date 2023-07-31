package homework;

import java.util.Iterator;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a input");
		char[] arr=obj.nextLine().toCharArray();
		System.out.println("revrse string");
		//1way without method
		for (int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]);
		}
		//with method
		StringBuilder input=new StringBuilder();
		input.append(arr);
		input.reverse();
		System.out.println(input);
		

	}

}
