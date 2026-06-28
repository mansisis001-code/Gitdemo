package locaterstest;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Addcartrest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String[] name = {"Cucumber","Cauliflower","Beans","Apple"};
		int j =0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++) {
			String product =products.get(i).getText().split("-")[0].trim();
			List names =Arrays.asList(name);
			if(names.contains(product)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button"))
				.get(i).click();	
				if(j==name.length) {
					break;
				}
			}
		}
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter promo code']"))).sendKeys("jby3j5bvg");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='promoBtn']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']"))).click();
		WebElement dropdown = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//select"))
			);

			Select country = new Select(dropdown);
			country.selectByVisibleText("India");

		/*Select drop = new Select(driver.findElement(By.xpath("//select")));
		drop.deSelectByContainsVisibleText("India");*/
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='chkAgree']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Proceed']"))).click();
		

		// kya yrr sahi hogaaaa

				
	}

}
