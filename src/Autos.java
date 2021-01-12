import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Autos {

	private static final int i = 0;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		String exp="nokia 7.2";
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("nokia");
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		for( WebElement link :links)
		{
			System.out.println(link.getText());
		}
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(list.size());
		
		for(WebElement ele :list)
		{
			//System.out.println(ele.getText());
			String ee = ele.getText();
			System.out.println(ee);
			
			if(ee.equals(exp))
			{
				ele.click();
				System.out.println("get element " + exp + "at the index of " +(i+1));
				break;
				
			}
		}
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\DELL\\Desktop\\selenium\\screenshot\\ppppp.jpg");
		
		FileHandler.copy(source, dest);
		
		WebElement shop = driver.findElement(By.xpath("(//a[@class='hide-focus-ring'])[1]"));
		
		Actions act=new Actions(driver);
		
		act.click(shop).perform();
		
		//act.contextClick(shop).perform();
		
		
		

	}

}
