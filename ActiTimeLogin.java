package loginScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("container_reports")).click();
		/*
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("actiTIME - Enter Time-Track")) {
			System.out.println("Pass : home page displayed");
		}
		else {
			System.out.println("error");
		}
		
		*/
		Thread.sleep(2000);
		driver.close();
	}

}
