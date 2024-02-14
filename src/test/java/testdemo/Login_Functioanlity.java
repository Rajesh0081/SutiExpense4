package testdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Functioanlity {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//*[@id='formid']/button")).click();
		
		System.out.println("Login Success");
		
		driver.close();
		
		
		//driver.quit();
		
		
	}

}
