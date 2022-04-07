package testNGExtent;

import org.testng.annotations.Test;

public class TestNGGrouping {

	@Test(groups = {"sanity", "smoke", "regression"})
	void tc01() {
		System.out.println("tc01 method is executed");
	}

	@Test(groups = {"sanity"})
	void tc02() {
		System.out.println("tc02 method is executed");
	}

	@Test(groups = {"smoke"})
	void tc03() {
		System.out.println("tc03 method is executed");
	}

	@Test(groups = {"regression"})
	void tc04() {
		System.out.println("tc04 method is executed");
	}

}
