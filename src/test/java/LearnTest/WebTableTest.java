package LearnTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
		
//		WebElement strsalary = driver.findElement(By.xpath("//td[text()='B. Wagner']"));
//
//	System.out.println("Selected user :" +strsalary.getText());
//	
	
		
		Select singlesel = new Select(driver.findElement(By.xpath("//table[@id='example']//ancestor::div[1]/div[1]/label")));
		singlesel.selectByValue("100");
		
		List<WebElement> tableElement = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
	    
	    System.out.println("table rows:" +tableElement.size());
	    //System.out.println("Selected user :" + tableElement.getText());
	    
	    
	    for(int i=0; i < tableElement.size(); i++){
	    	
	    	//System.out.println("Rows data :" + tableElement.get(i).getText());
	    	
	    	
	    	
if (tableElement.get(i).getText().contains("San Francisco")) {
	
	i++;
	
	String rowItem = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]")).getText();

	System.out.println(rowItem.toString());
	
	
	
}			
				
	    	
	    	
	    
	       
	    }
	}
}


