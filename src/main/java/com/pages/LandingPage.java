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

public class LandingPage extends Utility {

	@FindBy(xpath = "//*[text()='Consult']")
	private WebElement Consult;
	// For Online Doctor Consultation page textElement

	@FindBy(xpath = "//*[text()='Online Doctor Consultation'][1]")
	WebElement textElement;

	// For popup Notification close

	@FindBy(xpath = "//*[@id='wzrk-cancel']")
	private WebElement notification_close;

	public LandingPage() throws IOException {
		PageFactory.initElements(driver, this);

	}

	public OnlineDoctorconsultPage OnlineDoctorconsultPageNavigation() throws IOException {
		Consult.click();
		return new OnlineDoctorconsultPage();
	}

	public void notification_close() {
		notification_close.click();
	}

	public String validateLandingPageTitle() {
		return driver.getTitle();
	}

	public String textCapture() {
		return textElement.getText();

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
