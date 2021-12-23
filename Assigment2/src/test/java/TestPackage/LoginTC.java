package TestPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;

public class LoginTC extends Base {
	
	
	
    @Test(dataProvider = "getData")
	public void basePageNavigation(String Username, String Password) throws IOException{
    		driver = initializeDriver();
    		driver.get(prop.getProperty("url"));
    		driver.manage().window().maximize();
		
		LoginPage l = new LoginPage(driver);
        l.Clickusername().sendKeys(Username);
        l.ClickPassword().sendKeys(Password);
		l.ClickLogin().click();
	    Assert.assertEquals(driver.getCurrentUrl(), "https://qtrecognition.testqtwiz.com/Activity.php");	
	    File rc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(rc, new File("C:\\Users\\Qualitest\\Documents\\Assessment\\Defect_Screenshot\\Login1.png")); 
	   
        driver.close();

	}
	
 @DataProvider

public Object[][] getData() throws Exception
{
	Object[][] data = new Object[3][2];
	
	data[0][0] = "shivangowda.patil@qualitestgroup.com";
	data[0][1] = "P@ssw0rd";
	log.info("Login Successfully");
	
    
	data[1][0] = " lavbn.wdpmm@qualitestgroup.com  ";
	data[1][1] = " P@ssw0rd  ";
	log.error("Unsuccessful Login");
	
		
    
	
	data[2][0] = " ";
	data[2][1] = " ";
	log.error("Unsuccessful Login");
	

	
	return data;
  }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


















 


