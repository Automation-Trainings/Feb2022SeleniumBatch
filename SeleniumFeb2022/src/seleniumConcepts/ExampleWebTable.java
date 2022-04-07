package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleWebTable {

	static WebDriver driver;

	public static void launchUrl(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\99.0.4844.51\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url); // Used to launch the URL
		driver.manage().window().maximize();
		System.out.println("Webtable is launched");
	}
	
	public static void closeBrowser() {
		driver.close();
	}

	public void webTableEx(String empNameExp) throws InterruptedException {
		int rowCount = driver.findElements(By.xpath("//*[@class='rt-tbody']/div")).size();
		System.out.println("The number of rows : " + rowCount);

		int colCount = driver.findElements(By.xpath("//*[@class='rt-tbody']/div[1]/div/div")).size();
		System.out.println("The number of columns : " +colCount);

		for (int i = 1; i <= rowCount; i++) {
			String empNameAct = driver.findElement(By.xpath("//*[@class='rt-tbody']/div[" + i + "]/div/div")).getText();
			if (empNameAct.equals(empNameExp)) {
				for (int j = 1; j <= colCount; j++) {
					String empInfo = driver
							.findElement(By.xpath("//*[@class='rt-tbody']/div[" + i + "]/div/div[" + j + "]"))
							.getText();
					System.out.print(empInfo + "\t");
				}
			}

		}

		Thread.sleep(2000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {

		ExampleWebTable obj = new ExampleWebTable();
		String url = "https://demoqa.com/webtables";
		obj.launchUrl(url);
		obj.webTableEx("Kierra");

	}

}
