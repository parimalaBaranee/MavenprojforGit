package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static WebDriver driver;
	@BeforeMethod()
	public void getdriver() throws InterruptedException
	{
		

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		String baseurl="https://demo.guru99.com/V1/";
		driver.get( baseurl);
		driver.manage().window().maximize();
		
		
		
	}
	
		@Test
		public void aLogin() throws InterruptedException
		{
			System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr583544");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("EtAnYje");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		//System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='menusubnav']//a[normalize-space()='New Customer']")).click();
		//driver.switchTo().alert().dismiss();
	
		
		}
		
		@Test
		public void bLogin() throws InterruptedException
		{
			
			
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr583544");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("EtAnYje");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		//System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='menusubnav']//a[normalize-space()='New Customer']")).click();
		//driver.switchTo().alert().dismiss();
	
		
		}
		@AfterMethod
		public void quit()
		{
			driver.quit();
		}


}
