
public class Employeelist {
	String ename, address;
	int joining;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public void display() {
		System.out.println(ename+'\t'+joining+'\t'+address);
	}
	public void setvalue(String name,int join,String add)
	{
		ename=name;
		joining=join;
		address=add;
		
		
	}
}
