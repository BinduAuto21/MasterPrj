package novelPkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc5b {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	    driver.findElement(By.name("proceed")).click();
	    Alert alert=driver.switchTo().alert();
	    String alertText=alert.getText();
	    
	    if(alertText.equals("Please enter a valid user name")) {
	    	System.out.println("correct alert message!");
	    }else {
	    	System.out.println("in-correct alert");
	    }
		
		
		
		
		

	}

}
