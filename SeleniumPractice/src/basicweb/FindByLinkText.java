package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://www.ifixit.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.linkText("Stories")).click(); //link text
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("squint")).click();//partial link text
	}

}
