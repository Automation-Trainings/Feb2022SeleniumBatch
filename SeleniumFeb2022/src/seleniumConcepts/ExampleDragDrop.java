package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExampleDragDrop {
	
	//Source - From where to drag, Target - Where to drop
	
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\99.0.4844.51\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/"); // Used to launch the URL
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("URL is launched");
		
		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']"));		
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.xpath("//*[@id='gallery']/li[1]"));
		WebElement target = driver.findElement(By.xpath("//*[@id='trash']"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(5000);
		driver.close();
	}

}
