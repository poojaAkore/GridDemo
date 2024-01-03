package gird;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;


public class EdgeTest {
	
	
	@Test
	public void HomePageTest() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("edge");
		WebDriver driver=new RemoteWebDriver(new URL("http://172.19.112.1:4444"), cap);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("rahul shetty");
		driver.close();
	}
}
