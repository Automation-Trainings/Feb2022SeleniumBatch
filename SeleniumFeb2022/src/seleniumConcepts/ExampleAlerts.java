package seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

public class ExampleAlerts extends ExampleWebTable{
	
	public void exAlert() throws InterruptedException {
		driver.findElement(By.id("alertButton")).click();
		
//		Alert a = driver.switchTo().alert();		
		driver.switchTo().alert().accept();
		System.out.println("Alert is accepted");
		
	}
	
	public void exConfAlert() throws InterruptedException {
		driver.findElement(By.id("confirmButton")).click();
		
		Alert a = driver.switchTo().alert();		
		a.dismiss();
//		System.out.println("Alert is accepted");
		System.out.println("Alert is dimissed");		
	}
	
	public void exPromptAlert() throws TimeoutException, InterruptedException {
		driver.findElement(By.id("promtButton")).click();		
		Alert a = driver.switchTo().alert();
		a.sendKeys("Text is entered");
		a.accept();
//		System.out.println("Alert is accepted");
		System.out.println("Alert is dimissed");		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExampleAlerts obj = new ExampleAlerts();
		String url = "https://demoqa.com/alerts";
		obj.launchUrl(url);
		obj.exPromptAlert();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
