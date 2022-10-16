import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.Footerlinksvalidity;
import Resources.Baseclass;

public class MainPagefooterlinksvalidity extends Baseclass {
	@Test
	public void FooterLinksvalidity () throws MalformedURLException, IOException {
	
		Footerlinksvalidity flv=new Footerlinksvalidity(driver);
		
		List<WebElement> links=flv.Links();
		
		System.out.println("Number Of Footer links:"+" "+links.size());
	
	//List<WebElement> links=driver.findElements(By.xpath("//a[@class='_1arVWX']"));
	
	SoftAssert a =new SoftAssert(); 
	
	

    for(WebElement link : links)
    {
        String url= link.getAttribute("href");
        HttpURLConnection  conn= (HttpURLConnection)new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int respCode = conn.getResponseCode();
        System.out.println(respCode);
       a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
    }
   a.assertAll();
   
   driver.quit();

}
}
