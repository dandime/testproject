import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestio {

	

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		String exp="nokia 2.4";
		
		 WebElement res = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		 res.sendKeys("nokia");
		Thread.sleep(2000);
		
		List<WebElement> lists = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(lists.size());
		
		for(int i=0; i<=lists.size()-1; i++)
		{
			String act=lists.get(i).getText();
			if(act.equals(exp))
			{
				System.out.println("give element " +exp+ "found at the index of :" +(i+1));
			}
		}
		
		
	}

}
