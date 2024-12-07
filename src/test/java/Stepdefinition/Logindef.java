package Stepdefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logindef {
	
	WebDriver d;
	@Given("if the user on home page")
	public void if_the_user_on_home_page() throws InterruptedException {
	   d=new FirefoxDriver();
	   d.manage().window().maximize();
	   
	      Thread.sleep(2000);

      d.get("https://demo.cyclos.org/ui/home"); 
      
      Thread.sleep(2000);
      assertTrue(d.findElement(By.id("login-link")).isDisplayed());
	   
	}


	@When("click on login link")
	public void click_on_login_link() throws InterruptedException {
		
	      Thread.sleep(3000);

		d.findElement(By.id("login-link")).click();
	}

	@When("Enter login details")
	public void enter_login_details() throws InterruptedException {
		d.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("demo ");
		d.findElement(By.xpath("//input[@autocomplete='password']")).sendKeys("1234");
		
		Thread.sleep(4000);

		d.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
		
		Thread.sleep(4000);

	}

	@Then("verify logout link")
	public void verify_logout_link() {
	      assertTrue(d.findElement(By.id("logout-trigger")).isDisplayed());

	}


}
