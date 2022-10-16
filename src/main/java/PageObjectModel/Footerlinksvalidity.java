package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footerlinksvalidity {
public WebDriver driver;

	private By Linklist=By.xpath("//a[@class='_1arVWX']");
	
	
	public Footerlinksvalidity(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public List<WebElement> Links() {
		return driver.findElements(Linklist);
	}
	

}
