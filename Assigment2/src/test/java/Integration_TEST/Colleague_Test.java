package Integration_TEST;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Integration.Colleague_SK;
import Integration.New_IT;
import PageObjects.RecentContact;
import Resources.Base;

public class Colleague_Test extends Base{
	
   @BeforeClass
	
	public void findurl() throws Exception {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
   
   @BeforeMethod
   
   public void fin() {
		    
	   RecentContact rc = new RecentContact(driver);
	   rc.Clickusername().sendKeys("lavanya.channabasavachari@qualitestgroup.com");
	   rc.ClickPassword().sendKeys("P@ssw0rd");
       rc.ClickLogin().click();
	}
	
	
	@Test
	public void SendKudosColleague() throws Exception{
		
		 Colleague_SK rc = new Colleague_SK(driver);
         rc.clickRc().click();
         rc.Taketab().click();
    try {
		Thread.sleep(5000l);
	}
	catch(Exception e){
			e.printStackTrace();
		}
    rc.Comments().sendKeys("Hard Worker");
    try {
		Thread.sleep(5000l);
	}
	catch(Exception e){
			e.printStackTrace();
		}
	rc.Submit().click();
	 try {
			Thread.sleep(2000l);
		}
		catch(Exception e){
				e.printStackTrace();
			}
	  log.info("Appreciation by sending kudos for resolving the new laptop issues");

      rc.closebtn().click();

  }
	
    @AfterClass
	
	public void submitt() {
		driver.close();
		
  }
	
	/*@Test
	public void cancelf() throws Exception
	{
		SendKudos s = new SendKudos(driver);
        s.Cancel().click();
        try {
			Thread.sleep(5000l);
		}
		catch(Exception e){
				e.printStackTrace();
			}


	}*/
	
}