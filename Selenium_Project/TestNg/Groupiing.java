package TestNg;

import org.testng.annotations.Test;

public class Groupiing {
	@Test(groups = "apple")
	public void apple1() {
		System.out.println("im apple 1");
	}
	@Test(groups = "apple")
	public void apple2() {
		System.out.println("im apple 2");
	}
	@Test(groups = "moto")
	public void moto1() {
		System.out.println("im moto 1");
	}
	@Test(groups = "moto")
	public void moto2() {
		System.out.println("im moto 2");
	}
	@Test(groups = "vivo")
	public void vivo1() {
		System.out.println("im vivo 1");
	}
	@Test(groups = "vivo")
	public void vivo2() {
		System.out.println("im vivo 2");
	}
	@Test(groups = "leno")
	public void lenova1() {
		System.out.println("im lenova 1");
	}
	@Test(groups = "leno")
	public void lenova2() {
		System.out.println("im lenova 2");
	}

}
