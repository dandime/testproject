import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicele {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		WebElement closeb = driver.findElement(By.xpath("//div[@class='_2QfC02']/button"));
		if(closeb.isDisplayed())
		{
			closeb.click();
		}
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		text.sendKeys("redmi note 7 pro");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);
		
		String review = driver.findElement(By.xpath("(//span[@class='_2_R_DZ'])[2]/span/span")).getText();
		System.out.println(review);
		
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		System.out.println(link.size());
		
		for( WebElement links : link)
		{
			System.out.println(links.getText());
		}
		 
		 
		
		

	}

}
