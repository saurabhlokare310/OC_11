package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	
	//CONSTRUCTOR
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	//LOCATORS
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chbxAgree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;	
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmationMsg;
	
	//ACTIONS
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setTelephone(String tele)
	{
		txtTelephone.sendKeys(tele);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void setConfirmPassword(String cpwd)
	{
		txtConfirmPassword.sendKeys(cpwd);
	}
	public void setPrivacyPolicy()
	{
		chbxAgree.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	public String getConfirmationMsg()
    {try 
        {
   	   		return (confirmationMsg.getText());
   	 	}catch (Exception e)
         	{
   	 			return (e.getMessage());
         	}
    }
	
	

}
