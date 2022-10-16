import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.MoreDropDowntextverificationandClickability;
import PageObjectModel.WarningandTextboxTextverification;
import Resources.Baseclass;
import Resources.commonutilities2;
import Resources.testcasedata;

public class Moredropmoduletextverificationandclickability extends Baseclass {
	@Test
	public void textverification() throws InterruptedException {
	WarningandTextboxTextverification wtv =new WarningandTextboxTextverification(driver);
    wtv.Crossbutton().click();
    Actions actions=new Actions (driver);
    
    MoreDropDowntextverificationandClickability mdt=new MoreDropDowntextverificationandClickability(driver);
    
    WebElement droptoggle=mdt.dropdowntoggle();
   
    actions.moveToElement(droptoggle).build().perform();
    
    List<WebElement> list=mdt.commondropdown();
   
    for (WebElement k:list) {
    	System.out.println(k.getText());
    }
    System.out.println("This dropdown list contains"+" "+list.size()+" "+"modules");
    
    String actual1=mdt.moredropdownactual1().getText();
    String expected1=testcasedata.Moredropdownexpected1;
    mdt.moredropdownactual1().click();
    String actualurl1=driver.getCurrentUrl();
    System.out.println(actualurl1);
    String expectedurl1=testcasedata.url1;
    
    Thread.sleep(3000);
    actions.moveToElement(droptoggle).build().perform();
    
    String actual2=mdt.moredropdownactual2().getText();
    mdt.moredropdownactual2().click();
    String expected2=testcasedata.Moredropdownexpected2;
    String actualurl2=driver.getCurrentUrl();
    System.out.println(actualurl2);
    String expectedurl2=testcasedata.url2;
    
    
    Thread.sleep(3000);
    actions.moveToElement(droptoggle).build().perform();
    
    
    String actual3=mdt.moredropdownactual3().getText();
    mdt.moredropdownactual3().click();
    String expected3=testcasedata.Moredropdownexpected3;
    String actualurl3=driver.getCurrentUrl();
    System.out.println(actualurl3);
    String expectedurl3=testcasedata.url3;
  
    Thread.sleep(4000);
    driver.navigate().back();
    Thread.sleep(4000);
    WebElement droptogglerelocate=mdt.dropdowntoggle();
    
    actions.moveToElement(droptogglerelocate).build().perform();
    
    String actual4=mdt.moredropdownactual4().getText();
    mdt.moredropdownactual4().click();
    String expected4=testcasedata.Moredropdownexpected4;
    String actualurl4=driver.getCurrentUrl();
    System.out.println(actualurl4);
    String expectedurl4=testcasedata.url4;
    
    
    commonutilities2.HandleAssertions2(actual1, expected1, actual2, expected2, actual3, expected3, actual4, expected4, actualurl1, expectedurl1,actualurl2, expectedurl2,actualurl3, expectedurl3,actualurl4, expectedurl4);
    
    driver.quit();
   
}
}