import java.util.Date;

public class Helloword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pannikutyy"); 
		char age='A';
		Date today =new Date();
		System.out.println(today);
		System.out.println();
		
		//Implicit Typecasting
		int a=10;
		int b=4;
		float c=a/b;
		System.out.println(c);
		
		//Explcit Typecasting
				int d=10;
				int e=4;
				float f=(float)d/(float)e;
				System.out.println(f);
		//Not Operator
				boolean aa=true;
				boolean bb=false;
				System.out.println(!aa);
				System.out.println(!bb);
				
		//OR Operator
		boolean g=true;
		boolean h=false;
		System.out.println(g||h);
		
		//And Operator
				boolean i=false;
				boolean j=false;
				System.out.println(i&&j);
		//precedence
				int cc=4;
				int dd=2;
				System.out.println(cc*dd+cc-dd);
	}

	

}
