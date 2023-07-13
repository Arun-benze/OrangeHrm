package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pojopages.LoginPojoClass;

public class LoginTestCase {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	@Test
	public void loginCase() {
		LoginPojoClass loginPojoClass=new LoginPojoClass(driver);
		loginPojoClass.login("Admin", "admin123");
	}
		@AfterClass
		public static void afterClass() {
			driver.close();
		}


}

