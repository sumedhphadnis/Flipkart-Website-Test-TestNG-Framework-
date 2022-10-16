package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoiginModuleDropelementsclickability {
	
	public WebDriver driver;

	private By elementlist1 =By.xpath("//a[@class='_2kxeIr _1pY_1Z']");
	
	
	public LoiginModuleDropelementsclickability(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public List<WebElement> List1() {
		return driver.findElements(elementlist1);
	}

}
