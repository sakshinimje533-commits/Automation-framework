package TestNG_Study;

import org.testng.annotations.Test;

public class EXP2 {
  @Test
  public void f() {
	  System.out.println("Print");
  }
  
  @Test
  public void f1() {
	  System.out.println("Hello");
  }
  
  @Test    
  public void f2() {                   //@Test -- 1TestCase ---> 1Test Method in automation
	  System.out.println("Hii"); 
  }
   
 
  public void f3() {                   //yala method @Test nhi ahe tr only 3 method show honar jr @Test dil tr 4 method show hoil
	  System.out.println("Bye");      //@Test apn kiti pn gheu shkto
	  }                                //jr apn sgla code lihila ahe ani main method lihili nhi tr code execute nhi honar tsch @test lihili nhi tr method execute honar nhi
}                                      //testng lihin ka mantory ahe?
