package TestPackage;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import Resources.Base;

public class CheckTitle extends Base {
	
	@Test
	public void VerifyTitle() throws IOException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "QTRecognition");
		log.info("Title is checked was correct");

	}	
	
	

}
