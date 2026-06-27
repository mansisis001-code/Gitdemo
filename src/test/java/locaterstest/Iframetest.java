package locaterstest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframetest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.xpath("//a[text() ='Nested Frames']")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		String text =driver.findElement(By.id("content")).getText();
		System.out.println(text);
		driver.switchTo().parentFrame();

		driver.switchTo().frame("frame-right");
		String texts =driver.findElement(By.tagName("body")).getText();
		System.out.println(texts);
		
		driver.switchTo().parentFrame();
		System.out.println("we are back to parents");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		String textss =driver.findElement(By.tagName("body")).getText();
		System.out.println(textss);
		
		
		
	
		
	}

}
