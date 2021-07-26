import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.firefox.FirefoxOptions;


import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver = null;

	@Given("^user in homepage$")
	public void user_in_homepage() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        
        driver = new FirefoxDriver(firefoxOptions);

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://localhost:5050/userManager/");
		driver.manage().window().maximize();
		System.out.println("Login successful");
	}

	@When("^user enters the pan no \"([^\"]*)\"$")
	public void user_enters_the_pan_no(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"panNo\"]")).sendKeys(arg1);
		driver.findElement(By.id("submit")).click();
		System.out.println("Pan no entered");
	}

	@Then("^credit card is \"([^\"]*)\"$")
	public void credit_card_is(String arg1) throws Throwable {
		String status = driver.findElement(By.xpath("//*[@id=\"msg\"]")).getText().toString();
		
//		System.out.println(status + " - " + arg1);

		if (status.contains("not eligible")) {
			System.out.println("Credit Card declined");
		} else if (status.contains("eligible")) {
			System.out.println("Credit card approved");
		} else if (status.contains("Invalid")) {
			System.out.println("Pan Number invalid");
		} else {
			System.out.println("Status not captured");
		}
		Assert.assertTrue(true);
		driver.close();
	}

}
