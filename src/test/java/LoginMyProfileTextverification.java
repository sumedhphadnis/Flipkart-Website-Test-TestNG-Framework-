import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.WarningandTextboxTextverification;
import Resources.Baseclass;
import Resources.commonutilities;
import Resources.testcasedata;



public class LoginMyProfileTextverification extends Baseclass {
	 @Test
     public void textverification() throws InterruptedException {
    	 
	
     WarningandTextboxTextverification wtv =new WarningandTextboxTextverification(driver);
     wtv.Crossbutton().click();
     
     //driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
     Actions action=new Actions(driver);
     WebElement Logindropdown=wtv.logindropdownbutton();
     //WebElement Logindropdown=driver.findElement(By.xpath("(//div[@class='_28p97w'])[1]"));
     System.out.println("Button text(dropdown) :"+Logindropdown.getText());
     action.moveToElement(Logindropdown).build().perform();
   	 WebElement submenu=wtv.myprofiledropdownbutton();
   	 //WebElement submenu=driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[1]"));
   	 System.out.println("Button text(dropdown) :"+submenu.getText());
    // action.moveToElement(submenu).click().build().perform();
     submenu.click();
     Thread.sleep(4000);
     wtv.loginbutton().click();
    //driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
     WebElement warningtext1=wtv.warningtext1();
     //WebElement warningtext1=driver.findElement(By.xpath("//span[@class='_2YULOR']"));
    
     
     //Button text1
     
     WebElement buttontext1=wtv.buttontext1();
     //WebElement buttontext1=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
     String Buttontext1=buttontext1.getText();
     System.out.println(Buttontext1);
     String actual6=buttontext1.getText();
     String expected6=testcasedata.expected6;
     //String expected6="Login";
     
   //Button text2
     WebElement buttontext2=wtv.buttontext2();
    //WebElement buttontext2=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']"));
     String Buttontext2=buttontext2.getText();
     System.out.println(Buttontext2);
     String actual7=buttontext2.getText();
     String expected7=testcasedata.expected7;
     //String expected7="Request OTP";
     
     
     
     //Link warning text1
     String actual = warningtext1.getText();
     System.out.println(actual);
     String expected = testcasedata.expected;
     //String expected = "Please enter valid Email ID/Mobile number";
     
      //Textbox text1 
     WebElement textboxtext1=wtv.textboxtext1();
    //WebElement textboxtext1=driver.findElement(By.xpath("(//label[@class='_1fqY3P'])[1]"));
     String actual3=textboxtext1.getText();
     System.out.println(actual3);
     String expected3=testcasedata.expected3;
     //String expected3="Enter Email/Mobile number";
     
     //Textbox text2
     WebElement textboxtext2=wtv.textboxtext2();
    //WebElement textboxtext2=driver.findElement(By.xpath("(//label[@class='_1fqY3P'])[2]"));
     String actual4=textboxtext2.getText();
     System.out.println(actual4);
     String expected4=testcasedata.expected4;
     //String expected4="Enter Password";
     
     
    //Link text1
     WebElement warningtext2=wtv.linktext1();
    //WebElement warningtext2=driver.findElement(By.xpath("//a[@class='_14Me7y']"));
     String Linktext1=warningtext2.getText();
     String actual1=Linktext1;
     System.out.println(actual1);
     String expected1=testcasedata.expected1;
     //String expected1="New to Flipkart? Create an account";
     
     
     wtv.linktext1().click();
     //driver.findElement(By.xpath("//a[@class='_14Me7y']")).click();
     wtv.continuebutton().click();
     //driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
     
     //Link warning text3
     WebElement warningtext3=wtv.warningText3();
     //WebElement warningtext3=driver.findElement(By.xpath("//span[@class='_2YULOR']"));
     String actual2= warningtext3.getText();
     System.out.println(actual2);
     String expected2=testcasedata.expected2;
     //String expected2="Please enter a valid Mobile number";
     
    
      //Textbox text3
     WebElement textboxtext3=wtv.textboxtext3();
     String actual5=textboxtext3.getText();
     System.out.println(actual5);
     String expected5=testcasedata.expected5;
     //String expected5="Enter Mobile number";
     
     
     //Button text3
     WebElement buttontext3=wtv.buttontext3();
    //WebElement buttontext3=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
     String actual8=buttontext3.getText();
     System.out.println(actual8);
     String expected8=testcasedata.expected8;
     //String expected8="CONTINUE";
     
     //Button text4
     WebElement buttontext4=wtv.buttontext4();
     //WebElement buttontext4=driver.findElement(By.xpath("//a[@class='_2KpZ6l _2HKlqd _3NgS1a']"));
     String actual9=buttontext4.getText();
     System.out.println(actual9);
     String expected9=testcasedata.expected9;
     //String expected9="Existing User? Log in";
   
     commonutilities.HandleAssertions(actual, expected, actual1, expected1, actual2, expected2, actual3, expected3, actual4, expected4, actual5, expected5, actual6, expected6, actual7, expected7, actual8, expected8, actual9, expected9);
 
     
     driver.quit();
}
}


