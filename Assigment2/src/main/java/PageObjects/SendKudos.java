package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendKudos extends Precondition{

	public SendKudos(WebDriver driver) {
		super(driver);
	}

   By sendkudos = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/a");
   By searchSK = By.xpath("//*[@id=\"email_address\"]");
   By taketab = By.xpath("//*[@id=\"trophy_list\"]/div[3]/div/div");
   By comments = By.xpath("//*[@id=\"comment\"]");
   By cancel = By.xpath("//*[@id=\"myModal\"]/div/div/div/button[1]");
   By submit = By.xpath("//*[@id=\"myModal\"]/div/div/div/button[2]");
   By close = By.xpath("//*[@id=\"shoutout_form\"]/div[1]/button");
   By exceptional = By.xpath("//*[@id=\"trophy_list\"]/div[1]/div/div");
   By excellent = By.xpath("//*[@id=\"trophy_list\"]/div[2]/div/div");
   By goodclient = By.xpath("//*[@id=\"trophy_list\"]/div[4]/div/div");
   By quality = By.xpath("//*[@id=\"trophy_list\"]/div[5]/div/div");
   By quicklearner = By.xpath("//*[@id=\"trophy_list\"]/div[6]/div/div");
   By hardworker = By.xpath("//*[@id=\"trophy_list\"]/div[7]/div/div");
   By teamplayer = By.xpath("//*[@id=\"trophy_list\"]/div[8]/div/div");
   By Confirmation = By.xpath("//*[@id=\"display_message\"]");
   
   
   public WebElement SendKudosq() {
		return driver.findElement(sendkudos);
	}
	
   
   public WebElement SearchK() {
	   return driver.findElement(searchSK);
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
   
	
   public WebElement Exceptional() {
		return driver.findElement(exceptional);
	}
	
   public WebElement Excellent() {
		return driver.findElement(excellent);
	}
	
   public WebElement GoodClient() {
		return driver.findElement(goodclient);
	}
	
   public WebElement QualityHero() {
		return driver.findElement(quality);
	}
	
   public WebElement QuickLearner() {
		return driver.findElement(quicklearner);
	}
	
   public WebElement HardWorker() {
		return driver.findElement(hardworker);
	}
	
   public WebElement TeamPlayer() {
		return driver.findElement(teamplayer);
	}
	
   public WebElement Confirmation() {
	   return driver.findElement(Confirmation);
   }

}

