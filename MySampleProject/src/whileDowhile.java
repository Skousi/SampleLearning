
public class whileDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop
		int n =6;
		int sum =0;
		int i=6;
		/* while (i<=n) {
			sum +=i;
			i++;
		}
		System.out.println("print "+sum); */
		//do while loop
		do {
			sum +=i;
			i++;
		} while (i<=n);
		System.out.println("print "+sum);

	}

}
