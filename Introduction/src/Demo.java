import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First step: Create driver object
		System.setProperty("webdriver.chrome.driver", "E:\\POC\\Selenium Installables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(	driver.getTitle());
		
		
		
		

	}

}
