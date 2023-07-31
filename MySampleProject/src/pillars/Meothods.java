package pillars;

public class Meothods {
	void min(int a, int b){
		if (a<b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
	//polymophism
	void min(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void min(int[] arr) {
		System.out.println(+arr[2]);
	}

}
