package testNGExtent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import seleniumConcepts.ExampleWebTable;

public class ExampleExtentReports {
	
	//1. Go to mvn repo and search with extentreports and select aventstack 5.0.9
	//2. Add dependency to pom.xml
	//3. Create a class for extent report and initialize  the extent reports
	//4. Create a scenario and give the tc name
	//5. add some logs which we can in html report
	//6. flush the report
	
	//flush the report
	
	ExtentReports extent ;
	ExtentSparkReporter sparkReporter ;
	ExtentTest test;
	WebDriver driver;
	String url = "https://demoqa.com/alerts";
	
	@BeforeClass
	void exampleExtentReport() {
		extent = new ExtentReports();
		sparkReporter = new ExtentSparkReporter("report.html");
		extent.attachReporter(sparkReporter);
	}
	
	@AfterClass
	void flushReport() {
		extent.flush();
	}
	
	@BeforeMethod
	void launchBrowser() {
		test = extent.createTest("Launch browser");	
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	void closeBro() {
		driver.close();
	}

	@Test
	public void exAlert() {
		test = extent.createTest("TC01");		
		driver.findElement(By.id("alertButton")).click();
		test.log(Status.PASS, "alert button is clicked");
//		Alert a = driver.switchTo().alert();		
		driver.switchTo().alert().accept();
		test.log(Status.PASS, "alert is accepted");
//		System.out.println("Alert is accepted");
		
	}
	
//	@Test
//	public void exConfAlert() {
//		test = extent.createTest("exConfAlert");	
//		driver.findElement(By.id("confirmButton")).click();
//		test.log(Status.INFO, "confirmButton button is clicked");
//		Alert a = driver.switchTo().alert();		
//		a.dismiss();
////		System.out.println("Alert is accepted");
//		test.log(Status.INFO, "alert is accepted");
////		System.out.println("Alert is dimissed");		
//	}
//	
//	@Test
//	public void exPromptAlert() {
//		test = extent.createTest("exConfAlert");
//		driver.findElement(By.id("promtButton")).click();	
//		test.log(Status.INFO, "promtButton button is clicked");
//		Alert a = driver.switchTo().alert();
//		a.sendKeys("Text is entered");
//		test.log(Status.INFO, "Text is entered");
//		a.accept();
////		System.out.println("Alert is accepted");
//		test.log(Status.INFO, "alert is accepted");
////		System.out.println("Alert is dimissed");		
//	}
}
