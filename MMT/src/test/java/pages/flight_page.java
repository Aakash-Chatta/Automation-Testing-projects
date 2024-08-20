package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class flight_page {
	WebDriver driver;
	public flight_page(WebDriver driver){
		this.driver=driver;
	}
	
	//locators
	By page_register=By.xpath("//*[@class='modalMain tcnFooter']");
	By btn_close=By.xpath("//span[@class='commonModal__close']");
	By label_fromcity=By.xpath("//label[@for='fromCity']");
	By tbox_fromcity=By.xpath("//input[@placeholder='From']");
	By option_fromcity=By.xpath("//span[text()='New Delhi']");
	By label_tocity=By.xpath("//label[@for='toCity']");
	By tbox_tocity=By.xpath("//input[@placeholder='To']");
	By option_tocity=By.xpath("//span[text()='Pune']");
	By css_calender=By.cssSelector(".DayPicker-Caption div");
	By xpath_calender=By.xpath("//*[@class='DayPicker-Caption']");
	private String thmo;
	private String da;
	By date=By.xpath("//*[contains(@aria-label,"+thmo+")]/div/p[text()="+da+"]");
	By btn_nextmonth=By.cssSelector(".DayPicker-NavButton--next");
	By label_travellers=By.xpath("//label[@for='travellers']");
	By btn_no_adults=By.xpath("//*[@data-cy='adults-1']");
	By btn_no_childen=By.xpath("//*[@data-cy='children-1']");
	By btn_no_infants=By.xpath("//*[@data-cy='infants-1']");
	private String ty;
	By btn_traveller_type=By.xpath("//*[text()='"+ty+"']");
	By btn_apply=By.xpath("//button[text()='APPLY']");
	private String cl;
	By btn_class=By.xpath("//div[text()='"+cl+"']");
	By btn_search=By.xpath("//a[text()='Search']");
	
	//methods
	public void close_popup() {
		driver.get("https://www.makemytrip.com");
		driver.findElement(page_register).isDisplayed();
		driver.findElement(btn_close).click();
	}
	public void select_fromcity(String fc) {
		driver.findElement(label_fromcity).click();
		driver.findElement(tbox_fromcity).sendKeys(fc);
		driver.findElement(option_fromcity);
		driver.findElement(option_fromcity).click(); 	
	}
	public void select_tocity(String cf) {
		driver.findElement(label_tocity).click();
		driver.findElement(tbox_tocity).sendKeys(cf);
		driver.findElement(option_tocity);
		driver.findElement(option_tocity).click();
	}
	public void select_date(String mo, String da, String ye) {
		String cleanedWord = mo.replace("'", "");
		String thmo = cleanedWord.substring(0, 3);
		String monthYear= cleanedWord+" "+ye;
		while(true) 
		{
			driver.findElement(css_calender).isDisplayed();
			String displayedMonthYear =driver.findElement(xpath_calender).getText();
			//String displayedMonthYear = driver.findElement(By.cssSelector(".DayPicker-Caption div")).getText();
					if (displayedMonthYear.equals(monthYear)) 
					{
						driver.findElement(By.xpath("//*[contains(@aria-label,"+thmo+")]/div/p[text()="+da+"]")).click();
		                break;
		            } else 
		            {
		                driver.findElement(btn_nextmonth).click();
		                //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Next Month']"))).click();
		            }
		}
		
	}
	public void select_adults() {
		driver.findElement(label_travellers).click();
		driver.findElement(btn_no_adults).click();
	}
	public void select_children() {
		driver.findElement(btn_no_childen).click();
	}
	public void select_infants() {
		driver.findElement(btn_no_infants).click();
	}
	public void travel_type(String ty) {
		driver.findElement(By.xpath("//*[text()='"+ty+"']"));
	 }
	public void apply() {
		driver.findElement(btn_apply).click();
	}
	public void slect_class(String cl) {	
		driver.findElement(By.xpath("//div[text()='"+cl+"']")).click();
	}
	public void search() {
		driver.findElement(btn_search).click();
	}
	public void quitdriver() {
		driver.quit();
	}
	}
