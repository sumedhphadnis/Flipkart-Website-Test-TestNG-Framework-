package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WarningandTextboxTextverification {
	public WebDriver driver;
	private By crossbutton=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	private By Logindropdownbutton=By.xpath("(//div[@class='_28p97w'])[1]");
	private By MyProfiledropdownbutton=By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[1]");
	private By LoginButton=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	private By WarningText1=By.xpath("//span[@class='_2YULOR']");
	private By ButtonText1=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	private By ButtonText2=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']");
	private By Textboxtext1 =By.xpath("(//label[@class='_1fqY3P'])[1]");
	private By Textboxtext2 =By.xpath("(//label[@class='_1fqY3P'])[2]");
	private By Textboxtext3 =By.xpath("//label[@class='_1fqY3P']");
	
	private By LinkText1 =By.xpath("//a[@class='_14Me7y']");
	private By ContinueButton =By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	private By WarningText3 =By.xpath("//span[@class='_2YULOR']");
	private By ButtonText3=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	private By ButtonText4=By.xpath("//a[@class='_2KpZ6l _2HKlqd _3NgS1a']");
	
	public WarningandTextboxTextverification(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement Crossbutton() {
		return driver.findElement(crossbutton);
	}
	public WebElement logindropdownbutton() {
		return driver.findElement(Logindropdownbutton);
	}

	public WebElement myprofiledropdownbutton() {
		return driver.findElement(MyProfiledropdownbutton);
	}
	
	public WebElement loginbutton() {
		return driver.findElement(LoginButton);
	}

	public WebElement warningtext1() {
		return driver.findElement(WarningText1);
	}
	
	public WebElement buttontext1() {
		return driver.findElement(ButtonText1);
	}
	
	public WebElement buttontext2() {
		return driver.findElement(ButtonText2);
	}
	
	public WebElement textboxtext1() {
		return driver.findElement(Textboxtext1);
	}
	
	public WebElement textboxtext2() {
		return driver.findElement(Textboxtext2);
	}
	
	public WebElement linktext1() {
		return driver.findElement(LinkText1);
	}
	
	public WebElement continuebutton() {
		return driver.findElement(ContinueButton);
	}
	
	public WebElement warningText3() {
		return driver.findElement(WarningText3);
	}
	
	public WebElement buttontext3() {
		return driver.findElement(ButtonText3);
	}
	
	public WebElement buttontext4() {
		return driver.findElement(ButtonText4);
	}
	
	public WebElement textboxtext3() {
		return driver.findElement(Textboxtext3);
	}


}


