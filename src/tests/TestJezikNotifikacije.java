package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import zavrsniProjekat.Humanity;
import zavrsniProjekat.Settings;

public class TestJezikNotifikacije {

	WebDriver driver;
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\poi\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test (priority = 1)
	public void testLng() {
		driver.get(Humanity.URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Humanity.clickLogIn(driver)).click());
		driver.findElement(By.xpath(Humanity.LOGIN_MAIL)).sendKeys("kafa@kafucinac.com");
		driver.findElement(By.xpath(Humanity.LOGIN_PASS)).sendKeys("kafa123");
		driver.findElement(By.xpath(Humanity.LOGIN_BTN2)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Settings.SETTINGS_XPATH)).click();
		
		WebElement wblang = driver.findElement(By.xpath(Settings.LNG_XPATH));
		wblang.click();
		wblang.sendKeys(Keys.ARROW_DOWN);
		wblang.sendKeys(Keys.ARROW_DOWN);
		wblang.sendKeys(Keys.ARROW_DOWN);
		wblang.sendKeys(Keys.ARROW_DOWN);
		wblang.sendKeys(Keys.ARROW_DOWN);
		wblang.sendKeys(Keys.ARROW_DOWN);
		wblang.sendKeys(Keys.ARROW_DOWN);
		
		/*for(int i = 1; i < 8; i++) {
			lng.sendKeys(Keys.ARROW_DOWN);
			i++;
			//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}*/
		wblang.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(Humanity.SAVE_XPATH)).click();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		String actual = driver.findElement(By.xpath(Humanity.LEAVE_XPATH)).getText();
		String expected = "Odmor";
		Assert.assertEquals(actual, expected);
		System.out.println("Vrednost a1 = " + actual);
		
		driver.findElement(By.xpath("//*[@id=\"_fbody\"]")).sendKeys(Keys.PAGE_UP);
		driver.findElement(By.xpath("//*[@id=\"_fbody\"]")).sendKeys(Keys.PAGE_UP);
		
		WebElement lng2 = driver.findElement(By.xpath(Adrese3.LNG2_XPATH));
		lng2.click();
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(Adrese3.SAVE_XPATH)).click();
		driver.navigate().refresh();
			
	}
	
	@Test (priority = 2)
	public void testDisableNotifications() {
		
		driver.findElement(By.xpath(Humanity.EMAILNOTIF_XPATH)).click();
		driver.findElement(By.xpath(Humanity.SMSNOTIF_XPATH)).click();
		driver.findElement(By.xpath(Humanity.MOBILE_XPATH)).click();
		driver.findElement(By.xpath(Humanity.SAVE_XPATH)).click();
		driver.navigate().refresh();
		//TEST OVDE
		WebElement checkbox = driver.findElement(By.id("pref_pref_email"));
		boolean actual = checkbox.isSelected();
		System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
		Assert.assertEquals(actual, true);
		
		driver.findElement(By.xpath(Humanity.EMAILNOTIF_XPATH)).click();
		driver.findElement(By.xpath(Humanity.SMSNOTIF_XPATH)).click();
		driver.findElement(By.xpath(Humanity.MOBILE_XPATH)).click();
		driver.findElement(By.xpath("//*[@id=\"_fbody\"]")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath(Humanity.SAVE_XPATH)).click();
		driver.navigate().refresh();
		
	}
	
	
}

