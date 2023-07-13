package pojopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPojoClass {

	//WebDriver driver;
	public LoginPojoClass(WebDriver driver) {
		//this.driver=driver;

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement txtUserName;
	@FindBy(xpath="//input[@name='password']")
	private WebElement txtPassword;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnlogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void login(String userName, String password) {
		getTxtUserName().sendKeys(userName);
		getTxtPassword().sendKeys(password);
		getBtnlogin().click();
	}
}
