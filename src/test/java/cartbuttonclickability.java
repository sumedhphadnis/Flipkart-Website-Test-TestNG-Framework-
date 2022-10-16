import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.Becomeasellermoduleelementsclickability_Topside;

import PageObjectModel.WarningandTextboxTextverification;
import Resources.Baseclass;
import Resources.testcasedata1;
import Resources.testcasedata4;

public class cartbuttonclickability extends Baseclass {
	
	@Test
	public void CartbuttonClickability() throws InterruptedException {
		
		
		WarningandTextboxTextverification wtv =new WarningandTextboxTextverification(driver);
	     wtv.Crossbutton().click();
	     
	     
  Becomeasellermoduleelementsclickability_Topside bsc=new Becomeasellermoduleelementsclickability_Topside(driver);
	     
	     List<WebElement> list=bsc.headermainlinklist();
	  
	    for (WebElement a:list ) {
	    	if(a.getText().equalsIgnoreCase(testcasedata4.buttontext1)) {
	    		a.click();
	    		break;
	    	}
	    }
	     
	     
	    /* CartButtonClickability cbc=new CartButtonClickability(driver);
	     cbc.cartbutton().click();
	     */
	     
	    
	     Thread.sleep(2000);
	     String actualurl=driver.getCurrentUrl();
	     System.out.println(actualurl);
	     String expectedurl=testcasedata4.elementurl1;
	     
	     SoftAssert assertion=new SoftAssert();
	     assertion.assertEquals(actualurl, expectedurl);
	     assertion.assertAll();
	     
	     
	     driver.quit();
	}

}
