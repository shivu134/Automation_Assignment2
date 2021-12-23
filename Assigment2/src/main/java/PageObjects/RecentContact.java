package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecentContact extends Precondition {

	 
	   public RecentContact(WebDriver driver) {
			super(driver);
	}

       By clickrec = By.xpath("//*[@id=\"contact_list\"]/div[1]/div/h5/small/a/i");
      
	   By taketab = By.xpath("//*[@id=\"trophy_list\"]/div[3]/div/div");
	   By comments = By.xpath("//*[@id=\"comment\"]");
       By cancel = By.xpath("//*[@id=\"myModal\"]/div/div/div/button[1]");
       By submit = By.xpath("//*[@id=\"myModal\"]/div/div/div/button[2]");
       By close = By.xpath("//*[@id=\"shoutout_form\"]/div[1]/button");
	   
	   
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
