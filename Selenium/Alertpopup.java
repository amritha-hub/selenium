import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Alertpopup {

	public static void main(String[] args) throws Exception {
		// web alert msg popup
		/* System.setProperty("webdriver.chrome.driver", "D:\\FS\\chromedriver_win32\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://mail.rediff.com/cgi-bin/login.cgi");
		a.manage().window().maximize();
		a.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert b = driver.switchTo.alert();
		System.out.println(b.getText());
		String text = b.getText();
		if (text.equals("Please enter a valid user name"))
			System.out.println("correct alert msg");
		else
			System.out.println("incorrect alert msg");
		b.accept();// to click OK button
        //b.dismiss();//to click cancel button  */
		
		
		
		
		//window popup
		System.setProperty("webdriver.chrome.driver", "D:\\FS\\chromedriver_win32\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://html.com/input-type-file/");
		a.manage().window().maximize();
		a.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\UNNI\\Desktop/Ayush.docx");//in sendkeys location of the file chosen is given
		
		
		
		
		
		

	}

}
