package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.*;


public class Temprature {

	static String currentTemp = null;
	static WebDriver driver;
	/*public static void main(String[] args) throws InterruptedException {
		current_temprature_check();
		
	}*/
	
	public Temprature(WebDriver driver) {
		Temprature.driver=driver;
	}
 
	
	//checking temperature
	public void current_temprature_check() throws InterruptedException  {
		
		//Objects for Moisturizers, sunscreen and payment class
		Moisturizers mos=new Moisturizers(driver);
		Sunscreens sun=new Sunscreens(driver);
		Paymentpage pay=new Paymentpage(driver);
		
		
		//opening the weather shopper site
		driver.get("http://weathershopper.pythonanywhere.com/");
		
		currentTemp = driver.findElement(By.xpath("//*[@id=\'temperature\']")).getText();
		String a= currentTemp.substring(0, 2);
				
		
		//converting temprature from string to integer
		int i = Integer.parseInt(a);
		
		try {
		
		//checking if the temprature is less than 30 buy moisturizer
		if(i<=30) {
			
	        mos.addMoisturzerInCart();
		}
		
		//checking if the temprature is greater than 30 buy sunscreen
		else {
			
			sun.add_Sunscreen();
		}
		
		
		//goto the payment page and do the payment
		pay.click_paymentOption();
		pay.fillDetails("abc@gmail.com", "5555555555554444","05/21", "123", "1234");
		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		Thread.sleep(2000);
		driver.close();
	}
}
