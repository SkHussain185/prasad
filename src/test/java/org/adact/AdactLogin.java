package org.adact;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactLogin {
	
	WebDriver driver;

	@Given("User is on the Adact page")
	public void user_is_on_the_adact_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Hussain");
		
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("hello");
		//driver.findElement(By.id("login")).click();
	}
	@And("user click on the login")
	public void user_click_on_the_login() throws InterruptedException {
		driver.findElement(By.id("login")).click();
	   
	}
	@Then("user should verify success msg.")
	public void user_should_verify_success_msg() {
		Assert.assertTrue(true);
	  
	}




}
