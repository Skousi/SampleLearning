package pillars;

public class call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parentclass
		Animal obj=new dog();
		System.out.println(obj.nolegs);
		obj.Eat();
		obj.walk();
		
		//child class inheritance
		dog obj1=new dog();
		System.out.println(obj1.bark);
		System.out.println(obj1.nolegs);
		obj1.Eat();
		obj1.walk();
		obj1.bark();
		

	}

}
