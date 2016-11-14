package ide;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IDETest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.facebook.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testIDE() throws Exception {
    driver.get(baseUrl + "/?stype=lo&jlou=AfdQZCiQAjSSgB5rwpZ_6RWQOxsqGYzUkw_BQ3Rx2ahe4Fp0GoE-ACcmYscPI4_dmhUs58wKDAHkeMH3n1Cj71iO&smuh=7821&lh=Ac-okhlCD7YdApup");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("soren.lgl@gmail.com");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("cosette13");
    driver.findElement(By.id("u_0_l")).click();
    driver.findElement(By.xpath("(//button[@value='1'])[5]")).click();
    driver.findElement(By.linkText("Close")).click();
    driver.findElement(By.xpath("(//button[@value='1'])[5]")).click();
    driver.findElement(By.id("userNavigationLabel")).click();
    driver.findElement(By.xpath("//div[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div/div/div/ul/li[16]/a/span/span")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

