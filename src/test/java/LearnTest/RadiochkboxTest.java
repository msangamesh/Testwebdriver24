package LearnTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadiochkboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
//        driver.findElement(By.xpath("//input[@type='radio' and @value='Female' and @name = 'gender']")).click();
//	
        
//        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
//        
//        WebElement chkbox = driver.findElement(By.xpath("(//input[@class='cb1-element'])[3]"));
//        
//        System.out.println("Is chkbox selected :" + chkbox.isSelected());
//        
//        chkbox.click();
//        
//        if (chkbox.isSelected())
//        	
//        	System.out.println("Checkbox is Selected");
//        System.out.println("Is chkbox selected :" + chkbox.isSelected());
        
       driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        
        Select singlesel = new Select(driver.findElement(By.id("select-demo")));
        
        singlesel.selectByValue("Wednesday");
        
        Select mulsel = new Select(driver.findElement(By.id("multi-select")));
        mulsel.selectByIndex(0);
        mulsel.selectByValue("New Jersey");
        mulsel.selectByVisibleText("Texas");
        
        System.out.println("Selected options" + mulsel.getAllSelectedOptions().size());
        
        mulsel.deselectByIndex(0);
        
	
	}

}
