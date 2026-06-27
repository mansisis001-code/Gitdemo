package testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Windowhandleass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 WebElement checkbox =driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		 checkbox.click();
		//driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		 String optname = checkbox.getAttribute("value");
		System.out.println(optname);
		 WebElement dropele = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropdown = new Select( dropele);
		dropdown.selectByValue(optname.trim());
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys(optname);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("alert message :" + alert.getText());
		alert.accept();
		
	}
	

}
