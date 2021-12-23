package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ColorCode extends Precondition{

	public ColorCode(WebDriver driver) {
		super(driver);
	}
	
	By goldcolor = By.xpath("/html/body/div[1]");
	By navycolor = By.xpath("/html/body/div[2]/form/button");
	By whitecolor = By.xpath("/html/body/div[2]");
	
	public WebElement gold() {
		
		return driver.findElement(goldcolor);
	}

    public WebElement navy() {
		
		return driver.findElement(navycolor);
	}
    
    public WebElement white() {
		
		return driver.findElement(whitecolor);
	}
	
}
