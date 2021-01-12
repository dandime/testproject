import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aaa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi note 7 pro");
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@jsname='erkvQe']/li"));
		int lis = list.size();
		System.out.println(lis);
		
		for(WebElement ele:list)
		{
			System.out.println(ele.getText());
		}
	}

}
