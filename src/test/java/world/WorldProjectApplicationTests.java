package world;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WorldProjectApplication.class)
@WebAppConfiguration
public class WorldProjectApplicationTests extends TestCase {
	
	@Autowired WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
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
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void testCityApi() throws Exception {
		this.mockMvc.perform( get("/api/getCitiesByCountryCode/RUS")
				.accept(MediaType.APPLICATION_JSON) )
				.andExpect(status().isOk())
				.andExpect(jsonPath("$[?(@.name=='Moscow')].id").value( 3580 ));				
	}
	
	@Test
	public void testCountryApi() throws Exception {
		this.mockMvc.perform( get("/api/getAllCountries")
				.accept(MediaType.APPLICATION_JSON) )
				.andExpect(status().isOk())
				.andExpect(jsonPath("$[?(@.code=='BGD')].capital").value( 150 ));				
	}
	
}
