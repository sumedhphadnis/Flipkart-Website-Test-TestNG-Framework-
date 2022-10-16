import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.AddToCart;
import PageObjectModel.WarningandTextboxTextverification;
import Resources.Baseclass;
import Resources.commonutilities1;
import Resources.testcasedata;

public class addtocartfunction extends Baseclass {
	@Test
	public void Addtocart() throws InterruptedException {
		
		WarningandTextboxTextverification wtv =new WarningandTextboxTextverification(driver);
	     wtv.Crossbutton().click();
	     AddToCart atc=new AddToCart(driver);
	     atc.searchbar().sendKeys(testcasedata.searchbardata);
	     
	     atc.searchbutton().click();
	     
	     Thread.sleep(5000);
	     String productnameoutsidecart=atc.productnameoutsidecart().getText();
	     System.out.println("Product name outside the cart is :"+" "+productnameoutsidecart);
	     
	     Thread.sleep(5000);
	     List<WebElement> a=atc.productlist();
	     
	     for (WebElement list:a ) {
	    	 if (list.getText().equalsIgnoreCase(testcasedata.productname)) {
	    		 list.click();
	    	 }
	     }
	     
	  
	 
	    Set<String> obj = driver.getWindowHandles();
	    Iterator<String> it=obj.iterator();
	    String tab1=it.next();
	    String tab2=it.next();
	    driver.switchTo().window(tab2);
	    Thread.sleep(5000);
	    
	     String productpriceoutsidecart=atc.productpriceoutsidecart().getText();
	 
	     System.out.println("Product price outside the cart is :"+" "+productpriceoutsidecart);
	     
	     atc.addtocartbutton().click();
	     
	     
	     Thread.sleep(5000);
	     String expecteditemqty="Price (1 item)";
	     System.out.println(expecteditemqty);
	     
	     String actualitemqty=atc.cartitemqty().getText();
	     
	     System.out.println(actualitemqty);
	     
	     Thread.sleep(5000);
	    
	     String actualcartamount=atc.cartproductamount().getText();
	    
	     System.out.println("Product price inside the cart is :"+" "+actualcartamount);
  
	     String cartproductname=atc.cartproductname().getText();
	     System.out.println("Product name inside the cart is :"+" "+cartproductname);
	
	     commonutilities1.HandleAssertions1(actualcartamount, productpriceoutsidecart, actualitemqty, expecteditemqty, cartproductname, productnameoutsidecart);
	     
	     driver.quit();
	}

}
