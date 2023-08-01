package hrmstepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMdefination {
WebDriver driver;
@Given("hrm url is given")
public void hrm_url_is_given() {
		
		
				driver = new ChromeDriver();
				//driver.get("https://www.facebook.com/");
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				
				// Want to maximize window => manage window size
				driver.manage().window().maximize();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
				
		    
		
	    
@When("user enters {string} And user enters {string}")
public void user_enters_and_user_enters(String uname, String pwd) {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(pwd); 
		//
		
		
		
	}

	@When("click on login button")
	public void click_on_login_button() {

		WebElement loginButton =driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();  
	}
	@Then("it should navigate to hrm dashboard")
	public void it_should_navigate_to_hrm_dashboard() {
	  
		
		System.out.println("i am on dashboard");
	}

	
	
}
