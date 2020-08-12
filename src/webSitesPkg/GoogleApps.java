package webSitesPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleApps {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
		
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\'yDmH0d\']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[3]/a/div/span")).click();
		
		//driver.navigate().to("Account");
		//driver.findElement(By.xpath("//*[@id=\"gsr\"]")).click();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
