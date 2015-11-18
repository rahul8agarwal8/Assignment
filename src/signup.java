import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class signup {
		
		public WebDriver driver;
		
		@FindBy(how=How.ID, using="ap_email")
		WebElement email;
		
		@FindBy(how=How.XPATH, using="//*[@id='ap_signin_create_radio']")
		WebElement new_cust;
		
		@FindBy(how=How.XPATH, using="//*[@id='signInSubmit-input']")
		WebElement signup;
		
		@FindBy(how=How.ID, using="ap_customer_name")
		WebElement name;
		
		@FindBy(how=How.ID, using="ap_email_check")
		WebElement mail_chk;
		
		@FindBy(how=How.ID, using="ap_password")
		WebElement pswd;
		
		@FindBy(how=How.ID, using="ap_password_check")
		WebElement pswd_chk;
		
		@FindBy(how=How.ID, using="continue-input")
		WebElement cont_input;
		
		public signup(WebDriver driver){
			
			this.driver = driver ;		
		}
		
		public void sign_up() throws InterruptedException{

			email.sendKeys("iphone123qw@xyz.com");
			Thread.sleep(1000);
			
			new_cust.click();
			Thread.sleep(1000);
			
			signup.click();
			Thread.sleep(3000);
			
			name.sendKeys("rahul");
			Thread.sleep(1000);
			mail_chk.sendKeys("iphone123qw@xyz.com");
			Thread.sleep(1000);
			pswd.sendKeys("buy_iphone6");
			Thread.sleep(1000);
			pswd_chk.sendKeys("buy_iphone6");
			
			Thread.sleep(1000);
			cont_input.click();
			
		}
	}	