package basicweb;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsAndCheckBoxes {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		String baseUrl = "http://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}

	@Test
	public void test() throws InterruptedException {
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
			bmwRadioBtn.click();
		Thread.sleep(2000);
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
			benzRadioBtn.click();
	
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
			bmwCheckBox.click();
		Thread.sleep(2000);
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
			benzCheckBox.click();
			
		System.out.println("BMW radio button is selected: " + bmwRadioBtn.isSelected());
		System.out.println("Benz radio button is selected: " + benzRadioBtn.isSelected());
		System.out.println("BMW check box is selected: " + bmwCheckBox.isSelected());
		System.out.println("Benz check box is selected: " + benzCheckBox.isSelected());
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
