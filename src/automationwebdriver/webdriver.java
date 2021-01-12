package automationwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().to("https://www.gmail.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String act = driver.getTitle();
		String exp="gamil";
		if(act.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		Dimension d=new Dimension(500,700);
		driver.manage().window().setSize(d);

		
		Point p=new Point(400,400);
		driver.manage().window().setPosition(p);
		
		
		driver.quit();
		driver.close();
		
		

	}

}
