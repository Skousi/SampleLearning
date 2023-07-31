package oops_concept;

public class CreateObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object for another class
		ClassandObjects mydetail=new ClassandObjects();
		mydetail.name="SAT";
		mydetail.rollno=43;
		mydetail.display();
		
		ClassandObjects ourdetail=new ClassandObjects();
		ourdetail.name="kid";
		ourdetail.rollno=12;
		ourdetail.display();
		
		//Passing parameters for another class
		ClassandObjects detail=new ClassandObjects();
		detail.setvalues("kiddo", 31);
		detail.display();


	}

}
