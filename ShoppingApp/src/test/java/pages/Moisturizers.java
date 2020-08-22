package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Moisturizers {

	WebDriver driver = null;
	
	By click_BuyMoisturizer= By.xpath("/html/body/div/div[3]/div[1]/a/button");
	
	By add_Moisturizer = By.xpath("/html/body/div[1]/div[3]/div[2]/button");
	
	By goto_Cart = By.xpath("/html/body/nav/ul/button");
	
	public Moisturizers(WebDriver driver) {
		this.driver=driver;
	}
	
	
	  public void addMoisturzerInCart() {
		
		
		
		driver.findElement(click_BuyMoisturizer).sendKeys(Keys.ENTER);
		driver.findElement(add_Moisturizer).click();
		
		driver.findElement(goto_Cart).sendKeys(Keys.ENTER);
	}

}
