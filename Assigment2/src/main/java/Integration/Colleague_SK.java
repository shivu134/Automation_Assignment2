package Integration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Colleague_SK {
	
	public WebDriver driver;
	By username = By.xpath("/html/body/div[2]/form/input[1]");
	By password = By.xpath("/html/body/div[2]/form/input[2]");
	By login = By.xpath("/html/body/div[2]/form/button");
	By clickrec = By.xpath("//*[@id=\"contact_list\"]/div[1]/div/h5/small/a/i");
    By taketab = By.xpath("//*[@id=\"trophy_list\"]/div[3]/div/div");
	By comments = By.xpath("//*[@id=\"comment\"]");
    By cancel = By.xpath("//*[@id=\"myModal\"]/div/div/div/button[1]");
    By submit = By.xpath("//*[@id=\"myModal\"]/div/div/div/button[2]");
    By close = By.xpath("//*[@id=\"shoutout_form\"]/div[1]/button");
	
	
    
	
	public Colleague_SK(WebDriver driver) {
	      this.driver = driver;	
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
	
	public WebElement clickRc() {
		return driver.findElement(clickrec);
		   
	   }
	  
	   
	   public WebElement Taketab() {
		return driver.findElement(taketab);
		   
	}
	   
	   public WebElement Comments() {
		return driver.findElement(comments);
		   
	   }
	   
	   public WebElement Cancel() {
		return driver.findElement(cancel);
	}

	   
	   public WebElement Submit() {
		   return driver.findElement(submit);
	   }
	   
	  
	   public WebElement closebtn() {
		   return driver.findElement(close);
	   }
	   


}
