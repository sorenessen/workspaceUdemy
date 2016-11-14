package switchTo;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMega {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://mega.nz";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void test() {
		WebElement login = driver.findElement(By.xpath("//div[@class='top-head']//a[@class='top-login-button hidden']"));
		login.click();
		WebElement loginEmailBox = driver.findElement(By.id("login-name"));
		loginEmailBox.sendKeys("soreneessennt@gmail.com");
		WebElement loginPWBox = driver.findElement(By.id("login-password"));
		loginPWBox.sendKeys("cosette13");
		WebElement LoginButton = driver.findElement(By.xpath("//div[@class='top-dialog-login-button']"));
		LoginButton.click();
		String parentHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		WebElement fileUpload = driver.findElement(By.xpath("//input[@id='fileselect1']"));
		fileUpload.click();
		
	}

	@After
	public void tearDown() throws Exception {
	}


}
