package testcases;

import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assimenttest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//driver.findElement(By.);
		driver.findElement(By.name("name")).sendKeys("Mansi-Saini");
		driver.findElement(By.name("email")).sendKeys("mansi001@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("7374920446");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		WebElement opp =driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(opp);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("2000-05-15");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		String message =driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(message);
		
		
		
		
		
		
		
		
	}


}
