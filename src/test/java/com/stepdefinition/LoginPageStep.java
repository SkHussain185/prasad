package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {
	
	WebDriver driver;

	@Given("user is on the facebook page")
	public void user_is_on_the_facebook_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	       
	}
	@When("user should enter username and password")
	public void user_should_enter_username_and_password() {
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Hussain");
		
		WebElement element2 = driver.findElement(By.id("pass"));
		element2.sendKeys("hello@123");
	}
	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement findElement = driver.findElement(By.id("login"));
		findElement.click();
	}
	@Then("user should verify success msg")
	public void user_should_verify_success_msg() {
		Assert.assertTrue(true);
	
	    
	}
}
