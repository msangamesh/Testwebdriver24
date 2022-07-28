package LearnTest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//WebElement searchbox = driver.findElement(By.name("q"));
		//WebElement searchbox = driver.findElement(By.class("gLFyf"));
		WebElement searchbox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		searchbox.sendKeys("Java Tutorial");
		
		System.out.println("Search attribute"+ searchbox.getAttribute("role"));
		
		Thread.sleep(2000);
		
		List<WebElement> items = driver.findElements(By.xpath("//ul[@class='G43f7e']//li//descendant::div[@class='wM6W7d']"));
		
		System.out.println("Number of items:"+ items.size());
		
		
		for(int i=0; i< items.size(); i++) {
			
			System.out.println(items.get(i).getText());
			
			System.out.println(items.get(i).getTagName());
			
			if (items.get(i).getText().equalsIgnoreCase("Java Tutorial Pdf")) {
				
				items.get(i).click();
				
				break;
			}
			
			
		}
		
		
		searchbox.submit();
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title :" + pageTitle);
		System.out.println("current URL :" + driver.getCurrentUrl());
                 System.out.println("Modified by Tester2 :");
                 System.out.println("Modified in stage2 :");
		driver.close();
		
	}

}
