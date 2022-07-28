package LearnTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");
		
		//
		WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();
        //WebDriverManager.chromedriver().setup();
		 //driver= new ChromeDriver();
		Actions actions = new Actions(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		
		WebElement age = driver.findElement(By.id("age"));
		
		age.sendKeys(Keys.PAGE_DOWN);
		
		actions.moveToElement(age).perform();
		
		String strToolText = driver.findElement(By.className("ui-tooltip-content")).getText();
		
		System.out.println("Tool tip Text :" +strToolText);

	}

}
