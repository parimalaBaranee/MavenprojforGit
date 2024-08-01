package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testngpgm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumwebdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		
		}

	}


