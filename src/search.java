import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class search {
	
	public WebDriver driver;
	
	@FindBy(how=How.ID, using="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(how=How.ID, using="nav-search-submit-text")
	WebElement click;
	
	@FindBy(how=How.XPATH, using="//*[@id='result_2']/div/div/div/div[1]/div/div/a/img")
	WebElement item;

	
	public search(WebDriver driver){
		
		this.driver = driver ;		
	}
	
	public void search_item() throws InterruptedException{
	
		searchbox.sendKeys("i phone 6");
		click.click();
		
		Actions action = new Actions(driver);
		action.moveToElement(item).perform();
		Thread.sleep(2000);
		item.click();
		
	}



}