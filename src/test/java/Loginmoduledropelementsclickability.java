import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoiginModuleDropelementsclickability;
import PageObjectModel.WarningandTextboxTextverification;
import Resources.Baseclass;
import Resources.testcasedata3;

public class Loginmoduledropelementsclickability extends Baseclass{
	@Test
	public void logindropelementsclickability() throws InterruptedException {
		
		  WarningandTextboxTextverification wtv =new WarningandTextboxTextverification(driver);
		     wtv.Crossbutton().click();
		     
		     LoiginModuleDropelementsclickability lmc=new LoiginModuleDropelementsclickability (driver);
		     Actions action=new Actions(driver);
		     
		     WebElement Logindropdown1=wtv.logindropdownbutton();
		     action.moveToElement(Logindropdown1).build().perform();
	        List<WebElement> elementlist1=lmc.List1();
		    //List<WebElement> elementlist1=driver.findElements(By.xpath("//a[@class='_2kxeIr _1pY_1Z']")); 
		    System.out.println("This Login module dropdown contains"+" "+elementlist1.size()+" "+"elements");
		    SoftAssert assertion=new SoftAssert();
		    
		    for (WebElement a:elementlist1) {
		    	 
		    	 if (a.getText().equalsIgnoreCase(testcasedata3.elementtext1)) {
		    		 System.out.println(a.getText());
		    		 a.click();
		    		 String actualelement1url=driver.getCurrentUrl();
		    		 System.out.println(actualelement1url);
		    		 String expectedelement1url=testcasedata3.elementurl1;
		    		 assertion.assertEquals(actualelement1url,expectedelement1url);
		    		 
		    	 break;}
		    }
    
	    	 
			     action.moveToElement(Logindropdown1).build().perform();
			     
			     List<WebElement> elementlist2=lmc.List1();
			     //List<WebElement> elementlist2=driver.findElements(By.xpath("//a[@class='_2kxeIr _1pY_1Z']")); 
				  
			     for (WebElement b:elementlist2) {
			     if (b.getText().equalsIgnoreCase(testcasedata3.elementtext2)) {
			    	 System.out.println(b.getText());
		    		 b.click();
		    		 String actualelement2url=driver.getCurrentUrl();
		    		 System.out.println(actualelement2url);
		    		 String expectedelement2url=testcasedata3.elementurl2;
		    		 assertion.assertEquals(actualelement2url,expectedelement2url);
		    		 
		    	 break;}
			     
			    }
			 
			     
			     action.moveToElement(Logindropdown1).build().perform();
			     List<WebElement> elementlist3=lmc.List1();
			    // List<WebElement> elementlist3=driver.findElements(By.xpath("//a[@class='_2kxeIr _1pY_1Z']")); 
				  
			     for (WebElement c:elementlist3) {
			     
			     if (c.getText().equalsIgnoreCase(testcasedata3.elementtext3)) {
			    	 System.out.println(c.getText());
		    		 c.click();
		    		 String actualelement3url=driver.getCurrentUrl();
		    		 System.out.println(actualelement3url);
		    		 String expectedelement3url=testcasedata3.elementurl3;
		    		 assertion.assertEquals(actualelement3url,expectedelement3url);
		    	 break;}
	    	 
		    }
			    
			     action.moveToElement(Logindropdown1).build().perform();
			     List<WebElement> elementlist4=lmc.List1(); 
			     //List<WebElement> elementlist4=driver.findElements(By.xpath("//a[@class='_2kxeIr _1pY_1Z']")); 
				  
			     for (WebElement d:elementlist4) {
			     
			     if (d.getText().equalsIgnoreCase(testcasedata3.elementtext4)) {
			    	 System.out.println(d.getText());
		    		 d.click();
		    		 String actualelement4url=driver.getCurrentUrl();
		    		 System.out.println(actualelement4url);
		    		 String expectedelement4url=testcasedata3.elementurl4;
		    		 assertion.assertEquals(actualelement4url,expectedelement4url);
		    	 break;}
			     
			     }
			     
			     
			     action.moveToElement(Logindropdown1).build().perform();
			     List<WebElement> elementlist5=lmc.List1();
			     //List<WebElement> elementlist5=driver.findElements(By.xpath("//a[@class='_2kxeIr _1pY_1Z']")); 
				  
			     for (WebElement e:elementlist5) {
			     
			     if (e.getText().equalsIgnoreCase(testcasedata3.elementtext5)) {
			    	 System.out.println(e.getText());
		    		 e.click();
		    		 String actualelement5url=driver.getCurrentUrl();
		    		 System.out.println(actualelement5url);
		    		 String expectedelement5url=testcasedata3.elementurl5;
		    		 assertion.assertEquals(actualelement5url,expectedelement5url);
		    	 break;}
			  
			     }
			     

			     action.moveToElement(Logindropdown1).build().perform();
			     List<WebElement> elementlist6=lmc.List1();
			     //List<WebElement> elementlist6=driver.findElements(By.xpath("//a[@class='_2kxeIr _1pY_1Z']")); 
				  
			     for (WebElement f:elementlist6) {
			     
			     if (f.getText().equalsIgnoreCase(testcasedata3.elementtext6)) {
			    	 System.out.println(f.getText());
		    		 f.click();
		    		 String actualelement6url=driver.getCurrentUrl();
		    		 System.out.println(actualelement6url);
		    		 String expectedelement6url=testcasedata3.elementurl6;
		    		 assertion.assertEquals(actualelement6url,expectedelement6url);
		    	 break;}
			     
			     }    
			     assertion.assertAll();
			     
			     driver.quit();
	}

}

