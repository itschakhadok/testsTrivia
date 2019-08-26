// by itshak hadok
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		static WebDriver driver = new ChromeDriver();


		public static String integration() {
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

			//				  second question and chose radiobox 2	
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

			//				  therd question and chose radiobox 3	
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

			//				  start play 
			//				  question 1
			String ansewr1= driver.findElement(By.xpath("//*[@id=\"2\"]/h3")).getText();
			if(ansewr1.contains("A")) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			}
			String ansewr2= driver.findElement(By.xpath("//*[@id=\"1\"]/h3")).getText();
			if(ansewr2.contains("B")) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			}

			String ansewr3= driver.findElement(By.xpath("//*[@id=\"2\"]/h3")).getText();
			if(ansewr3.contains("C")) {
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
			}
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();




			//						  question 2
			ansewr1= driver.findElement(By.xpath("//*[@id=\"2\"]/h3")).getText();
			if(ansewr1.contains("A")) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			}
			ansewr2= driver.findElement(By.xpath("//*[@id=\"1\"]/h3")).getText();
			if(ansewr2.contains("B")) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			}

			ansewr3= driver.findElement(By.xpath("//*[@id=\"2\"]/h3")).getText();
			if(ansewr3.contains("C")) {
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
			}
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			
			//			             question 3
			ansewr1= driver.findElement(By.xpath("//*[@id=\"0\"]/h3")).getText();
			if(ansewr1.contains("A")) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			}
			ansewr2= driver.findElement(By.xpath("//*[@id=\"1\"]/h3")).getText();
			if(ansewr2.contains("B")) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			}

			ansewr3= driver.findElement(By.xpath("//*[@id=\"2\"]/h3")).getText();
			if(ansewr3.contains("C")) {
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
			}
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
//	       click on share faceboock
			driver.findElement(By.xpath("//*[@id=\"fackBook2\"]/img")).click();
			String accptetPageUrl = driver.getCurrentUrl();
			//		 assertEquals(" https://svcollegetest.000webhostapp.com/", accptetPageUrl);

			//		 assertEquals("https://he-il.facebook.com/", accptetPageUrl);
			return accptetPageUrl;

		}
		public static String t1() {
			//			start
			driver.get("https://svcollegetest.000webhostapp.com/");
			String start  =driver.findElement(By.xpath("//*[@id=\"headstart\"]/legend")).getText();
			return start;
		}
		public static String t2() {
			//            page question1			

			driver.findElement(By.xpath("//*[@id=\"startB\"]")).click();
			String questin1  =driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).getText();

			return questin1;
		}


		public static String t3() {
			//          ansewr 1
			WebElement question1 =driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
			question1.sendKeys("A");
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
			String ansewr1  =driver.findElement(By.xpath("//*[@id=\"answers\"]/legend")).getText();

			return ansewr1;
		}



		public static String t4() {
			//			back

			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("a");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("b");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("c");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("d");
			WebElement boxB = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
			boxB.click();
			driver.findElement(By.xpath("//*[@id=\"backquest\"]")).click();
			String questin12  =driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).getText();
			return questin12;

		}


		public static boolean t5() {
			//			enter  10/20/ 30 lettel in ansewer 
			String[] ansewrr1 = {  "aaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
			for(int i=0;i>4;i++) {

				driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
				WebElement ansewr1 =  driver.findElement(By.xpath("//*[@id=\\\"answers\\\"]/div[1]/div[2]/input//div[2]"));
				ansewr1.sendKeys(ansewrr1[i]);
			}
			return true;
		}
		public static String t8() {
			//			passe page question2 

			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("a");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("b");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("c");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("d");
			WebElement boxA = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
			boxA.click();
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
			String questin2  =driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).getText();

			return questin2;
		}

		public static String t9() {
			//					question 3
			WebElement question2 =driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
			question2.sendKeys("b");
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
			WebElement boxBb = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
			boxBb.click();
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("a");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("b");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("c");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("d");



			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

			String questin3  =driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).getText();

			return questin3;
		}
		public static String t10() {
			//					ansewr3
			WebElement question3 =driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
			question3.sendKeys("c");
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

			String ansewr3  =driver.findElement(By.xpath("//*[@id=\"answers\"]/legend")).getText();

			return ansewr3;
		}
		public static String t11() {
			//					back
		driver.findElement(By.xpath("//*[@id=\"backquest\"]")).click();
			String questin3  =driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/legend")).getText();
			//*[@id="myform1"]/div/legend
			return questin3;
		}
		
		public static String t12() {
			//					quit

			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("a");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("b");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("c");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("d");
			WebElement boxC = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input"));
			boxC.click();
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[2]]")).click();
			String start  =driver.findElement(By.xpath("//*[@id=\"headstart\"]/legend")).getText();
			return start;
		}

		public static String t13() {
			//					back

			driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
			//		             start play part1
			driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnback\"]")).click();

			String back1= driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).getText();
			return back1;
		}

		public static String t14() {
			//					back in ansewr 2
			driver.findElement(By.xpath("//*[@id=\"btnback\"]")).click();
			String back2= driver.findElement(By.xpath("//*[@id=\"2\"]/h3")).getText();
			return back2;
		}

		public static boolean t15() {
			//					click next without mark any question ansewr 2
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();

			//		  part 2
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			String back3= driver.findElement(By.xpath("//*[@id=\"1\"]/h3")).getText();
			if( back3=="b")
				return true;
			return false;
		}


		public static String t16() {
			//					back ansewr 3

			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();

			//		  part 2
			driver.findElement(By.xpath("//*[@id=\"1\"]/input[4]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			//  part 3
			driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnback\"]")).click();

			//driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
			String back3= driver.findElement(By.xpath("//*[@id=\"1\"]/h3")).getText();


			return back3;
		}

		public static String t17()  {
			driver.findElement(By.xpath("//*[@id=\"0\"]/input[4]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			String grade = driver.findElement(By.xpath("//*[@id=\"mark\"]")).getText();
			return grade;
		}


		public static String t18()  {
			//    tray again

			driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[1]")).click();
			String tray= driver.findElement(By.xpath("//*[@id=\"2\"]/h3")).getText();
			return tray;
		}

		public static String t19()  {

			driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();

			//	  part 2
			driver.findElement(By.xpath("//*[@id=\"1\"]/input[4]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			//  part 3
			driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			String grade = driver.findElement(By.xpath("//*[@id=\"mark\"]")).getText();
			return grade;
		}

		public static boolean t20()  {
			//		  quit

			driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[2]")).click();
			return true;

		
	


	}

}
