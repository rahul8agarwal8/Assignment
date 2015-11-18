import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class addtocart {
	
	public WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[@id='bb_atc_button']")
	WebElement add;
	
	public addtocart(WebDriver driver){
		
		this.driver = driver ;		
	}
	
	public void add_item() throws InterruptedException{

		add.click();
		
	}
}	