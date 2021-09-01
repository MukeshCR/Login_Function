package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Negative_Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukesh\\eclipse-workspace\\New_Sessions\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.test.acviss.co/dashboard/login/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Dashboard | Acviss")) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("In-Correct page is dispayed");
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
