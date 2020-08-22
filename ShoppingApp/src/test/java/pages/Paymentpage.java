package pages;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


//payment web page
public class Paymentpage {

	 WebDriver driver = null;
	
	//click button locator
	static By click_payWithCard = By.xpath("/html/body/div[1]/div[3]/form/button");
	
	//text box enter email locator
	 By textBox_enterEmail = By.xpath("//div[@class=\"u-paddingTopMd\"]//div[@class=\"Textbox-inputRow\"]");                //xpath("//'[@id=\"a403f1d0-cf1b-11ea-9236-a152afbe14c5\']");
		
	//click button fill details Manually locator
	 By click_fillCardDetailsManually = By.xpath("//*[@id=\'container\']/section/span[2]/div/div/main/form/div/div/div/div/div/div[2]/span/div/div/div/div[2]/span");
	
	//textbox enter card number locator
	 By textBox_enterCardNumber = By.xpath("//*[@id=\'6b41d010-ce67-11ea-bb37-938bd5440623\']");
	
	//textbox enter expiry date locator
	 By textBox_enterExpiryDate = By.xpath("//*[@id=\'6b41f720-ce67-11ea-bb37-938bd5440623\']");
	
	//textbox enter cvv number locator
	 By textBox_enterCVVNumber = By.xpath("//*[@id=\'6b421e30-ce67-11ea-bb37-938bd5440623\']");
	
	//textbox enter zip code locator
	 By testBox_enterzipCode = By.xpath("//'[@id=\"7c001d30-ce71-11ea-86b1-d3c6706a4bda\']");
	
	//click button pay locator
	 By click_pay = By.xpath("//*[@id=\'container\']/section/span[2]/div/div/main/form/nav/div/div/div/button");
	
	
	public Paymentpage(WebDriver driver) {
		this.driver=driver;
	}
	
    // click on pay with card button
	public void click_paymentOption() {
		
		//click on pay with card button
		driver.findElement(click_payWithCard).click();
		
	}
	
	
	// enter the values on payment pop-up
	public  void fillDetails(String email, String cardNum, String expiryDate, String cvvNum, String zipCode ) throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver,15);
		
		//switch to frame
	    WebElement iframeElement = driver.findElement(By.xpath("/html/body/iframe"));
	    //wait.until(ExpectedConditions.visibilityOf(iframeElement));
	    driver.switchTo().frame(iframeElement);
		 
		
		//entering values on payment pop-up
		driver.findElement(textBox_enterEmail).sendKeys(email);
		driver.findElement(click_fillCardDetailsManually).sendKeys(Keys.ENTER);
		driver.findElement(textBox_enterCardNumber).sendKeys(cardNum);
		driver.findElement(textBox_enterExpiryDate).sendKeys(expiryDate);
		driver.findElement(textBox_enterCVVNumber).sendKeys(cvvNum);
		driver.findElement(testBox_enterzipCode).sendKeys(zipCode);
		driver.findElement(click_pay).sendKeys(Keys.ENTER);
	}
}
