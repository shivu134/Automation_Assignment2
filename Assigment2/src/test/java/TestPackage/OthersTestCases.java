package TestPackage;

import org.testng.annotations.Test;

import PageObjects.Others;
import Resources.Base;

public class OthersTestCases extends Base{
	
	
	@Test
	public void otherskfm() throws Exception
	{
		Others o = new Others(driver);
		o.Kudosfmm().click();
	}


}
