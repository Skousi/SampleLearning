
public class EmployeeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name"+'\t'+"YOJ"+'\t'+"Address");
		Employeelist emp=new Employeelist();
		emp.ename="Robert ";
		emp.joining=1994;
		emp.address="64C- WallsStreat";
		emp.display();
		
		Employeelist emp1=new Employeelist();
		emp1.ename="Sam";
		emp1.joining=2000;
		emp1.address="68D- WallsStreat";
		emp1.display();
		
		Employeelist emp2=new Employeelist();
		emp2.setvalue("John", 1999,"26B- WallsStreat");
		emp2.display();
		}

}
