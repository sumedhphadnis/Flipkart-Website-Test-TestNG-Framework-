package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoreDropDowntextverificationandClickability {
public WebDriver driver;

	
	private By Dropdowntoggle=By.xpath("//div[@class='go_DOp']//div[@class='_28p97w']");
	private By CommonDropdown=By.xpath("//a[@class='_2kxeIr']");
	private By Moredropdownactual1=By.xpath("(//a[@class='_2kxeIr'])[1]");
	private By Moredropdownactual2=By.xpath("(//a[@class='_2kxeIr'])[2]");
	private By Moredropdownactual3=By.xpath("(//a[@class='_2kxeIr'])[3]");
	private By Moredropdownactual4=By.xpath("(//a[@class='_2kxeIr'])[4]");
	
	
	
	
	public MoreDropDowntextverificationandClickability(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement dropdowntoggle() {
		return driver.findElement(Dropdowntoggle);
	}
	
	public List<WebElement> commondropdown() {
		return driver.findElements(CommonDropdown);
	}
	
	public WebElement moredropdownactual1() {
		return driver.findElement(Moredropdownactual1);
	}
	public WebElement moredropdownactual2() {
		return driver.findElement(Moredropdownactual2);
	}
	public WebElement moredropdownactual3() {
		return driver.findElement(Moredropdownactual3);
	}
	
	public WebElement moredropdownactual4() {
		return driver.findElement(Moredropdownactual4);
	}


}
