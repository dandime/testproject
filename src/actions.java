import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
		
		Actions sct=new Actions(driver);
		
		//sct.moveToElement(ele).perform();
		//sct.click().perform();
		//sct.click(ele).perform();
		//sct.contextClick(ele).perform();
		sct.moveToElement(ele).contextClick().build().perform();
		
		
		

	}

}
