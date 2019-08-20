import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Y:\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("lenovo k8 note");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath
				("//h2[@data-attribute='Lenovo K8 Note (Venom Black, 4GB RAM, 64GB Storage) with New System Update']")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//		driver.close();
		driver.close();
	}

}
