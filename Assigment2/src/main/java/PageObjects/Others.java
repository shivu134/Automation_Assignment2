package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Others extends Precondition{

	public Others(WebDriver driver) {
		super(driver);
	}
	
	By KFM = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/h5/a/span");
	By KTM = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[4]/div/h5/a/span");
	By KFMcheck = By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5/b[1]");
	
	
	public WebElement Kudosfmm() {
		return driver.findElement(KFM);
	}
	
	public WebElement KudosTm() {
		return driver.findElement(KTM);
	}

}
