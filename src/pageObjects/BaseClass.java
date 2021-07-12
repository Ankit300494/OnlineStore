package pageObjects;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;
	public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}private void sysout() {
		// TODO Auto-generated method stub
System.out.println("test");
	}

}
