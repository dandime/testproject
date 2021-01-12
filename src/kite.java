import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class kite {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(option);

		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijay@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//button[@class='button-blue'])[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("TATA");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='search-result-list']//li[11]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("10");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='su-radio-wrap'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit']")).click();
		

	}

}
