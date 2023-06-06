package com.pages;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class OnlineDoctorconsultPage extends Utility{
	
	



public OnlineDoctorconsultPage() throws IOException
{
	PageFactory.initElements(driver, this);
}



public String validateLoginPageTitle()
{
	return driver.getTitle(); 
} 

}



