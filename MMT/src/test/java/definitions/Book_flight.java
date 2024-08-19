package definitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Book_flight {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
@Before
public void before() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
@Given("I navigate to MakeMyTrip")
  public void I_navigate_to_MakeMyTrip() {
		  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  driver.get("https://www.makemytrip.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modalMain tcnFooter']")));
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class='commonModal__close']"))))
		  .click();
		  
}

@When("I select from city {string}")
  public void i_selec_from_city(String fc) {
		  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='fromCity']"))).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']"))).sendKeys(fc);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Delhi']")));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Delhi']"))).click(); 
	  }
@And("I select to city {string}")
  public void I_select_to_city(String cf) throws Throwable {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='toCity']"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='To']"))).sendKeys(cf);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Pune']")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Pune']"))).click();
  }
  
@When("I select the date of travel")
  public void i_select_the_date_of_travel() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@When("I Select one adult")
  public void i_select_one_adult() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@When("I Select one children")
  public void i_select_one_children() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@When("I Select one infant")
  public void i_select_one_infant() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@When("I Select {string}")
  public void i_select(String string) {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@When("I click on apply")
  public void i_click_on_apply() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@When("I Select the {string}")
  public void i_select_the(String string) {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@When("I click on search")
  public void i_click_on_search() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@When("I Select cheapest flight")
  public void i_select_cheapest_flight() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@When("Click on Book now")
  public void click_on_book_now() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@When("I Fill all the passenger details")
  public void i_fill_all_the_passenger_details() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
@Then("I Close the browser")
  public void i_close_the_browser() {
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
}
