package oops_concept;

class ClassandObjects {
	 String name;
	int rollno;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassandObjects mydetail=new ClassandObjects();
		mydetail.name="koshanmu";
		mydetail.rollno=46;
		mydetail.display();
	}
	public void display() {
		System.out.println(name);
		System.out.println(rollno);
	}
	public void setvalues(String str, int no) {
		name=str;
		rollno=no;
	}

}
