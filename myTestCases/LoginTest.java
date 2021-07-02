

import java.awt.print.Printable;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.mustache.Value;
public class LoginTest {
	   @Test
	   public void loginTest() {
		   
	        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	        WebDriver driver = new ChromeDriver(); 
	        String url = "http://localhost/zmax";
	        driver.get(url); 
	        driver.navigate().to(url); 
	        try {
				driver.findElement(By.name("username")).clear();
				driver.findElement(By.name("username")).sendKeys("admin");

				driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("password")).sendKeys("123456");
				driver.findElement(By.name("Submit")).click();
				AssertJUnit.assertEquals(driver.findElement(By.name("Submit")).getAttribute("value"), "Log out");
				System.out.println("over");
			} catch (Exception e) {

			}

	    }

}
