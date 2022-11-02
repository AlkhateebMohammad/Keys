package Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "E:\\alkhateeb\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.booking.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"ss\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("amman"+Keys.ARROW_DOWN);
	
		
		
		

	}

}
