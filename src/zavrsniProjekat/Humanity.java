package zavrsniProjekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Humanity {
	
	public static final String URL="https://www.humanity.com/";
	private static final String FULLNAME_XPATH="/html/body/div[1]/header/div[2]/div/div/div/div/form/div/div[1]/input";
	private static final String WORKEMAIL_XPATH="/html/body/div[1]/header/div[2]/div/div/div/div/form/div/div[2]/input";
	private static final String START_BTN="//*[@id=\"free-trial-link-01\"]";
	private static final String UPPER_START_BTN="//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	private static final String POPUP_FULLNAME_XPATH="/html/body/div[5]/div/div/div/div/div/div[2]/form/div[1]/input";
	private static final String POPUP_WORKEMAIL_XPATH="/html/body/div[5]/div/div/div/div/div/div[2]/form/div[2]/input";
	private static final String POPUP_START_BTN_XPATH="//*[@id=\"popup-free-trial-link\"]";
	private static final String CLOSE_POPUP="/html/body/div[2]/div/div/div[1]/button";
	private static final String LOGIN_BTN="//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String LOGIN_MAIL="/html/body/div[1]/div[2]/div/form[1]/div[1]/div[2]/div/input";
	public static final String LOGIN_PASS="/html/body/div[1]/div[2]/div/form[1]/div[1]/div[3]/div/input";
	private static final String LOGIN_BTN2="/html/body/div[1]/div[2]/div/form[1]/div[3]/div/button[1]";
	private static WebDriver driver;
	
	public static void AddNewUser(WebDriver driver)  {
	driver.get(Humanity.URL);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button")).click();
	driver.findElement(By.xpath(LOGIN_BTN)).click();
	driver.findElement(By.id(LOGIN_MAIL)).sendKeys("kafa@kafucinac.com");
	driver.findElement(By.id(LOGIN_PASS)).sendKeys("kafa123");
	driver.findElement(By.xpath(LOGIN_BTN2)).click();
	driver.findElement(By.id("sn_staff")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	driver.findElement(By.id("act_primary")).click();
	driver.findElement(By.id("_asf1")).sendKeys("pera");
	driver.findElement(By.id("_asl1")).sendKeys("pericc");
	driver.findElement(By.id("_ase1")).sendKeys("pera@peric.com");
	driver.findElement(By.id("_as_save_multiple")).click();
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  WebElement alert1 = driver.findElement(By.id("_status"));
	  Assert.assertTrue(alert1.isDisplayed());

	}
	
	
	public static void inputFullName(WebDriver driver, String fullname) {
		driver.findElement(By.xpath(FULLNAME_XPATH)).sendKeys(fullname);
		
	}
	
	public static void inputWorkEmail(WebDriver driver, String workemail) {
		driver.findElement(By.xpath(WORKEMAIL_XPATH)).sendKeys(workemail);
	}
	
	public static void clickStartBtn(WebDriver driver) {
		driver.findElement(By.xpath(START_BTN)).click();
		
	}
	public static void clickUpperStartBtn(WebDriver driver) {
		driver.findElement(By.xpath(UPPER_START_BTN)).click();
		
	}
	
	public static void inputFullNamePop(WebDriver driver, String fullname) {
		driver.findElement(By.xpath(POPUP_FULLNAME_XPATH)).sendKeys(fullname);
	}
	
	public static void inputWorkEmailPop(WebDriver driver, String workemail) {
		driver.findElement(By.xpath(POPUP_WORKEMAIL_XPATH)).sendKeys(workemail);
	}
	
	public static void clickStartBtnPop(WebDriver driver) {
		driver.findElement(By.xpath(POPUP_START_BTN_XPATH)).click();
		
	}
	
	public static void clickClosePopUp(WebDriver driver) {
		driver.findElement(By.xpath(CLOSE_POPUP)).click();
		
	}
	
	public static void clickLogIn(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN_BTN)).click();
		
	}
	
	public static void inputLogInMail(WebDriver driver, String workemail) {
		driver.findElement(By.xpath(LOGIN_MAIL)).sendKeys(workemail);
		
	}
	public static void inputLogInPass(WebDriver driver, String pass) {
		driver.findElement(By.xpath(LOGIN_PASS)).sendKeys(pass);
		
	}
	public static void clickLogIn2(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN_BTN2)).click();
		
	}

}