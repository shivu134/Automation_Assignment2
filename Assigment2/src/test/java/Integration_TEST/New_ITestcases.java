package Integration_TEST;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Integration.New_IT;
import Resources.Base;

public class New_ITestcases extends Base{
	
	
    @BeforeClass
	
	public void findurl() throws Exception {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
    
    @BeforeMethod
    
	public void fin() {
		 New_IT nt = new New_IT(driver);
	        nt.Clickusername().sendKeys("lavanya.channabasavachari@qualitestgroup.com");
	        nt.ClickPassword().sendKeys("P@ssw0rd");
			nt.ClickLogin().click();
	}
	
	@Test
	public void SendKudosIT() throws AWTException{
		
		New_IT n = new New_IT(driver);
        n.SendKudosq().click();
        n.SearchK().sendKeys("Aishwarya Matada");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        
        try {
			Thread.sleep(5000l);
		}
		catch(Exception e){
				e.printStackTrace();
			}
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        
       
    n.Taketab().click();
    try {
		Thread.sleep(5000l);
	}
	catch(Exception e){
			e.printStackTrace();
		}
    n.Comments().sendKeys("Hard Worker");
    try {
		Thread.sleep(5000l);
	}
	catch(Exception e){
			e.printStackTrace();
		}
	n.Submit().click();
	try {
		Thread.sleep(3000l);
	}
	catch(Exception e){
			e.printStackTrace();
		}
	log.info("Kudos sent");
	
	n.closebtn().click();

  }
	/*@Test
	public void cancel() throws Exception
	{
		SendKudos s = new SendKudos(driver);
        s.Cancel().click();
        try {
			Thread.sleep(5000l);
		}
		catch(Exception e){
				e.printStackTrace();
			}
		driver.close();


	}*/
	
	
	@AfterClass
	
	public void submitt() {
		driver.close();	
	}
	
}
