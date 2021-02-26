package zavrsniProjekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {

	
	private static final String URL_SETTINGS="https://gorkakafa.humanity.com/app/dashboard/";
	private static final String SETBTN_XPATH="//*[@id=\"sn_admin\"]/span/i";
	private static final String SELECT_LANG="//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String SETTINGS_XPATH="//*[@id=\"sn_admin\"]/span";
	public static final String LNG_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String SAVE_XPATH = "//*[@id=\"_save_settings_button\"]";
	public static final String LNG2_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String EMAILNOTIF_XPATH =  "//*[@id=\"pref_pref_email\"]";
	public static final String SMSNOTIF_XPATH = "//*[@id=\"pref_pref_sms\"]";
	public static final String MOBILE_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span/p";
	private static WebDriver driver;
	
	
	public static void clickSettings(WebDriver driver) {
		driver.findElement(By.xpath(SETBTN_XPATH)).click();
		
	}
	
	public static void clickLang(WebDriver driver) {
		driver.findElement(By.xpath(SELECT_LANG)).click();
		
	}
}
