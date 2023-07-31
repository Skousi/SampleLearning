
public class conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char attendance = 'P';
		byte total=100;
		//if,if else, else if conditions
		if(attendance=='P') {
			System.out.println("Present");
		}
		else if (attendance=='O') {
			System.out.println("On duty");
		}
		else {
			System.out.println("Absent");
		}
		//nested if
		if(attendance=='P') {
			if(total>=50) {
				System.out.println("classes taken");
			}
			else {
				System.out.println("homework verified, no classes");
			}
			System.out.println("program ends here");
		}
	}

}
