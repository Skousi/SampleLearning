package pillars;
 
public class sample {
	 public static void main(){
		daughter obj= new daughter();
		System.out.println(obj.gender);
		obj.print();
		
	}

}

class grandfar{
	char gender='M';
	void print() {
		System.out.println("Im a parent");
	}
	
}
class mother extends grandfar{
	//method overriding
	char gender='F';
}

class daughter extends mother{
	
}


