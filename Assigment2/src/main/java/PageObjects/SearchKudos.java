package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchKudos extends Precondition{

	public SearchKudos(WebDriver driver) {
		super(driver);
	}
	
	By kudossearch = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[5]/div/h5/a/span");
	By kodusss = By.xpath("//*[@id=\"s_e_add\"]");
	By kodusbtnsearch = By.xpath("//*[@id=\"search_panel\"]/button");
	

	public WebElement kudoss() {
		return driver.findElement(kudossearch);

		
	}
	
	public WebElement kudSearch() {
		return driver.findElement(kodusss);

	}

    public WebElement searchbtn() {
		return driver.findElement(kodusbtnsearch);

	}
			
	

}
