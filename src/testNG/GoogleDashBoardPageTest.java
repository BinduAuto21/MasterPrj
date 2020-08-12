package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleDashBoardPageTest {
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
	
	@Test(priority=1,groups="title")
	public void TitleTest1() {
		String s1=driver.getTitle();
		String s2="Google";
		Assert.assertEquals(s1, s2);
		}
	@Test(priority=2,groups="logo")
	public void LogoTest1() {
		boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b);
		}
	@Test(priority=3,groups="Links")
	public void LinkTest1() {
		boolean m=driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).isDisplayed();
		Assert.assertTrue(m);
		}
	@Test(priority=4,groups="Links")
	public void LinkTest2() {
		boolean n=driver.findElement(By.linkText("Images")).isDisplayed();
		Assert.assertTrue(n);
		}
	@Test(priority=5,groups="buttons")
	public void ButtonTest1() {
		boolean o=driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).isDisplayed();
		Assert.assertTrue(o);
		}
	@Test(priority=6,groups="buttons")
	public void ButtonTest2() {
		boolean p=driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).isDisplayed();
		Assert.assertTrue(p);
	   }
	@Test(priority=7,groups="buttons")
	public void ButtonTest3() {
		boolean q=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).isDisplayed();
		Assert.assertTrue(q);
		}
	@Test(priority=8,groups="buttons")
	public void ButtonTest4() {
		String text=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/div/div/div[9]")).getText();
		Assert.assertEquals(text, text, text);
		
	}
	
	
	
	
	
	
@AfterMethod
public void tearDown() {
	driver.close();
}

}
