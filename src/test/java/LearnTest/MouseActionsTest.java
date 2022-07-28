package LearnTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://demo.Opencart.com/");
		
		
		
		
		
		
		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav li.nav-item.dropdown:nth-child(3)"));
		
         //Mousehover
		
		WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(), 'Monitors (2)')]"));
		
		actions.moveToElement(menu).click(menuItem).perform();
		
		WebElement search = driver.findElement(By.name("search"));
		
		//search.sendKeys("phone");
//		search.sendKeys(Keys.chord(Keys.SHIFT+"P"));
//		search.sendKeys(Keys.chord("hone"));
//		search.click();
//		search.sendKeys(Keys.ARROW_LEFT);
//		search.sendKeys(Keys.ARROW_LEFT);
//		search.sendKeys(Keys.ARROW_LEFT);
//		search.sendKeys(Keys.ARROW_LEFT);
//		search.sendKeys(Keys.ARROW_LEFT);
//		search.sendKeys(Keys.chord("sangareddy"));
//		search.sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(2000);
//		search.sendKeys(Keys.PAGE_UP);
		
		
//		
//		TakesScreenshot screen = (TakesScreenshot) driver;
//		
//		File src = screen.getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(src, new File ("E:\\Sangu\\Selenium\\ScreenShot\\Fullpage.png"));
//		
//		
//		
//		WebElement item = driver.findElement(By.cssSelector("div#product-list"));
//		
//		item.sendKeys(Keys.PAGE_DOWN);
//		File itemsrc = item.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(itemsrc, new File ("E:\\Sangu\\Selenium\\ScreenShot\\Halfpage.png"));
//		
		
		
		
		
//		
		// Rightclick
//		WebElement search = driver.findElement(By.name("search"));
//		actions.contextClick(search).perform();
		
//		//DoubleClick
//		driver.get("https://stqatools.com/demo/DoubleClick.php");
//		WebElement btnDbl= driver.findElement(By.xpath("//button[contains(text(),'Double Click Me')]"));
//		
//		WebElement btnsin= driver.findElement(By.xpath("//button[contains(text(),'Double Click Me')]"));
//		Thread.sleep(2000);
//		actions.doubleClick(btnDbl).perform();
//		
//		Thread.sleep(2000);
//		actions.click(btnsin).perform();
//		
		
	}

}
