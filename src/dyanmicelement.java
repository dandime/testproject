import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanmicelement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		WebElement close = driver.findElement(By.xpath("//div[@class='_2QfC02']/button"));
		close.click();
		
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		text.sendKeys(" red mi 7 pro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement review = driver.findElement(By.xpath("(//span[@class='_2_R_DZ'])[2]/span/span[1]"));
		System.out.println(review.getText());
	}

}
