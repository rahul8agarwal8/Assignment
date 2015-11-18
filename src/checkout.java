import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class checkout {
	
	public WebDriver driver;
	
	@FindBy(how=How.ID, using="enterAddressFullName")
	WebElement full_name;
	
	@FindBy(how=How.XPATH, using="enterAddressAddressLine1")
	WebElement add1;
	
	@FindBy(how=How.ID, using="ap_customer_name")
	WebElement city;
	
	@FindBy(how=How.ID, using="enterAddressPostalCode")
	WebElement postal;
	
	@FindBy(how=How.ID, using="ap_password")
	WebElement phone;
	
	@FindBy(how=How.XPATH, using="//*[@id='newShippingAddressFormFromIdentity']/div[1]/div/form/div[7]/span/span/input")
	WebElement continue_click;


	public checkout(WebDriver driver){
		
		this.driver = driver ;		
	}
	
	public void check_out() throws InterruptedException{

		full_name.sendKeys("rahul");
		Thread.sleep(1000);
		add1.sendKeys("8-17 Tottenham Court Road");
		Thread.sleep(1000);
		city.sendKeys("London");
		Thread.sleep(1000);
		postal.sendKeys("W1T 1BQ");
		Thread.sleep(1000);
		phone.sendKeys("1234567890");
		Thread.sleep(1000);
		continue_click.click();
		
	}
}	
