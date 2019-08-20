import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class findingItemAndAddToCart {
	public void childrnBooks()
	{
		System.setProperty("webdriver.chrome.driver","Y:\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		Actions a=new Actions(driver);
		WebElement shopBy=driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		a.moveToElement(shopBy).build().perform();
		WebElement books=driver.findElement(By.xpath("//span[@aria-label='Books & Audible']"));
		a.moveToElement(books).build().perform();
		WebElement childBooks=driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[15]/div[1]/div/a[5]/span"));
		a.moveToElement(childBooks).click().build().perform();
		////*[@id="nav-flyout-shopAll"]/div[3]/div[15]/div[1]/div/a[5]/span
		driver.findElement(By.xpath("//span[contains(text(),'6 to 8 years')]")).click();
		
//		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(windows.get(1));
//		driver.findElement(By.xpath(""));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findingItemAndAddToCart f=new findingItemAndAddToCart();
		
		f.childrnBooks();
		
		
	}

}
