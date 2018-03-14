package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleFooterLink5 {
	
	@Given("^I go to Google Home page$")
	public void i_go_to_Google_Home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver", "C:/Users/Saiful/Utilities/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.close();
	}

	@When("^I click on the Privacy link$")
	public void i_click_on_the_Privacy_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:/Users/Saiful/Utilities/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Then("^I see the Privacy page$")
	public void i_see_the_Privacy_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver", "C:/Users/Saiful/Utilities/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		Assert.assertEquals(true, driver.getPageSource().contains("Privacy"));

		Thread.sleep(3000);

		System.out.println("Test is passed");
		driver.close();
	}
	@When("^I click on the Terms link$")
	public void i_click_on_the_Terms_link() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Saiful/Utilities/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Then("^I see the Terms page$")
	public void i_see_the_Terms_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Saiful/Utilities/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);

		Assert.assertEquals(true, driver.getPageSource().contains("Terms"));

		Thread.sleep(3000);

		System.out.println("Test is passed");
		driver.close();

	}

	@When("^I click on the Settings link$")
	public void i_click_on_the_Settings_link() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Saiful/Utilities/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Then("^I see the Settings page$")
	public void i_see_the_Settings_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Saiful/Utilities/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		Assert.assertEquals(true, driver.getPageSource().contains("History"));

		Thread.sleep(3000);

		System.out.println("Test is passed");
		driver.close();

	}


}
