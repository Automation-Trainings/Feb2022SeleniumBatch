package seleniumConcepts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExampleDemoQA {

	// Practice Links and Broken Links

	static ChromeDriver driver;

//	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Set the system property

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\99.0.4844.51\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows"); // Used to launch the URL
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("URL is launched");

//		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.xpath("//*[text()='New Window']")).click();

		ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
		int windowHandleCount = windowHandles.size();
		System.out.println("Number of windows is : " + windowHandleCount);
		String tab2 = driver.getCurrentUrl();
		System.out.println(tab2);

		driver.switchTo().window(windowHandles.get(0));
		Thread.sleep(2000);
		String tab1 = driver.getCurrentUrl();
		System.out.println(tab1);

		driver.switchTo().window(windowHandles.get(1));
		Thread.sleep(2000);
		String tab = driver.getCurrentUrl();
		System.out.println(tab);

		System.out.println("Session id of 1 : " + windowHandles.get(0));

		System.out.println("Session id of 2 : " + windowHandles.get(1));

		// Getting window handle
//		String windowHanle = driver.getWindowHandle();
//		System.out.println(windowHanle);

		Thread.sleep(3000);
		driver.quit();
		/*
		 * //Get attribute example driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://demoqa.com/dynamic-properties"); // Used to launch the
		 * URL driver.manage().window().maximize();
		 * System.out.println("URL is launched"); String attributeValue =
		 * driver.findElement(By.xpath("//*[@id='colorChange']")).getAttribute("id");
		 * System.out.println(attributeValue); Thread.sleep(6000); String
		 * attributeValue1 =
		 * driver.findElement(By.xpath("//*[@id='colorChange']")).getAttribute("class");
		 * System.out.println(attributeValue1); Thread.sleep(3000); driver.close();
		 */
		/*
		 * //Handling buttons using actions class driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://demoqa.com/buttons"); // Used to launch the URL
		 * driver.manage().window().maximize(); System.out.println("URL is launched");
		 * 
		 * Actions ac = new Actions(driver);
		 * 
		 * WebElement doubleClick =
		 * driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		 * ac.doubleClick(doubleClick).build().perform();
		 * 
		 * WebElement rightClick =
		 * driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
		 * ac.contextClick(rightClick).build().perform();
		 * 
		 * WebElement Click = driver.findElement(By.xpath("//*[text()='Click Me']"));
		 * ac.click(Click).build().perform(); // Click.click();
		 * 
		 * String actText =
		 * driver.findElement(By.xpath("//*[@id='doubleClickMessage']")).getText();
		 * System.out.print(actText);
		 * 
		 * Thread.sleep(3000); driver.close();
		 */

		/*
		 * //Handling of check box driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://demoqa.com/checkbox"); // Used to launch the URL
		 * driver.manage().window().maximize(); System.out.println("URL is launched");
		 * 
		 * driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']")).
		 * click();
		 * 
		 * driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).click
		 * ();
		 * 
		 * String actText =
		 * driver.findElement(By.xpath("//*[@class='display-result mt-4']")).getText();
		 * System.out.print(actText);
		 * 
		 * Thread.sleep(3000); driver.close();
		 */
	}

}
