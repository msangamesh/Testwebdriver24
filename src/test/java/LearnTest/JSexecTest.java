package LearnTest;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSexecTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(1));
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String strTitle = (String)js.executeScript("return document.title");
		System.out.println("Page Title  :" +strTitle);

		
		WebElement searchBox = (WebElement) js.executeScript("return document.getElementsByName('search')[0]");
	
		searchBox.sendKeys("Phone");
			}

}
