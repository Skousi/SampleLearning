
public class JumpStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++) {
			if (i==9) {
				break;
			}
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("program ends here");

	}

}
