import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heygoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\FS\\chromedriver_win32\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.amazon.in/");
		a.manage().window().maximize();
		a.findElement(By.id("twotabsearchtextbox")).sendKeys("funky shirts");
		a.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		a.findElement(By.xpath("//*[@id=\"p_89/Campus Sutra\"]/span/a/div/label/i")).click();
		// storing the value that the checkbox is selected or not is in variable b and
		// print b.
		boolean b = a.findElement(By.xpath("//*[@id=\"p_89/Campus Sutra\"]/span/a/div/label/i")).isSelected();
		System.out.println(b);
		
	}

}
