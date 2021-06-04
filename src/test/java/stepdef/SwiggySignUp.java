package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import stepdef.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class SwiggySignUp {

	WebDriver driver = SetUp.driver;
	ExtentReports extent;
	ExtentTest logger;

	@Given("^The user is on the swiggy home page$")
	public void the_user_is_on_the_swiggy_home_page() throws Throwable {
		driver.get("https://www.swiggy.com/");
	}

	@When("^User click on SignUp$")
	public void user_click_on_signup() throws Throwable {

		WebElement signup = driver.findElement(By.xpath("//a[normalize-space()='Sign up']"));
		signup.click();

		Thread.sleep(5000);
		extent = new ExtentReports(System.getProperty("user.dir") + "/swiggy.html", false);

		logger = extent.startTest("Test1");

		logger.log(LogStatus.PASS, "Click on the SignUp button");

	}

	@Then("^User should be redirected to SignUp page$")
	public void user_should_be_redirected_to_signup_page() throws Throwable {

		WebElement logo = driver.findElement(By.xpath("//*[@class='_1Tg1D']"));
		Assert.assertTrue(logo.isDisplayed());
		logger.log(LogStatus.PASS, "SignUp is appearing");
		extent.endTest(logger);
		extent.flush();
		extent.close();

	}

	@Given("^The user is on the swiggy SignUp page$")
	public void the_user_is_on_the_swiggy_signup_page() throws Throwable {
		
		driver.get("https://www.swiggy.com/");
		WebElement signup = driver.findElement(By.xpath("//a[normalize-space()='Sign up']"));
		signup.click();
		extent = new ExtentReports(System.getProperty("user.dir") + "/swiggy.html", false);

		logger = extent.startTest("Test2");

		logger.log(LogStatus.PASS, "Click on the SignUp button");

	}

	@When("^User enters \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_somethingsomethingsomething_and_something(String phonenumber, String name, String email,
			String password) throws Throwable {

		WebElement sphone = driver.findElement(By.id("mobile"));
		WebElement sname = driver.findElement(By.id("name"));
		WebElement semail = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement ctn = driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']"));

		sphone.sendKeys(phonenumber);
		sname.sendKeys(name);
		semail.sendKeys(email);
		pwd.sendKeys(password);
		ctn.click();

		Thread.sleep(5000);
		logger.log(LogStatus.PASS, "Enter the user details");

	}

	@Then("^User should be able to SignUp$")
	public void user_should_be_able_to_signup() throws Throwable {
		extent.endTest(logger);
		extent.flush();
		extent.close();

	}

}
