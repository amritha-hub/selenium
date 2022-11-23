import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\FS\\chromedriver_win32\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://codepen.io/givemetheSUCC/pen/BQJYzj");
		a.manage().window().maximize();
		a.switchTo().frame(a.findElement(By.id("result")));
		a.findElement(By.xpath("//*[@id=\"question2\"]/input[1]")).click();
		boolean b=a.findElement(By.xpath("//*[@id=\"question2\"]/input[1]")).isSelected();
		System.out.println(b);
	
	}

}
