package com.utility;

import org.openqa.selenium.WebDriver;

public class Config {

	public static WebDriver driver;
	
	public static String projectPath = System.getProperty("user.dir");
	
	public static String chromeDriverPath = projectPath + "\\drivers\\chromedriver.exe";
	public static String geckoDriverPath = projectPath + "\\drivers\\geckodriver.exe";
	
	public static String screenshotsPath = projectPath + "\\screenshots\\";
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	
			
	
	
}
