import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class editbasket {
	
	public WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[@id='hlb-view-cart-announce']")
	WebElement edit;
	
	@FindBy(how=How.XPATH, using="//*[@id='a-autoid-2-announce']")
	WebElement qty;
	
	@FindBy(how=How.XPATH, using="//*[@id='dropdown1_2']")
	WebElement newqty;
		
	@FindBy(how=How.ID, using="sc-buy-box-ptc-button-announce")
	WebElement proceed;
	
	public editbasket(WebDriver driver){
		
		this.driver = driver ;		
	}
	
	public void edit_item() throws InterruptedException{

		edit.click();
		Thread.sleep(3000);
		
		qty.click();
		Thread.sleep(1000);
		
		newqty.click();
		Thread.sleep(1000);
		
		proceed.click();
		
	}
}	