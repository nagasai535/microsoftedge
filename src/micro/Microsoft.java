package micro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Microsoft {
	
	@Test
	public void sai() throws InterruptedException
	{
	System.setProperty("webdriver.edge.driver", "D:\\tools\\ME\\msedgedriver.exe");

	// Start Edge Session
	WebDriver driver = new EdgeDriver();

	driver.get("https://google.com");
     Thread.sleep(4000);
	driver.quit();

}

}
