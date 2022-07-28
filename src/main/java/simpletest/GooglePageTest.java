package simpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangareddy\\Desktop\\Test learn\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.sendKeys("Java Tutorial");
		
		//searchbox.submit();
		searchbox.sendKeys(Keys.ENTER);
		String pageTitle = driver.getTitle();
		System.out.println("Page Title :" + pageTitle);
		System.out.println("current URL :" + driver.getCurrentUrl());

		driver.close();
		
	}

}
