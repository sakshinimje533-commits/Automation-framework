package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keyword_prIORITY {
	
	
	@Test (priority = 1)
	public void C()
	{
		Reporter.log("C is running",true);
	  }
	  
  @Test (priority = 3)
    public void A()
  {
	 Reporter.log("A is running",true);
  }
  
  @Test (priority = 2)
  public void B() 
  {
	 Reporter.log("B is running",true);
  }
  
  @Test (priority = 4)
public void D() 
{
	Reporter.log("D is running",true);
}	 
	
 
}
