import java.util.Iterator;

public class forloopStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simple
		for (int i=0;i<10;i++) {
			System.out.println("sorry pannikuty");
		}
		//n is the sum
		int n =6;
		int sum =0;
		for (int i=1; i<=n; i++) {
			sum +=i;
		}
		System.out.println("sum of n "+sum);
		//factorial
		int a=3;
		int sume=1;
		for (int i=1; i<=a;i++) {
			sume *=i;
		}
		System.out.println(sume);
	}

}
 