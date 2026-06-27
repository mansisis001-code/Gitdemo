package locaterstest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class droptest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("ind");
		List<WebElement> options =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement option :options) {
			if(option.getText().equalsIgnoreCase("INDIA")) {
				option.click();
				break;
				}	
		}
		//driver.findElement(By.);
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();
		//driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//driver.findElement(By.xpath("//a[text()=Chennai (MAA)']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i=1;i<=5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		WebElement opp =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(opp);
		dropdown.selectByVisibleText("INR");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
		
		
		
		
		
				
		
	}

}
