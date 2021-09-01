package TestNGReview;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGReview {

	@Test
	  public void f() {
		  System.out.println("Hello akash Test1");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Hello akash Before test 2");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("Hello akash After test 3");
	  }

}
