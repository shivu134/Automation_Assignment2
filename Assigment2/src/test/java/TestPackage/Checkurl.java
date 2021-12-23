package TestPackage;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import Resources.Base;

public class Checkurl extends Base{
	
	
	@Test
	public void basePageNavigation() throws IOException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	public void basePageNavi() throws IOException{

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://qtrecognition.testqtwiz.com/" );
		log.info("URL entered correct");
	}

}
