package LearnTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;



public class RelativeLocatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationbookstore.dev/");
		
		WebElement strName = driver.findElement(with(By.tagName("li"))
		
				.toLeftOf(By.id("pid6"))
				.below(By.id("pid1")));
		
		strName.getText();
				
		
		System.out.println(strName.getText());
		
		
		WebElement str1Name = driver.findElement(with(By.tagName("li"))
				
				.toRightOf(By.id("pid2"))
				.above(By.id("pid7")));
		
		str1Name.getText();
				
		
		System.out.println(str1Name.getText());

	}

}
