// by itshak hadok
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class testFuncutionality {
	WebDriver driver = new ChromeDriver();

	@Test
	@DisplayName("start number, test 1")
	void t1est1() {
		assertEquals("QA Test, to start the the test push the bottun below! good luck!",method.t1());
	}
	
	@Test
	@DisplayName("page question1, test number 2")
	void t1est2() {

		assertEquals("Please type here your question :\n" + "question number: 1", method.t2());
		System.out.println("test2");
	}


	@Test
	@DisplayName("page ansewr1, test number 3")
	void t1est3() {
		assertEquals("Please enter 4 possible answers and Mark the right one!\n" + "question number: 1", method.t3());
		System.out.println("test3");
	}


	@Test
	@DisplayName("bouton back in ansewr1, test number4")
	public void t1est4(){
		assertEquals("Please type here your question :\n" + "question number: 1", method.t4());
	}

	@RepeatedTest(3)
	@DisplayName("enter 10/20/30 letter, test number 5+6+7")
	public void t1est5() {
		assertEquals(true, method.t5());	
	}
	@Test
	@DisplayName("page question2, test number 8")
	public void t1est8() {
		assertEquals("Please type here your question :\n" + "question number: 2", method.t8());
	}
	
	@Test
	@DisplayName("page question3, test number 9")
	public void t1est9() {
		assertEquals("Please type here your question :\n" + "question number: 3", method.t9());

	}
	@Test

	@DisplayName("page ansewr 3, test number 10")
	public void test10() {
		assertEquals("Please enter 4 possible answers and Mark the right one!\n" + "question number: 3", method.t10());
	}

	@Test
	@DisplayName("back in ansewr 3, test  number11")
	public void t1est11(){
		assertEquals("Please type here your question :\n" + "question number: 3", method.t11());
		System.out.println("11");
	}
	
	@Test
	@DisplayName("quit, test number12")
	public void t1est12(){
		assertEquals("QA Test, to start the the test push the bottun below! good luck!", method.t12());
	}	
	
	@Test
	@DisplayName("bouton back in ansewr1, test number13")
	public void t1est13(){
		assertEquals("Play", method.t13());
	}
	
	@Test
	@DisplayName("bouton back in ansewr2, test  number14")
	public void t1est14(){
		assertEquals("c", method.t14());
	}

	@Test
	@DisplayName("click next without mark any question ansewr2, test number 15")
	public void t1est15(){
		assertEquals(true, method.t15());
	}
	@Test
	@DisplayName("bouton back in ansewr3, test number16")
	public void t1est16(){
		assertEquals("b", method.t16());
	}
	@Test
	@DisplayName("get faild in uncorect all ansewr, test number 17")
	public void t1est17(){
		assertEquals("Failed", method.t17());
	}
	@Test
	@DisplayName("tray agian, test number 18")
	public void t1est18(){
		assertEquals("c", method.t18());
	}
	@Test
	@DisplayName("get faild in uncorect one ansewr, test number 19")
	public void t1est19(){
		assertEquals("Failed", method.t19());
	}
	@Test
	@DisplayName("quit, test number 20")
	public void t2est20(){
		assertEquals(true, method.t20());
	}


}
