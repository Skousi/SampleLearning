
public class Student {
	 String name;
	 int roll_no;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student detail=new Student();
		 detail.name="dane";
		 detail.roll_no=44; 
		 detail.display();
	}
	public void display() {
		System.out.println(name);
		System.out.println(roll_no);
	}
	
	public void setValue(String string, int roll) {
		name=string;
		roll_no=roll;
		
	}
	

}
