import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.chromedriver;

public class adddb{

	public static void main(String[] args) {
		WebDriver driver=new Chromedriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://localhost/civil/index.php");
		driver.findElement(By.id("username")).sendKeys("amal");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pswd'")).sendKeys("amal");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login'")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='apd'")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='card'")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name'")).sendKeys("name");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='members'")).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mob")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='atdb'")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='logout'")).click();


	}
}