package ResourceFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	public WebDriver driver;

	public void intializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\pawar\\eclipse-workspace\\TestNGSeleniumProject\\src\\main\\java\\ResourceFile\\data.properties");

		Properties prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			System.out.println("hello");

		/*	System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pawar\\OneDrive\\Desktop\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
*/  
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// firefox code
		}

		else if (browserName.equalsIgnoreCase("edge")) {

			// edge code

		}

		else {

			System.out.println("please enter proper browser value");
		}
	}

}
