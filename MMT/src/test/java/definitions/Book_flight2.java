package definitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.flight_page;

public class Book_flight2 {
	public static flight_page fg;
	public static WebDriver driver;
	public static WebDriverWait wait;
	
@Before
public void before() {
	ChromeOptions options = new ChromeOptions();
	fg=new flight_page(driver);
	options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
    options.addArguments("accept-language=en-US,en;q=0.9");
    options.addArguments("referer=https://www.google.com");
    WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
}
@Given("I navigate to MakeMyTrip")
  public void I_navigate_to_MakeMyTrip() {
		 fg=new flight_page(driver);
		 fg.close_popup();	  
}

@When("I select from city {string}")
  public void i_selec_from_city(String fc) {
		  fg=new flight_page(driver);
		  fg.select_fromcity(fc);
	  }
@And("I select to city {string}")
  public void I_select_to_city(String cf) throws Throwable {
	fg=new flight_page(driver);
	  fg.select_tocity(cf);
  }
  
@When("I select the Month as {string} and date as {string} and year as {string}")
  public void i_select_the_month_as_and_date_as_and_year_as(String mo, String da, String ye) {
	fg=new flight_page(driver);
	fg.select_date(mo, da, ye);
}


@When("I Select one adult")
  public void i_select_one_adult() {
	fg=new flight_page(driver);
	 fg.select_adults();
  }
@When("I Select one children")
  public void i_select_one_children() {
	fg=new flight_page(driver);
	fg.select_children();
  }
@When("I Select one infant")
  public void i_select_one_infant() {
	fg=new flight_page(driver);
	fg.select_infants();
  }
@When("I Select {string}")
  public void i_select(String ty) {
	fg=new flight_page(driver);
	fg.travel_type(ty);
  }
@When("I click on apply")
  public void i_click_on_apply() {
	fg=new flight_page(driver);
	fg.apply();	
  }
@When("I Select the {string}")
  public void i_select_the(String cl) {
	fg=new flight_page(driver);
	fg.slect_class(cl);
  }
@When("I click on search")
  public void i_click_on_search() {
	fg=new flight_page(driver);
	fg.search();
  }

@Then("I Close the browser")
  public void i_close_the_browser() {
	fg=new flight_page(driver);
      fg.quitdriver();
      
  }
}
