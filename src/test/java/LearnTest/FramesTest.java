package LearnTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames");
		
		WebElement strText = driver.findElement(By.cssSelector("label > span"));
		
		System.out.println("Label Text " +strText);
		
		//from main page to frame1
		//driver.switchTo().frame("Frame1");
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Hello welcome");
		
		Thread.sleep(2000);
		//from main page to frame3
		driver.switchTo().frame("Frame3");
		//driver.switchTo().frame(0);
		WebElement chkbox = driver.findElement(By.id("a"));
	
		if(!chkbox.isSelected())
		chkbox.click();
		
		//from frame3 to frame1
		
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).clear();
		driver.findElement(By.tagName("input")).sendKeys("Hello welcome back");
		
		
		//Frame1 to main page
		driver.switchTo().defaultContent();
		
		WebElement stText = driver.findElement(By.cssSelector("label > span"));
		System.out.println("Label agter coming back " +stText);

		
		//main page to frame2
		
		driver.switchTo().frame(1);
		
		Select drpdown = new Select(driver.findElement(By.id("animals")));
		
		drpdown.selectByIndex(3);
		
		System.out.println("Selected value:" +drpdown.getFirstSelectedOption().getText());
		
		
	}

}
