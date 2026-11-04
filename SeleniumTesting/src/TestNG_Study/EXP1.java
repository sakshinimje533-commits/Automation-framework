package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EXP1 {
  @Test
  public void f() {
	  System.out.println("TesNG Print");
	  
  }
  @Test
  public void add() {
	  int a = 10;
	  int b = 20;
	  int c = a + b;
	  System.out.println(c);
	  System.out.println("Addition of two number " + c);
	  Reporter.log("Addition of two number " + c , true );
	 
  }
  
  
  @Test
  public void multiplication() {
	  int d = 5;
	  int e = 10;
	  int f = d * e;
	  System.out.println(f);
	  System.out.println("Multiplication of two number " + f);
	  Reporter.log("Multiplication of two number " + f , true);
  }
}
