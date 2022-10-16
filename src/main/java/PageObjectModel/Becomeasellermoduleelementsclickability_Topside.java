package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Becomeasellermoduleelementsclickability_Topside {
public WebDriver driver;

	
	private By HeaderMainList=By.xpath("//div[@class='go_DOp']");
	private By Module1Path=By.xpath("//ul[@class='styles__OptionItems-rbc3lh-3 dVenYm']//a[@href='/sell-online/pricing']");
	private By Module2Path=By.xpath("//ul[@class='styles__OptionItems-rbc3lh-3 dVenYm']//a[@href='/sell-online/services-0']");
	private By Module3Path=By.xpath("//ul[@class='styles__OptionItems-rbc3lh-3 dVenYm']//a[@href='/sell-online/resources']");
	private By Module4Path=By.xpath("//ul[@class='styles__OptionItems-rbc3lh-3 dVenYm']//a[@href='/sell-online/faq']");
	private By Module5Path=By.xpath("//ul[@class='styles__OptionItems-rbc3lh-3 dVenYm']//a[@href='/sell-online/shopsy']");
	private By Module6Path=By.xpath("//div[@class='styles__LoginSection-rbc3lh-4 dxHhvv']//button[@class='styles__RegisterButton-sc-1kfv72o-1 PPqje']");
	private By Module7PopUpPath=By.xpath("//div[@class='style__ElementWrapper-sc-14dgp1v-0 gfQYRd wrapper form-modal']//span[@class='styles__FormLabel-fj5lxd-2 jJEzek']");
	private By Module7Path=By.xpath("//div[@class='styles__LoginContainer-rbc3lh-5 ehOdEi']");
	
	
	
	
	public Becomeasellermoduleelementsclickability_Topside(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public List<WebElement> headermainlinklist() {
		return driver.findElements(HeaderMainList);
	}
	
	public WebElement module1_path() {
		return driver.findElement(Module1Path);
	}
	
	public WebElement module2_path() {
		return driver.findElement(Module2Path);
	}
	
	public WebElement module3_path() {
		return driver.findElement(Module3Path);
	}
	
	public WebElement module4_path() {
		return driver.findElement(Module4Path);
	}
	
	public WebElement module5_path() {
		return driver.findElement(Module5Path);
	}
	
	public WebElement module6_path() {
		return driver.findElement(Module6Path);
	}
	
	public WebElement module7_popuppath() {
		return driver.findElement(Module7PopUpPath);
	}
	
	public WebElement module7_path() {
		return driver.findElement(Module7Path);
	}
	

}
