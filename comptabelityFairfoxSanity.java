// by itshak hadok
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class comptabelityFairfoxSanity {

	WebDriver driver =new FirefoxDriver();

	@Test 

	public void sanity() {
		driver.get("https://svcollegetest.000webhostapp.com/");
		// first question and chose radiobox 1		
		driver.findElement(By.xpath("//*[@id=\"startB\"]")).click();
		WebElement question1 =driver.findElement(By.name("question"));
		question1.sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("a");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("b");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("c");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("d");
		WebElement boxA = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
		boxA.click();
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		//	  second question and chose radiobox 2	
		WebElement question2 =driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
		question2.sendKeys("B");
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("a");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("b");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("c");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("d");
		WebElement boxB = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]"));
		boxB.click();
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		//	  therd question and chose radiobox 3	
		WebElement question3 =driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
		question3.sendKeys("C");
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("a");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("b");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("c");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("d");
		WebElement boxC = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input"));
		boxC.click();
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();

		//start play part 1


		String a =driver.findElement(By.xpath("//*[@id=\"0\"]/h3")).getText();
		if ("A".equals(a)) {
			driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();

		}

		String b =driver.findElement(By.xpath("//*[@id=\"1\"]/h3")).getText();
		if ("B".equals(b)) {
			driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		}
		String c =driver.findElement(By.xpath("//*[@id=\"2\"]/h3")).getText();
		if ("C".equals(c)) {
			driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();

		}
		//	  start play 
		//	  part 2	
		a =driver.findElement(By.xpath("//*[@id=\"0\"]/h3")).getText();
		if ("A".equals(a)) {
			driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();

		}

		b =driver.findElement(By.xpath("//*[@id=\"1\"]/h3")).getText();
		if ("B".equals(b)) {
			driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		}
		c =driver.findElement(By.xpath("//*[@id=\"2\"]/h3")).getText();
		if ("C".equals(c)) {
			driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();

		}
		//	  start play 
		//	  part 3
		a =driver.findElement(By.xpath("//*[@id=\"0\"]/h3")).getText();
		if ("A".equals(a)) {
			driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();

		}

		b =driver.findElement(By.xpath("//*[@id=\"1\"]/h3")).getText();
		if ("B".equals(b)) {
			driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		}
		c =driver.findElement(By.xpath("//*[@id=\"2\"]/h3")).getText();
		if ("C".equals(c)) {
			driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();





			String grade = driver.findElement(By.xpath("//*[@id=\"mark\"]")).getText();
			assertEquals("Sucsses", grade);

		}

	}
}