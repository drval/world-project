package world;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WorldProjectApplication.class)
@WebAppConfiguration
public class WorldProjectApplicationTests extends TestCase {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testIndexPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://localhost:8084");
		assertEquals(driver.findElementById("title").getText(), "World-project using spring boot and Angular");
		driver.quit();
	}
}
