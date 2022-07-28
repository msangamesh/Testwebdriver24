package LearnTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;

public class WindowPopTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.Google.com/");
		
		String parentWindow = driver.getWindowHandle();
		
		//Open new window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.selenium.dev/");
		
		Set<String> wins = driver.getWindowHandles();
		System.out.println("Number of windows :" +wins.size());
		
		Iterator<String> it = wins.iterator();
		 String gWindow = it.next();
		 String selWindow = it.next();
		 
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
		 
		 Thread.sleep(2000);
		 
		 //driver.close();
		 
		 //switch to google window
		 
		 //driver.switchTo().window(parentWindow);
		 driver.switchTo().window(gWindow);
		 System.out.println(driver.getTitle());
		 
		 WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		 
		 
		search.sendKeys("Stars");
		search.submit();
		 
		 //Open a new tabbed window
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.navigate().to("https://playwright.dev/");
		 System.out.println(driver.getTitle());
		 
		 //Thread.sleep(2000);
		 
		// driver.quit();
		 
		 //driver.findElement(By.name("search")).sendKeys("Java");
		 
		 
		 
		
		
		
		

	}

}
