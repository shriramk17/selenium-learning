import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First step: Create driver object
		System.setProperty("webdriver.chrome.driver", "D:\\POC\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("dsafjkb");
		driver.findElement(By.name("pw")).sendKeys("sdg");
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		driver.findElement(By.className("inputtext")).sendKeys("sdf");
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("shriram");
		driver.findElement(By.cssSelector("#password")).sendKeys("koles");		

	}
}