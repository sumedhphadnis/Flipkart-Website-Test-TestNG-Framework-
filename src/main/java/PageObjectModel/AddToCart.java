package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	public WebDriver driver;

	
	private By SearchBar=By.xpath("//input[@title='Search for products, brands and more']");
	private By SearchButton=By.xpath("//button[@class='L0Z3Pu']");
	private By ProductList=By.xpath("//div[@class='_4rR01T']");
	private By ProductPriceoutsidecart=By.xpath("//div[@class='_30jeq3 _16Jk6d']");
	private By AddToCartbutton=By.xpath("(//li[@class='col col-6-12'])[1]");
	private By CartItemqty=By.xpath("(//div[@class='_2npqm0'])[1]");
	private By CartProductAmount=By.xpath("//div[@class='_1dqRvU']");
	private By CartProductName=By.xpath("//a[@class='_2Kn22P gBNbID']");
	private By ProductNameoutsidecart=By.xpath("(//div[@data-id='MOBGGG2YXGCNUHAW']//div[@class='_4rR01T'])");
	
	public AddToCart(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement searchbar() {
		return driver.findElement(SearchBar);
	}
	
	public WebElement searchbutton() {
		return driver.findElement(SearchButton);
	}
	
	public List<WebElement> productlist() {
		return driver.findElements(ProductList);
	}
	
	public WebElement productpriceoutsidecart() {
		return driver.findElement(ProductPriceoutsidecart);
	}
	
	public WebElement addtocartbutton() {
		return driver.findElement(AddToCartbutton);
	}
	
	public WebElement cartitemqty() {
		return driver.findElement(CartItemqty);
	}
	
	public WebElement cartproductamount() {
		return driver.findElement(CartProductAmount);
	}
	
	public WebElement cartproductname() {
		return driver.findElement(CartProductName);
	}
	
	public WebElement productnameoutsidecart() {
		return driver.findElement(ProductNameoutsidecart);
	}
}
