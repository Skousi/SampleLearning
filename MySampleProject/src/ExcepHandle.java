
public class ExcepHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=4;
		
		try {
			System.out.println(a/b);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("one of the given value is 0 so division is not possible");
		}
		finally {
			System.out.println("final");
		}

	}

}
