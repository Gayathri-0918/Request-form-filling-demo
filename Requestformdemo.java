package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Requestformdemo {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\maven project selenium\\project1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Gayathri");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Gayu");
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("First buisness");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("recaptcha-checkbox-checkmark")).click();
		WebElement text=driver.findElement(By.id("recaptcha-anchor-label"));
		String a=text.getText();
		driver.findElement(By.id("demo")).click();
	}

}
