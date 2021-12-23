package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Precondition {
	
	 
		
		public WebDriver driver;
		By username = By.xpath("/html/body/div[2]/form/input[1]");
		By password = By.xpath("/html/body/div[2]/form/input[2]");
		By login = By.xpath("/html/body/div[2]/form/button");

		
		
		public Precondition(WebDriver driver) {
			
			this.driver=driver;
		}
	    
		public WebElement Clickusername(){
			
			return driver.findElement(username);
			
		}
		
	    public WebElement ClickPassword() {
			
			return driver.findElement(password);
			
		}
		
		
		
		public WebElement ClickLogin() {
			
			return driver.findElement(login);
			
		}
}


