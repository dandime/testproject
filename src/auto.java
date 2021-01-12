import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		for(WebElement ll :links)
		{
			System.out.println(ll.getText());
		}
		
		WebElement close = driver.findElement(By.xpath("//div[@class='_2QfC02']/button"));
		if(close.isDisplayed())
		{
			close.click();
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 7 pro");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
	String review = driver.findElement(By.xpath("(//span[@class='_2_R_DZ'])[2]/span/span[1]")).getText();
		System.out.println(review);
		
	}

}
