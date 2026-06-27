package locaterstest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		String parents = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String win:windows) {
			if(!win.equals(parents)) {
				driver.switchTo().window(win);
				System.out.println("chid window title:"+ driver.getTitle());
				//System.out.println(driver.findElement(By.xpath("//div[class='example']")).getText());
				driver.close(); 
				break;	
			}
		}
		driver.switchTo().window(parents);
		System.out.println("parents window title"+ driver.getTitle());
		
		
		
		
		/*driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String parents = driver.getWindowHandle();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String win:windows) {
			if(!win.equals(parents)) {
				driver.switchTo().window(win);
				System.out.println("chid window title:"+ driver.getTitle());
				System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
				driver.close();
				break;	
			}
		}
		driver.switchTo().window(parents);
		System.out.println("parents window title"+ driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("rahul-shetty");*/
		
		}
	

}
