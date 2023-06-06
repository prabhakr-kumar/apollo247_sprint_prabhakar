package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class DoctorsPage extends Utility {
	
	
	@FindBy(xpath="//*[normalize-space(text())='New Delhi']")
	private WebElement Button;  
	

	@FindBy(xpath="//span[@class='jss257']")
	private WebElement sort_select;
	
	@FindBy(xpath="//*[text()='Price - low to high']")
	private WebElement lowhigh;
	
	@FindBy(xpath="(//button[contains(@class, 'MuiButton-root') and contains(., 'Book Hospital Visit')])[1]")
	private WebElement BookButton;
	
	
	@FindBy(xpath="//input[@name='mobileNumber']")
	    WebElement login;
	
	@FindBy(xpath="//span[@class='MuiFab-label']")
        WebElement login_arrow_one; // this button is clickable after entering mobile number 
	

	@FindBy(xpath="//span[@class='icon-ic_arrow_forward']")
        WebElement login_arrow_two; // this button is clickable after entering otp
	
	@FindBy(xpath="	(//button[contains(@class, 'MuiButton-root') and contains(., 'Book Hospital Visit')])[1]\r\n"
			+ "")
        WebElement book_hospital_after_login; // this button is for after login page for booking doctors
	

	public void delhi_button()
	{
		Button.click();
	}
	
	public void filter() {
		sort_select.click();
	}
	
	
	public void lowhigh() {
		lowhigh.click();
	}
	
	public void book_hospital() {
		BookButton.click();
	}
	
	public void login_page(String nu) {
		login.sendKeys(nu);
		
	}
	
	public void arrow_first() {
		login_arrow_one.click();
		
	}
	
	public void arrow_second() {
		login_arrow_two.click();
	}
	
	public void book_hospital_final() {
		book_hospital_after_login.click();  //this is for entering time for booking and payment
	}
	public DoctorsPage() throws IOException
    {
        PageFactory.initElements(driver, this);
    
    }
	 public void captureScreenshot() throws Exception {

	        Date currentDate = new Date();
	        String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File binaryFile = ts.getScreenshotAs(OutputType.FILE);

	        //Make sure screenshots folder is already created at the project level
	        File imageFile = new File(screenshotsPath + screenshotFileName + ".png"); 
	        FileUtils.copyFile(binaryFile, imageFile);


	    }



}


