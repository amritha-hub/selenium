package testNG;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.out.println("setup system proper");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}

	@BeforeTest

	public void login() {
		System.out.println("login to app");
	}

	@BeforeMethod
	public void enterUrl() {
		System.out.println("enter URL");
	}

	@Test
	public void googletitletest() {
		System.out.println("Google title test");
	}

	@AfterMethod
	public void logOut() {
		System.out.println("logout from app");
	}
}
