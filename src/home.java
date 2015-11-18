import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class home {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("https://www.amazon.co.uk/");	

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		search sa = PageFactory.initElements(driver, search.class);
		sa.search_item();
				
		Thread.sleep(2000);
		addtocart ac= PageFactory.initElements(driver, addtocart.class);
		ac.add_item();
		
		Thread.sleep(2000);
		editbasket eb= PageFactory.initElements(driver, editbasket.class);
		eb.edit_item();
		
		Thread.sleep(2000);
		signup su= PageFactory.initElements(driver, signup.class);
		su.sign_up();

		Thread.sleep(2000);
		checkout ck= PageFactory.initElements(driver, checkout.class);
		ck.check_out();
		
		Thread.sleep(3000);
		driver.quit();
	}
}