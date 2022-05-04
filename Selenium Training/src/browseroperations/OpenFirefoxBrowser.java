package browseroperations;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		
		String driverPath1 ="E:\\JAVA WORKSPACE\\Selenium Training\\executables\\geckodriver.exe";
				//or
		String driverPath2=".\\executables\\geckodriver.exe";
				//or
		String driverPath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		
		
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverPath2);
		//step2: create an instance of Firefox Browser
		FirefoxDriver cdriver=new FirefoxDriver();
	}

}