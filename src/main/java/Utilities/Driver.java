package Utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver;

	/**
	 This method initializes driver instance based on the browser selected
	 @param
	 DriverType - its the driver instance which is going to invoke(IE,Chrome,Firefox)
	 @return WebDriver
	 @throws
	 IOException - it occur whenever an input or output operation is failed or interpreted.
	 @throws InterruptedException
	 */

	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver(String DriverType) throws IOException, InterruptedException
	{

		if (DriverType.equalsIgnoreCase("CHROME")){

			ChromeOptions options = new ChromeOptions();

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		return driver;
	}

}
