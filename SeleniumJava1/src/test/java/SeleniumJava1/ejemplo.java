package SeleniumJava1;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ejemplo {
			
		private WebDriver driver;


		By listavideoLinkLocator = By.xpath("//span[@id='video-title']");
		By segundoLinkLocator = By.xpath("//img[@src='https://i.ytimg.com/vi/PIb6AZdTr-A/hqdefault.jpg?sqp=-oaymwEYCKgBEF5IVfKriqkDCwgBFQAAiEIYAXAB&amp;rs=AOn4CLCwTIvyXDcwqyEOAFbm9I-TkvM7Ig']");
		@Before
		public void setUp() {
			
			
			System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/");
			
			
		}
		
		@Test
		public void testGooglePage() {
			
			WebElement searchbox = driver.findElement(By.name("search_query"));
			
			searchbox.clear();
			searchbox.sendKeys("rock de los 80");
			
			searchbox.submit();
			
			
			driver.findElement(listavideoLinkLocator).click();
			
			driver.findElement(segundoLinkLocator).click();
			///driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//assertEquals("vandal - Buscar con Google",driver.getTitle());
		}
		/*@After
		public void tearDown() {
			driver.quit();
		}*/
}
