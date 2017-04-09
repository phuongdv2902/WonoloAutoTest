package customerportalpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "path/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://wonolo-dev.herokuapp.com/users/sign_in");
		driver.manage().window().maximize();
		
		WebElement email= driver.findElement(By.xpath(".//*[@id='user_email']"));
		email.sendKeys("dvuphuong@gmail.com");
		
		WebElement pass= driver.findElement(By.xpath(".//*[@id='user_password']"));
		pass.sendKeys("12345678");
		
		
		WebElement button= driver.findElement(By.xpath(".//*[@id='new_user']/div[5]/div/input"));
		button.click();
		
	}

}
