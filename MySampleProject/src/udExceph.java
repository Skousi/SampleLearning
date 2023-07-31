
public class udExceph {
	
	static void agelimit(int age) {
		if(age<=18) {
			throw new ArithmeticException("Age is not valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			agelimit(1);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
		

	}

}
