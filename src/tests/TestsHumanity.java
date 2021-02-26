package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import zavrsniProjekat.Humanity;

public class TestsHumanity {
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
	
	
/*	@Test(priority=2)
	
	public void testNewUser() {
		driver.navigate().to(Humanity.URL);
		driver.manage().window().maximize();
		Humanity.clickClosePopUp(driver);
	//	Humanity.clickStartBtn(driver);
		Humanity.inputFullName(driver, "aa bbb");
		Humanity.inputWorkEmail(driver, "aa@aa.com");
		Humanity.clickStartBtn(driver);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	
	public void testNewUserUpperPop() {
		driver.navigate().to(Humanity.URL);
		driver.manage().window().maximize();
		Humanity.clickClosePopUp(driver);
	//	Humanity.clickStartBtn(driver);
		Humanity.clickUpperStartBtn(driver);
		Humanity.inputFullNamePop(driver, "ccc dddd");
		Humanity.inputWorkEmailPop(driver, "dd@aadd.com");
		Humanity.clickStartBtnPop(driver);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority = 3)
	public void excelFileTest() {
		File f = new File("file.xlsx");
		try {
			InputStream inp = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(inp);
			Sheet sheet = wb.getSheetAt(0);
			SoftAssert sa = new SoftAssert();
			driver.get(Humanity.URL);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button")).click();
			driver.navigate().to(Humanity.URL);
			driver.manage().window().maximize();
			Humanity.clickClosePopUp(driver);
			Humanity.clickLogIn(driver);
			Humanity.inputLogInMail(driver, "mina@minic.com");
			Humanity.clickLogIn2(driver);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i = 0; i < 5; i++) {
				Row row = sheet.getRow(i);
				Cell c1 = row.getCell(0);
				Cell c2 = row.getCell(1);
				String name = c1.toString();
				String lastName = c2.toString();
				driver.findElement(By.xpath("//*[@id=\"sn_staff\"]/span")).click(); 
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.id("act_primary")).click(); 
				driver.findElement(By.id("_asf1")).sendKeys(name);
				driver.findElement(By.id("_asl1")).sendKeys(lastName);
				driver.findElement(By.id("_ase1")).sendKeys("mina@minic.com");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1000)");
				driver.findElement(By.id("_as_save_multiple")).click();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				WebElement alert1 = driver.findElement(By.id("_status"));
				sa.assertTrue(alert1.isDisplayed());
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			}
			sa.assertAll();
			wb.close();
		} catch (IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}*/
	
	/*Humanity.clickStartBtn(driver);
		Humanity.inputFullName(driver, "Kafa Kafucinac");
		Humanity.inputWorkEmail(driver, "kafa@kafucinac.com");
		Humanity.clickStartBtn(driver);*/
}
//}