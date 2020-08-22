package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Sunscreens {

	WebDriver driver = null;
	
	By buy_sunscreen = By.xpath("/html/body/div/div[3]/div[2]/a/button");
	
	By add_sunscreen = By.xpath("/html/body/div[1]/div[2]/div[3]/button");
	
	By goto_cart = By.xpath("/html/body/nav/ul/button");
	
	public Sunscreens(WebDriver driver) {
		this.driver = driver;
	}
	
	public  void add_Sunscreen() {
		
		
		
		driver.findElement(buy_sunscreen).sendKeys(Keys.ENTER);
		
		driver.findElement(add_sunscreen).sendKeys(Keys.ENTER);
		
		driver.findElement(goto_cart).sendKeys(Keys.ENTER);
	}

}
