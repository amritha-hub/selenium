package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Meow {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","D:\\FS\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver a = new ChromeDriver();// object for driver.
		a.get("http://automationpractice.com/index.php");
		a.manage().window().maximize();
		a.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		a.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("amrithajk4@gmail.com");
		a.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		Thread.sleep(60000);
		a.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();

	}

}
