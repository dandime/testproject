import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	private static final int i = 0;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		String exp="nokia c3";
		
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("nokia");
		
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(list.size());
		
		for(WebElement ele : list)
		{
			//System.out.println(ele.getText());
			String ee = ele.getText();
			System.out.println(ee);
			
			if(ee.equals(exp))
			{
				ele.click();
				System.out.println("get element " + exp + "to find the index " +(i+1));
				break;
			}
			
		}
		
	}

}
