package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GerenciamentoDriver {

	protected static WebDriver driver;
	
	public static WebDriver browser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();	
		} return driver;
		
		
		
		
	}
	
}

