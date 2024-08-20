package definitions;

import java.time.Duration;
import java.util.List;

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
	wait = new WebDriverWait(driver,Duration.ofSeconds(10));
}
@Given("I navigate to MakeMyTrip")
  public void I_navigate_to_MakeMyTrip() {
		  
		  driver.get("https://www.makemytrip.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modalMain tcnFooter']")));
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class='commonModal__close']"))))
		  .click();
		  
}

@When("I select from city {string}")
  public void i_selec_from_city(String fc) {
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='fromCity']"))).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']"))).sendKeys(fc);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Delhi']")));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Delhi']"))).click(); 
	  }
@And("I select to city {string}")
  public void I_select_to_city(String cf) throws Throwable {
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='toCity']"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='To']"))).sendKeys(cf);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Pune']")));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Pune']"))).click();
  }
  
@When("I select the Month as {string} and date as {string} and year as {string}")
  public void i_select_the_month_as_and_date_as_and_year_as(String mo, String da, String ye) 
{
	String cleanedWord = mo.replace("'", "");
	String thmo = cleanedWord.substring(0, 3);
	String monthYear= cleanedWord+" "+ye;
	while(true) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".DayPicker-Caption div")));
		String displayedMonthYear =driver.findElement(By.xpath("//*[@class='DayPicker-Caption']")).getText();
		//String displayedMonthYear = driver.findElement(By.cssSelector(".DayPicker-Caption div")).getText();
				if (displayedMonthYear.equals(monthYear)) 
				{
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@aria-label,"+thmo+")]/div/p[text()="+da+"]"))).click();
	                break;
	            } else 
	            {
	                driver.findElement(By.cssSelector(".DayPicker-NavButton--next")).click();
	                //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Next Month']"))).click();
	            }
	}
	
}


@When("I Select one adult")
  public void i_select_one_adult() {
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='travellers']"))).click();
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-cy='adults-1']"))).click();
	//*[@data-cy='adults-1']
  }
@When("I Select one children")
  public void i_select_one_children() {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-cy='children-1']"))).click();
  }
@When("I Select one infant")
  public void i_select_one_infant() {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-cy='infants-1']"))).click();
  }
@When("I Select {string}")
  public void i_select(String string) {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Premium Economy']"))).click();
  }
@When("I click on apply")
  public void i_click_on_apply() {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='APPLY']"))).click();
	
  }
@When("I Select the {string}")
  public void i_select_the(String string) {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Regular']"))).click();
  }
@When("I click on search")
  public void i_click_on_search() {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Search']"))).click();
  }
@Then("I Close the browser")
  public void i_close_the_browser() {
      // Write code here that turns the phrase above into concrete actions
      
  }
}
