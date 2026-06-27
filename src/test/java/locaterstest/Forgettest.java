package locaterstest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forgettest {
	public static  void main (String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahul shetty");
		String password = forgetpass(driver);
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(password);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='chkboxOne']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='chkboxTwo']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign In']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='You are successfully logged in.']")));
		System.out.println("pass");
		/*driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver.findElement(By.xpath("//input[@value='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		WebElement element = driver.findElement(By.xpath("//p[text()='You are successfully logged in.']"));
		if(element.isDisplayed()) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}*/
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='logout-btn']"))).click();
		//driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		
		
		
	}
	public static String forgetpass(WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul Shetty");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahul001@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7453830445");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		WebElement opp = driver.findElement(By.xpath("//p[@class='infoMsg']"));		
		String password = opp.getText().split("'")[1].split("'")[0].trim();
		System.out.println(password);
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		return password;
		
	}

}
