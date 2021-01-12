import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionss {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement close = driver.findElement(By.xpath("//div[@class='_2QfC02']/button"));
		close.click();
		
		Thread.sleep(2000);
		
		WebElement man = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[3]"));
	
		Actions act=new Actions(driver);
		
		//act.click(man).perform();
		//act.moveToElement(man).perform();
		//act.click().perform();
		
		act.contextClick(man).perform();
		
		
	}

}
