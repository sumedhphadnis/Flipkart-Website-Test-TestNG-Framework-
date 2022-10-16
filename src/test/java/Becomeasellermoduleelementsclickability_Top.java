import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.Becomeasellermoduleelementsclickability_Topside;
import PageObjectModel.WarningandTextboxTextverification;
import Resources.Baseclass;
import Resources.commonutilities3;
import Resources.testcasedata1;

public class Becomeasellermoduleelementsclickability_Top extends Baseclass{
	@Test
	public void buttonclickability() throws InterruptedException {
		
		WarningandTextboxTextverification wtv =new WarningandTextboxTextverification(driver);
	     wtv.Crossbutton().click();
	     
	     
	     Becomeasellermoduleelementsclickability_Topside bsc=new Becomeasellermoduleelementsclickability_Topside(driver);
	     
	     List<WebElement> list=bsc.headermainlinklist();
	  
	    for (WebElement a:list ) {
	    	if(a.getText().equalsIgnoreCase(testcasedata1.linkbutton1)) {
	    		a.click();
	    		break;
	    	}
	    }
	    String actualpagetitle=driver.getTitle();
	    System.out.println(actualpagetitle);
	    String expectedpagetitle=testcasedata1.expectedpagetitle;
	    
	    Thread.sleep(4000);
	    WebElement module1=bsc.module1_path();
	    //WebElement module1=driver.findElement(By.xpath("//ul[@class='styles__OptionItems-rbc3lh-3 dVenYm']//a[@href='/sell-online/pricing']"));
	    String actualmodule1text=module1.getText();
	    String expectedmodule1text=testcasedata1.module1text;
	    
	    module1.click();
	    
	    String actualmodule1url=driver.getCurrentUrl();
	    System.out.println(actualmodule1url);
	    String expectedmodule1url=testcasedata1.expectedmodule1url;
	    
	    Thread.sleep(4000);
	    
	    WebElement module2=bsc.module2_path();
	    //WebElement module2=driver.findElement(By.xpath("//ul[@class='styles__OptionItems-rbc3lh-3 dVenYm']//a[@href='/sell-online/services-0']"));
	    String actualmodule2text=module2.getText();
	    String expectedmodule2text=testcasedata1.module2text;
	    
	    module2.click();
	    Thread.sleep(4000);
	    String actualmodule2url=driver.getCurrentUrl();
	    System.out.println(actualmodule2url);
	    String expectedmodule2url=testcasedata1.expectedmodule2url;
	    
	    Thread.sleep(4000);
	    
	    WebElement module3=bsc.module3_path();
	    //WebElement module3=driver.findElement(By.xpath("//ul[@class='styles__OptionItems-rbc3lh-3 dVenYm']//a[@href='/sell-online/resources']"));
	    String actualmodule3text=module3.getText();
	    String expectedmodule3text=testcasedata1.module3text;
	    
	    module3.click();
	    Thread.sleep(4000);
	    String actualmodule3url=driver.getCurrentUrl();
	    System.out.println(actualmodule3url);
	    String expectedmodule3url=testcasedata1.expectedmodule3url;
	    
	     Thread.sleep(4000);
	     
	     WebElement module4=bsc.module4_path();
	     //WebElement module4=driver.findElement(By.xpath("//ul[@class='styles__OptionItems-rbc3lh-3 dVenYm']//a[@href='/sell-online/faq']"));
		 String actualmodule4text=module4.getText();
		 String expectedmodule4text=testcasedata1.module4text;
		    
		 module4.click();
		 Thread.sleep(4000);
		 String actualmodule4url=driver.getCurrentUrl();
		 System.out.println(actualmodule4url);
		 String expectedmodule4url=testcasedata1.expectedmodule4url;
		 
		 Thread.sleep(4000);
		 
		  WebElement module5=bsc.module5_path();
		 // WebElement module5=driver.findElement(By.xpath("//ul[@class='styles__OptionItems-rbc3lh-3 dVenYm']//a[@href='/sell-online/shopsy']"));
			 String actualmodule5text=module5.getText();
			 String expectedmodule5text=testcasedata1.module5text;
		 
		    module5.click();
		     Thread.sleep(4000);
			 String actualmodule5url=driver.getCurrentUrl();
			 System.out.println(actualmodule5url);
			 String expectedmodule5url=testcasedata1.expectedmodule5url;
		    
			 
		    Thread.sleep(4000);
		    
		     WebElement module6=bsc.module6_path();
		    // WebElement module6=driver.findElement(By.xpath("//div[@class='styles__LoginSection-rbc3lh-4 dxHhvv']//button[@class='styles__RegisterButton-sc-1kfv72o-1 PPqje']"));
			 String actualmodule6text=module6.getText();
			 String expectedmodule6text=testcasedata1.module6text;
			 
			 module6.click();
			 Thread.sleep(4000);
			 String actualmodule6url=driver.getCurrentUrl();
			 System.out.println(actualmodule6url);
			 String expectedmodule6url=testcasedata1.expectedmodule6url;
			 
			 driver.navigate().back();
			 
			 WebElement module7=bsc.module7_path();
			 //WebElement module7=driver.findElement(By.xpath("//div[@class='styles__LoginContainer-rbc3lh-5 ehOdEi']"));
			 String actualmodule7text=module7.getText();
			 String expectedmodule7text=testcasedata1.module7text;
			 
			 module7.click();
			 Thread.sleep(4000);
			 
			 WebElement module7popup=bsc.module7_popuppath();
			 //WebElement module7popup=driver.findElement(By.xpath("//div[@class='style__ElementWrapper-sc-14dgp1v-0 gfQYRd wrapper form-modal']//span[@class='styles__FormLabel-fj5lxd-2 jJEzek']"));
			 String actualmodule7popupwindowtitle=module7popup.getText();
			 System.out.println(actualmodule7popupwindowtitle);
			 String expectedmodule7popupwindowtitle=testcasedata1.module7windowtitle;
	 
			 commonutilities3.HandleAssertions3(actualpagetitle, expectedpagetitle, actualmodule1text, expectedmodule1text, actualmodule1url, expectedmodule1url, actualmodule2text, expectedmodule2text, actualmodule2url, expectedmodule2url, actualmodule3text, expectedmodule3text, actualmodule3url, expectedmodule3url, actualmodule4text, expectedmodule4text, actualmodule4url, expectedmodule4url, actualmodule5text, expectedmodule5text, actualmodule5url, expectedmodule5url, actualmodule6text, expectedmodule6text, actualmodule6url, expectedmodule6url, actualmodule7text, expectedmodule7text, actualmodule7popupwindowtitle, expectedmodule7popupwindowtitle);
	
			 
			 driver.quit();
	}

}
