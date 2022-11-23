package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Screenshotlistenertest  {
	@Test
	public void launchApp()
	{
	driver.get("https://ebay.com");
	Assert.assertTrue(false);
	}

}
