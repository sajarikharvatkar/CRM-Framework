package com.comcas.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(linkText = "Organizations")
	private WebElement orgLink;
	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	@FindBy(linkText = "More")
	private WebElement moreLink;
	@FindBy(linkText = "Campaigns")
	private WebElement campaignLink;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement AdminImg;
	@FindBy(linkText = "Sign Out")
	private WebElement signoutbtn;
	public WebElement getAdminImg() {
		return AdminImg;
	}
	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
	public WebElement getCampaignLink() {
		return campaignLink;
	}
	public WebElement getMoreLink() {
		return moreLink;
	}
	public HomePage(WebDriver driver)
	{ this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getOrgLink() {
		return orgLink;
	}
	public WebElement getContactLink() {
		return contactLink;
	}
	
	
	//provide Bussiness Action
	public void goToCampaignLink()
	{ 
		Actions act=new Actions(driver);
		act.moveToElement(moreLink).perform();
		campaignLink.click();
		
	}
	public void GoToSignOut()
	{
		Actions act=new Actions(driver);
		act.moveToElement(AdminImg).perform();;
		signoutbtn.click();
	}

}
