package novelPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc5a {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.id("fileupload")).sendKeys("\"C:\\Users\\bkarn\\OneDrive\\Desktop\\junk\\MindBoggling.txt\"");
		driver.findElement(By.xpath("//*[@id=\"post-206\"]/div/div[4]/form/input[2]")).click();

		
		

	}

}
