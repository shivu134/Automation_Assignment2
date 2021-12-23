package TestPackage;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.SearchKudos;
import PageObjects.SendKudos;
import Resources.Base;

public class SearchCheck extends Base{
	
	@Test
	public void Searchkudoss() throws IOException, AWTException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
        SearchKudos sc = new SearchKudos(driver);
        sc.Clickusername().sendKeys("shivangowda.patil@qualitestgroup.com");
        sc.ClickPassword().sendKeys("P@ssw0rd");
		sc.ClickLogin().click();
        sc.kudoss().click();


		try {
			Thread.sleep(5000l);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		sc.kudSearch().sendKeys("shivangowda.patil@qualitestgroup.com");
		try {
			Thread.sleep(5000l);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		sc.searchbtn().click();

        driver.close();

		
	}	
	


}

