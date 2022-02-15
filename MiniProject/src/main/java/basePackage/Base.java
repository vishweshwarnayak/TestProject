package basePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public Base() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("./Configuration\\Config.properties");
		prop.load(fis);

		/*
		 * prop.load(fis); prop.setProperty("db.url", "localhost");
		 * prop.setProperty("db.user", "mkyong"); prop.setProperty("db.password",
		 * "password");
		 */
	}

	public static void initialization() {
		String browserName = prop.getProperty("Browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			// DesiredCapabilities dc=new DesiredCapabilities();
			// dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		} else if (browserName.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", "./Drivers//IEDriverServer.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
