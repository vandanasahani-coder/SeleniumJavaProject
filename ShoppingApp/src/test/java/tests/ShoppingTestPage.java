package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class ShoppingTestPage {
	
	static WebDriver driver;
	
	@BeforeTest
	//intializing the browser
	public void initializeBrowser() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	//test the entire shopping webpage
	public void shoppingTest() throws InterruptedException {
	
		Temprature temp=new Temprature(driver);
		
		temp.current_temprature_check();
	}
	
}
