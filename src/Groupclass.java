import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupclass {
	
	@Test(groups= {"module1"})
	public void TC1()
	{
		Reporter.log("running test case 1");
	}
	
	@Test(groups= {"module2"})
	public void TC2()
	{
		Reporter.log("Running test case 2");
	}
	
	@Test (groups= {"module2"})
	public void TC3()
	{
		Reporter.log("running test case 3");
	}
	
	@Test(groups= {"module1"})
	public void TC4()
	{
		Reporter.log("running test case 4");
	}
	
	@Test(groups= {"module2"})
	public void TC5()
	{
		Reporter.log("running test case 5");
	}

}
