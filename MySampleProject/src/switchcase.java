
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char attendence = 'o';
		//switch case statement
		switch (attendence)
		{
			case 'O':
				System.out.println("Onduty");
				break;
			case 'P':
				System.out.println("Present");
				break;
			case 'A':
				System.out.println("Absent");
				break;
			
			default:
				System.out.println("Invalid");
		}
	}
}
