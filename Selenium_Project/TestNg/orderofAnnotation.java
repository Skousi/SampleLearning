package TestNg;

import org.testng.annotations.Test;

public class orderofAnnotation {
	@Test (priority = 1,dependsOnMethods ="musicon")
	public void startthecar() {
		System.out.println("car started");
	}
	@Test (priority = 0,dependsOnMethods ="musicon")
	public void puttheKey() {
		System.out.println("key is on");
	}
	@Test (priority = 2,dependsOnMethods ="musicon")
	public void firstGear() {
		System.out.println("Started on first gear");
	}
	@Test (priority = 3,dependsOnMethods ="musicon")
	public void secondgear() {
		System.out.println("running on second gear");
	}
	@Test (priority = 4, enabled=true)
	public void musicon() {
		System.out.println("Music turned on");
	}
	@Test (priority = 5, enabled=true, dependsOnMethods ="musicon")
	public void musicfun() {
		System.out.println("funtime");
	}

}
