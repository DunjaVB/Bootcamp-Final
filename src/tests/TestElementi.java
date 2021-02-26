package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import zavrsniProjekat.Elementi;
import zavrsniProjekat.Humanity;

public class TestElementi {
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\drajver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
@Test(priority=1)
	
	public void testLogIn() {
		
		SoftAssert sa= new SoftAssert();
		
		driver.navigate().to(Humanity.URL);
		driver.manage().window().maximize();
		Humanity.clickClosePopUp(driver);
		Humanity.clickLogIn(driver);
		Humanity.inputLogInMail(driver, "kafa@kafucinac.com");
		Humanity.inputLogInPass(driver, "kafa123");
		Humanity.clickLogIn2(driver);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String actual=driver.getCurrentUrl();
		String expected="https://gorkakafa.humanity.com/app/dashboard/";
		
		Assert.assertEquals(actual, expected);
		
		sa.assertAll();
	
		
		
	}

	@Test (priority = 1)
    public void testDashboard() {
		SoftAssert sa= new SoftAssert();
        try {
            Thread.sleep(2200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elementi.DASHBOARD_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elementi.DASHBOARD_TITLE;
        Assert.assertEquals(actual, expected);
        
    }
    @Test (priority = 2)
    public void testPlanning() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elementi.PLANNING_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elementi.PLANNING_TITLE;
        Assert.assertEquals(actual, expected);
    }
    @Test (priority = 3)
    public void testClock() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elementi.CLOCK_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elementi.CLOCK_TITLE;
        Assert.assertEquals(actual, expected);
    }
    @Test (priority = 4)
    public void testLeave() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elementi.LEAVE_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elementi.LEAVE_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 5)
    public void testTraining() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elementi.TRAINING_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elementi.TRAINING_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 6)
    public void testStaff() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elementi.STAFF_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elementi.STAFF_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 7)
    public void testAvailability() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elementi.AVAILABILITY_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elementi.AVAILABILITY_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 8)
    public void testPayroll() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elementi.PAYROLL_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elementi.PAYROLL_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 9)
    public void testReports() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elementi.REPORTS_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elementi.REPORTS_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
