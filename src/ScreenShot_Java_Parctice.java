
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ScreenShot_Java_Parctice {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.edge.driver", "D:\\edge driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("http://127.0.0.1:5500/index.html");

//		Date currentDate = new Date();
//		
//		String TheAcutalDate = currentDate.toString().replace(":", "-");
//
//		TakesScreenshot src = ((TakesScreenshot) driver) ; 
//		
//		File SrcFile = src.getScreenshotAs((OutputType.FILE));
//		
//		File Dest = new File(".//mypictures/"+TheAcutalDate+".png");
//		
//		FileUtils.copyFile (SrcFile,Dest); 

//		List<WebElement> thestudents = driver.findElements(By.tagName("option"));
//
//		int theTotalNumberOfStudents = thestudents.size();
//
//		System.out.println(theTotalNumberOfStudents + " this is the orginal number");
//
//		int HowManyItems = 10;
//
//		System.out.println(HowManyItems + " this is the number of items i want remove");
//
//		for (int i = 0; i < HowManyItems; i++) {
//			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
//
//		}
//
//		List <WebElement> thestudentsAfterRemove = driver.findElements(By.tagName("option"));
//		int ActualNumber = thestudentsAfterRemove.size();
//
//		System.out.println("this is the new actaual number"+ActualNumber);
//
//		int expectedITems = theTotalNumberOfStudents - HowManyItems;
//
//		System.out.println(expectedITems + "this is the number i have expected");
//		Assert.assertEquals(ActualNumber, expectedITems);

		List<WebElement> thestudents = driver.findElements(By.tagName("option"));
		int theTotalNumberOfStudents = thestudents.size();

		System.out.println(theTotalNumberOfStudents + " this is the orginal number");

		int thestudent = thestudents.size();
		
		for (int i = 1; i < thestudents.size(); i+=2) {
			System.out.println(thestudents.get(i).getText());
			thestudents.get(i).click();
			thestudent -= 1;
			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
			System.out.println(thestudent + " this is the orginal after remove");
		}

		Date currentDate = new Date();
		
		String TheAcutalDate = currentDate.toString().replace(":", "-");

		TakesScreenshot src = ((TakesScreenshot) driver) ; 
		
		File SrcFile = src.getScreenshotAs((OutputType.FILE));
		
		File Dest = new File(".//mypictures/"+TheAcutalDate+".png");
		
		FileUtils.copyFile (SrcFile,Dest); 
		
		
//		for (int i = 0; i < thestudents.size(); i++) {
//			System.out.println(thestudents.get(i).getText());
//			thestudents.get(i).click();
//			thestudent -= 1;
//			
//			if (i % 2 == 0) {
//				System.out.println(thestudent + " not remove");
//			//	driver.findElement(By.xpath("//*[@id=\"selectNow\"]")).sendKeys(Keys.ARROW_DOWN);
//			} else {
//				driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
//				System.out.println(thestudent + " this is the orginal after remove");
//				//driver.findElement(By.xpath("//*[@id=\"selectNow\"]")).sendKeys(Keys.ARROW_DOWN);
//
//			}
//
//		}
		
		
//		if(theTotalNumberOfStudents%2==0) {
//		
//			System.out.println(theTotalNumberOfStudents + " this is the orginal not remove");
//		}
//		else {
//			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
//			System.out.println(theTotalNumberOfStudents + " this is the orginal after  remove");
//		}
//		int HowManyItems = 10;
//		System.out.println(HowManyItems + " this is the number of items i want remove");
//
//	
//
//		List <WebElement> thestudentsAfterRemove = driver.findElements(By.tagName("option"));
//		int ActualNumber = thestudentsAfterRemove.size();

	}

}
