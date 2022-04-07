package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {
	
	static ChromeDriver driver;
	
	public static void selectDropDown(String attribute, String attValue, String value) {		
		WebElement day = driver.findElement(By.xpath("//*[@"+attribute+"='"+attValue+"']"));		
		Select sc = new Select(day);
		sc.selectByVisibleText(value);
	}

	public static void main(String[] args) throws InterruptedException {
		
		SeleniumDemo obj = new SeleniumDemo();

		// Set the system property
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\99.0.4844.51\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/"); // Used to launch the URL
		driver.manage().window().maximize();
		System.out.println("URL is launched");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// findelementBy
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		String actText = driver.findElement(By.xpath("//*[text()='Sign Up' and @class='mbs _52lq fsl fwb fcb']"))
				.getText();
		String expText = "Sign Up";

		if (actText.equals(expText)) {
			System.out.println(actText + " is matching to " + expText);
		} else {
			System.out.println(actText + " is not matching to " + expText);
		}

		driver.findElement(By.name("firstname")).sendKeys("Testing");
		System.out.println("First name is entered");
		driver.findElement(By.name("lastname")).sendKeys("Masters");
		System.out.println("Last name is entered");
		driver.findElement(By.name("reg_email__")).sendKeys("54982345684");
		System.out.println("Phone number is entered");
		driver.findElement(By.id("password_step_input")).sendKeys("5444684");
		System.out.println("Password is entered");
		
		selectDropDown("name", "birthday_day", "28");
		System.out.println("Day is Selected");
		
//		WebElement day = driver.findElement(By.id("day"));		
//		Select sc = new Select(day);
//		sc.selectByVisibleText("10");
//		System.out.println("Day is Selected");
		
		selectDropDown("id", "month", "Jun");
		System.out.println("Month is Selected");		
		
//		WebElement month = driver.findElement(By.id("month"));		
//		Select sc1 = new Select(month);
//		sc1.selectByVisibleText("Jun");
//		System.out.println("Month is Selected");
		
		selectDropDown("id", "year", "1980");
		System.out.println("Year is Selected");
		
//		WebElement year = driver.findElement(By.id("year"));		
//		Select sc2 = new Select(year);
//		sc2.selectByVisibleText("1980");
//		System.out.println("Year is Selected");
		
		driver.findElement(By.xpath("//*[text()='Male']")).click();
		System.out.println("Radio button is clicked");
		driver.findElement(By.name("websubmit")).click();
		System.out.println("Sign up button is clicked");
//		driver.findElement(By.id("day")).sendKeys("31");
//		System.out.println("31 is selected");
//		Thread.sleep(3000);
//		driver.close();
	}

}
