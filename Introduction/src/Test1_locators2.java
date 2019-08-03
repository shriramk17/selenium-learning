import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First step: Create driver object
		System.setProperty("webdriver.chrome.driver", "D:\\POC\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://login.salesforce.com/");
		//driver.findElement(By.id("username")).sendKeys("dsafjkb");
		//driver.findElement(By.name("pw")).sendKeys("sdg");
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		driver.get("https://google.com");
		driver.findElement(By.xpath("//form[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("What is the time");
		driver.findElement(By.xpath("//input[@id='tsf']/div[2]/div/div[3]/center/input[1]")).click();
		
	

	}
}