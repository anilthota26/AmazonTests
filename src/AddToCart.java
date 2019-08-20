import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	public  WebDriver driver;
	public void addToCart() {
		System.setProperty("webdriver.chrome.driver","Y:\\Selenium Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
	//	driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("lenovo k8 note");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath
				("//h2[@data-attribute='Lenovo K8 Note (Venom Black, 4GB RAM, 64GB Storage) with New System Update']")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//		driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AddToCart add=new AddToCart();
	add.addToCart();
	}

}
