
public class userexcep2 {
	static void check(int age)throws userexcep {
		if (age<=18) {
			throw new userexcep("AAge is not valid");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check(12);

	}catch (userexcep e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}

}
}