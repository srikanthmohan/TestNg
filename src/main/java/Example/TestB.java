package Example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.TestNG;

public class TestB {
	
	public WebDriver driver;
	
	@BeforeMethod
	@BeforeClass
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testB() {
		driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		AssertJUnit.assertTrue(strPageTitle.equalsIgnoreCase("Google"));
	}

<<<<<<< HEAD
	@Test
	public void testB2() {
		System.out.println("Im in test sample two");
	}
=======
	//@Test
	//public void testSampleTwo() {
	//	System.out.println("Im in test sample two");
	//}
>>>>>>> 3f020cfb8320e0093023e4fd1c4a404e41d0d1dd
	
	//@Test
	//public void testB3() {
	//	System.out.println("Im in test sample three");
	//}

	@AfterMethod
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing IE browser");
			driver.quit();
		}
	}
	
}
