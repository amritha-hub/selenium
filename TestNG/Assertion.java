package testNG;
import org.junit.Assert;
import org.openqa.selenium.*;


public class Assertion {
public void TestGoogle()throws Exception{
	WebDriverManager.chromedriver().setup();
	driver.manage().window.maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("tutorial",Keys.ENTER);
	String expectedTitle="Tutorials-Google Search";
	String actualTitle=driver.getTitle();
	Assert.assertEquals(actualTitle,expectedTitle);
	driver.quit();
}


}
