package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExampleFrames extends ExampleWebTable {
	
	//Practice partialLinkText method
	//Practice scrollIntoView

	void handlingFrames() throws InterruptedException {
		
		WebElement element = driver.findElement(By.xpath("//*[@name='globalSqa']"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("Text Entered");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("Testing Masters");
	}

	public static void main(String[] args) throws InterruptedException {
		ExampleFrames obj = new ExampleFrames();
		String url = "https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame";
		obj.launchUrl(url);
		obj.handlingFrames();
	}

}
