package LearnTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(1));
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		
		String strTxt = alert.getText();
		System.out.println("Alert Text :"  +strTxt );
		alert.accept();
		
		
		//Confirmation Alert
		
        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg']) [1]")).click();
        Alert confirm = driver.switchTo().alert();
        
        confirm.dismiss();
        
        
        //Prompt Alert
        
        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg']) [2]")).click();
        Alert prompt = driver.switchTo().alert();
     prompt.sendKeys("Hello Welcome");
     prompt.accept();
        
        
		
		
		
		
		
		
		
		

	}

}
