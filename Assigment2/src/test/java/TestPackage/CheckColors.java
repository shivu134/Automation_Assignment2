package TestPackage;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.ColorCode;
import Resources.Base;
import junit.framework.Assert;

public class CheckColors extends Base
{
   

	@BeforeMethod
    public void initialfield() throws Exception {
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
    }
	
	
	@AfterClass
	public void exitfield() {
		
		driver.close();
	}
	
	
    
    @Test
	public void goldin() throws Exception 
	{
    	
		ColorCode cc = new ColorCode(driver);
		String color1 =Color.fromString(cc.gold().getCssValue("background-color")).asHex();
		if(color1.equals("#FECC160")) {
			log.info("pass");
		}
		else {
		File rc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(rc, new File("C:\\Users\\Qualitest\\Documents\\Assessment\\Defect_Screenshot\\Goldcolor.png")); 
		log.error("failed"+color1);
		}
        
		Assert.assertEquals(color1, "#FECC160");

		
	}
    
    @Test
    public void navyin() throws Exception {
    	ColorCode cc = new ColorCode(driver);
		String color2 = Color.fromString(cc.navy().getCssValue("background-color")).asHex();
		if(color2.equals("#2A2559")) {
			log.info("pass");
		}
		else {
		File rc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(rc, new File("C:\\Users\\Qualitest\\Documents\\Assessment\\Defect_Screenshot\\Navycolor.png")); 
		log.error("failed"+color2);
		}
		
		Assert.assertEquals(color2, "#2A2559");

    	
    }
    @Test
    public void whitein() throws Exception {
    	ColorCode cc = new ColorCode(driver);
		String color3 = Color.fromString(cc.white().getCssValue("background-color")).asHex();
		
		if(color3.equals("#939598")) {
			log.info("pass");
		}
		else {
		File rc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(rc, new File("C:\\Users\\Qualitest\\Documents\\Assessment\\Defect_Screenshot\\Whitecolor.png")); 
		log.error("failed"+color3);
		
		}
        
		Assert.assertEquals(color3, "#939598");
		
    }
	}
	

	

