package com.demo.pages;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demo.baseutil.Basetest;
import com.demo.util.WebActionUtil;


public class Currentstock {
	public WebDriver driver;
	public WebActionUtil actionutil;
	public long eto = 30;
	int randomNumber = new Random().nextInt(1000);
	String randomValue;
	String emailaddress = randomNumber + "@yopmail.com";
    


	public Currentstock(WebDriver driver, long eto, WebActionUtil actionutil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionutil = actionutil;
		this.eto = eto;
}
	
	/* X-path for Inventory Mgmt */
	@FindBy(xpath = "//*[@id='root']/div/div[5]/aside/div/ul/li[4]/div/span")
	private WebElement inventorymgmt;
	
	/* X-path for Stock IN */
	@FindBy(xpath = "//span[text()='Current Stock Status']")
	private WebElement currstatus;
	
	/* X-path for Shared button */
	@FindBy(xpath = "//label[@for='sharedproduct']")
	private WebElement sharedradio;
	
	/* X-path for own button */
	@FindBy(xpath = "//label[@for='ownproduct']")
	private WebElement ownradio;
	
	/* X-path for Location */
	@FindBy(xpath = "//input[@id='location']")
	private WebElement location;

	/* X-path for location search */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/p[1]/p[1]")
	private WebElement locationsearch;
	
	/* X-path for Product ID */
	@FindBy(xpath = "//input[@id='prod_id_']")
	private WebElement pid ;
	
	/* X-path for product search */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[1]/p[1]/span[1]")
	private WebElement prosearch;
	
	/* X-path for search */
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement search;
	
	
	
	/* X-path for view icon */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[11]/span[1]/button[1]")
	private WebElement view;
	
	
	public void currentstatus() throws InterruptedException
	 {
		Thread.sleep(8000);
		actionutil.clickOnElement(inventorymgmt, "click on IM");
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", currstatus);
		 actionutil.clickOnElement(currstatus, "Current Stock Status is clicked");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(location, "Location is clicked");
		 actionutil.typeText(location,"Surat", "enter the location name");
		 actionutil.clickOnElement(locationsearch, "location is selected");
		 actionutil.clickOnElement(pid, "Product is clicked");
		 actionutil.typeText(pid,"F2PG10000737", "enter the product name");
		 actionutil.clickOnElement(prosearch, "Product is selected");
		 actionutil.clickOnElement(search, "Search is clicked");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(sharedradio, "Shared button is clicked");
		 actionutil.clickOnElement(location, "Location is clicked");
		 actionutil.typeText(location,"Surat", "enter the location name");
		 actionutil.clickOnElement(locationsearch, "location is selected");
		 actionutil.clickOnElement(pid, "Product is clicked");
		 actionutil.typeText(pid,"F2PG10000759", "enter the product name");
		 actionutil.clickOnElement(prosearch, "Product is selected");
		 actionutil.clickOnElement(search, "Search is clicked");
		 
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", view);
		 actionutil.clickOnElement(view, "View icon  is clicked");
		 Thread.sleep(6000);
		 String currentURL = driver.getCurrentUrl();

	        // Expected URL
	        String expectedURL = "https://qa.develop.farmtoplateapps.io/stocked-in-lot-details/";

	        // Check if the current URL matches the expected URL
	        if (currentURL.equals(expectedURL)) {
	        	Basetest.logger.info("Url contains https://qa.develop.farmtoplateapps.io/stocked-in-lot-details/");
	        	Basetest.logger.info("URL matched");
	        } else{
	        	Basetest.logger.info("URL not matched");
	        }
	        
		 actionutil.scrollDown();
		 Thread.sleep(6000);
	 }
	}