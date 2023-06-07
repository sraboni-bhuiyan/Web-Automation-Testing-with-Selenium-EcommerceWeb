import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shwapno {
	public static WebDriver driver;
	public static String URL = "https://www.shwapno.com/";
	public static String city = "Dhaka";
	public static String area = "Adabor";
	public static WebElement element;
	public static WebElement location;

	@Test
	public static void chooseLocation() throws InterruptedException {
		System.setProperty("webdriver.chorme.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// select location
		WebElement location = driver
				.findElement(By.xpath("//div[@class='header_master stickyhead']//a[@id='btnChangeLocation12345']"));
		location.click();
		Thread.sleep(1000);

		Select drop_city = new Select(driver.findElement(By.xpath("//select[@id='state']")));
		drop_city.selectByVisibleText(city);
		Thread.sleep(1000);

		Select dropping_area = new Select(driver.findElement(By.xpath("//select[@id='city']")));
		dropping_area.selectByVisibleText(area);
		Thread.sleep(1000);

		WebElement element = driver.findElement(By.xpath("//input[@id='btnFindStore']"));
		element.click();
		driver.findElement(By.xpath("//div[@id='myaccount']//a[contains(@class,'header-login-link')][normalize-space()='login']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[normalize-space()='Login with Email']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_UserName']")).sendKeys("sweetsraboni1996@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_Password']")).sendKeys("123456abc");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_LoginImageButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Our Own Products']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//img[@title='Shwapno Premium Mixed Dal 1 Kg']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Add to Cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='cartdetailsinfo HasItems']")).click();
		Thread.sleep(1000);

	}
