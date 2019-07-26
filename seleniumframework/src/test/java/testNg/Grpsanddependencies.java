package testNg;

import org.testng.annotations.Test;

public class Grpsanddependencies {
	
	
	@Test(priority=3,groups= {"sanity"})
	public void m1() {
		System.out.println("Imside m1");
	}
	@Test(priority=2)
	public void m2() {
		System.out.println("Imside m2");
	}
	@Test(priority=2, dependsOnGroups= {"sanity"})
	public void m3() {
		System.out.println("Imside m3");
	}

}
