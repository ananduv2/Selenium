import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.chromedriver;

public class login{

	public static void main(String[] args) {
		WebDriver driver=new Chromedriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://localhost/civil/index.php");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pswd'")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login'")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='logout'")).click();


	}
}