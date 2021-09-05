package testing_pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gauravpyeole03@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9730804811");
		driver.findElement(By.id("loginbutton")).click();
	}

}
