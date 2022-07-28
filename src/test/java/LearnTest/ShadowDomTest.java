package LearnTest;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sangu\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://watir.com/examples/shadow_dom.html");
		
		
		WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
		
         SearchContext shadowRoot = shadowHost.getShadowRoot();
         
         String strProperty = shadowRoot.findElement(By.id("shadow_content")).getDomProperty("namespaceURI");
         
         System.out.println("Dom Property :" + strProperty);
	}

}
