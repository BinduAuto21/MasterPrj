package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchPageTest {
	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	@Test(priority=1,groups="Btn2")
	public void SignInTest() {
		boolean b=driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).isSelected();
		Assert.assertEquals(b, true);
		}
	@Test(priority=2,groups="Title")
	public void SignInTitle() {
		String T2=driver.getTitle();
		Assert.assertEquals(T2, T2);
	}
	@Test(priority=3,groups="Account1")
	public void AccountSignIn() {
	boolean c=driver.findElement(By.id("profileIdentifier")).isSelected();
	Assert.assertTrue(c);
	}
	
	
	
	
	
	
	
	
@AfterMethod
public void tearDown() {
	driver.close();
}
}
