package LearnTest;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpencartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.Opencart.com/");
		
	driver.findElement(By.xpath("//span[contains(., 'My Account')]")).click();
		
	driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a")).click();
	
	WebElement firstName = driver.findElement(By.id("input-firstname"));
	firstName.sendKeys("Sangareddy");
	WebElement lastName = driver.findElement(By.id("input-lastname"));
	lastName.sendKeys("Munge");
	WebElement eMail = driver.findElement(By.id("input-email"));
	eMail.sendKeys("msangameshreddy@gmail.com");
	
	
	String encrptData= "987654321";
	byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());
	System.out.println("encodedBytes --------------->" + new String(encodedBytes));		
	

	
	
	WebElement pWord = driver.findElement(By.id("input-password"));
	pWord.sendKeys("987654321");
	
	driver.findElement(By.name("agree")).click();
	
	driver.findElement(By.className("btn btn-primary")).click();
	
		
		
	

	}

}
