package oops_concept;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naturaln(10);
	}
	//Base Case
	public static void naturaln(int n) {
		if(n==1){
			System.out.println(1);
		}
		//Recursive Case
		else{
			System.out.println(n);
			naturaln(n-1);	/*calling the same method called recursive */
			
		}
	}

}
