import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement name = driver.findElement(By.xpath("//input[@name='email']"));
		name.sendKeys("preeti dandime");
		String va = name.getAttribute("value");
		System.out.println(va);
	}

}
