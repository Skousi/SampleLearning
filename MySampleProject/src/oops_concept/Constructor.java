package oops_concept;

public class Constructor {
	int rollno;
	int marks;
	public static void main(String[] args) {
		System.out.println();
	}
	Constructor(int roln){
		rollno=roln;
		marks=44;
		System.out.println("run as expected");
		//default & parameterized constructor
}
	Constructor(){
		this.rollno=46;
		this.marks=34;
		System.out.println("run as expected");
		//default & parameterized constructor
	}
}

