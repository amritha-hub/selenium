package testNG;

import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider = "create", dataProviderClass = DataProvider.class)
	public void Test1(String Usename, String Password) {
		System.out.println(Usename + "======" + Password);
	}

	@Test(dataProvider = "create", dataProviderClass = DataProvider.class)
	public void Test2(String Usename) {
		System.out.println(Usename);
	}

	@Test(dataProvider = "create", dataProviderClass = DataProvider.class)
	public void Test3(String Usename, String Password, String OKay) {
		System.out.println(Usename + "======" + Password + "=========" + OKay);
	}
}
