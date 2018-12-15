package mail.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	private static WebElement element = null;
	public static WebElement login_UserName(WebDriver driver){
		element = driver.findElement(By.id("idInput"));
		return element;
	}
	
	public static WebElement login_Password(WebDriver driver){
	element = driver.findElement(By.id("pwdInput"));
	return element;
	}

	public static WebElement login_Button(WebDriver driver){
		element = driver.findElement(By.id("loginBtn"));
		return element;
	}
	
	public static WebElement login_User(WebDriver driver){
	element = driver.findElement(By.id("spnUid"));
	return element;
	}
	
	public static WebElement logout_Button(WebDriver driver){
	element = driver.findElement(By.linkText("�˳�"));
	return element;
	}
	
}