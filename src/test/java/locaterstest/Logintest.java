package locaterstest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class Logintest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebElement opp = driver.findElement(By.xpath("//p[@class='text-center text-white']"));
		String username = opp.getText().split("and")[0].split("is")[1].trim();
		String password = opp.getText().split("and")[1].split("is")[1].replace(")", "").trim();
		System.out.println(password);

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		WebElement user=driver.findElement(By.xpath("(//span[@class='checkmark'])[2]"));
		Actions action =new Actions(driver);
		action.moveToElement(user).click().perform();		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn"))).click();
		/*Alert alert = driver.switchTo().alert();
		System.out.println("alert message :" + alert.getText());
		alert.accept();
		
		// WebElement button = driver.findElement(By.xpath("//input[@id='usertype']"));
		////div[@class=form-check-inline']/label[2]/span[@class='checkmark']
		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(button).click().perform(); WebDriverWait wait = new
		 * WebDriverWait(driver,Duration.ofSeconds(5));
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert alert
		 * =driver.switchTo().alert(); alert.accept();
		 */
		WebElement student = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select dropdown = new Select(student);
		List<WebElement> options = dropdown.getOptions();
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("teacher")) {
				option.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

		/*
		 * 1 simple type login String username = "rahulshettyacademy"; String password =
		 * "Learning@830$3mK2"; driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 * driver.findElement(By.id("username")).sendKeys(username);
		 * driver.findElement(By.id("password")).sendKeys(password);
		 * driver.findElement(By.className("checkmark")).click(); WebElement student =
		 * driver.findElement(By.xpath("//select[@data-style='btn-info']")); Select
		 * dropdown = new Select(student); List<WebElement> options =
		 * dropdown.getOptions(); for (WebElement option : options) { if
		 * (option.getText().equalsIgnoreCase("teacher")) { option.click(); break; } }
		 * driver.findElement(By.id("terms")).click();
		 * driver.findElement(By.id("signInBtn")).click();
		 */

	}

}
