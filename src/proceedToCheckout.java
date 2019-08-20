import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class proceedToCheckout extends AddToCart {
	public void checkout() {
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		driver.findElement(By.xpath("//input[@value='Proceed to checkout']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9951186498");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.id("ap_password")).sendKeys("anil2179");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/span[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//		try {
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]"
				+ "/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")).click();
//		}
//		catch(Exception e){
//			
//		}
		//driver.quit();
		
	}
	public void takeScreenShot() throws IOException
	{
		DateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
		Date dt=new Date();
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("Y:\\Selenium Wrok Space\\AmazonTests\\resoures\\"
				+dateFormat.format(dt)+".png");
		
			//FileUtils.copyFile(srcFile,new File("Y:\\Selenium Wrok Space\\AmazonTests\\resoures"
//												+dateFormat.format(dt)+".png"));
			FileUtils.copyFile(srcFile, destFile);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		proceedToCheckout pc=new proceedToCheckout();
		pc.addToCart();
		try {
			pc.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pc.checkout();
		try {
			pc.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
