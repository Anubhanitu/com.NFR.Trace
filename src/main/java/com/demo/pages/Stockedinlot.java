package com.demo.pages;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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


public class Stockedinlot {
	public WebDriver driver;
	public WebActionUtil actionutil;
	public long eto = 30;
	int randomNumber = new Random().nextInt(1000);
	String randomValue;
	String emailaddress = randomNumber + "@yopmail.com";
    


	public Stockedinlot(WebDriver driver, long eto, WebActionUtil actionutil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionutil = actionutil;
		this.eto = eto;
}
	
	/* X-path for Inventory Mgmt */
	@FindBy(xpath = "//*[@id='root']/div/div[5]/aside/div/ul/li[4]/div/span")
	private WebElement inventorymgmt;
	
	/* X-path for Stocked In Lot Details */
	@FindBy(xpath = "//span[text()='Stocked In Lot Details']")
	private WebElement stockdetail;
	
	/* X-path for All Product Radio */
	@FindBy(xpath = "//label[contains(@for,'allproduct')]")
	private WebElement allradio;
	
	/* X-path for Shared Product Radio */
	@FindBy(xpath = "//label[@for='sharedproduct']")
	private WebElement sharedradio;
	
	/* X-path for Own Product Radio */
	@FindBy(xpath = "//label[@for='ownproduct']")
	private WebElement ownradio;
	
	/* X-path for Expiry From */
	@FindBy(xpath = "*//div[3]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//input[1]")
	private WebElement expiryfrom;
	
	/* X-path for Shared button */
	@FindBy(xpath = "//tr[3]/td[2]/div[1]")
	private WebElement expirydatefrom;
	
	/* X-path for Expiry From date */
	@FindBy(xpath = "*//div[3]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//input[1]")
	private WebElement expirydate;
	
	/* X-path for next button */
	@FindBy(xpath = "*//div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[4]/span[1]")
	private WebElement nextbutton;
	
	/* X-path for Expiry To */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
	private WebElement expiryto;
	
	/* X-path for Shared button */
	@FindBy(xpath = "*//div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[3]/div[1]")
	private WebElement expirydateto;
	
	/* X-path for search button */
	@FindBy(xpath = "//button[@id='MICROTIP_INFLOW_SEARCH_BUTTON']")
	private WebElement search;
	
	/* X-path for clear all button */
	@FindBy(xpath = "//button[@id='add_transactions_clear_all_button']")
	private WebElement clearall;
	
	/* X-path for Browse button */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	private WebElement lotcheckbox;

	/* X-path for Initiate Import */
	@FindBy(xpath = "//input[@id='prod_id_']")
	private WebElement pid;
	
	/* X-path for okay */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/p[1]/span[1]")
	private WebElement prosearch ;
	
	/* X-path for Download error file */
	@FindBy(xpath = "//input[@id='location']")
	private WebElement location;
	
	/* X-path for Success file */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/ul[1]/li[1]/p[1]/p[1]")
	private WebElement locsearch;
	
	
	
	public void stockeddetail() throws InterruptedException
	 {
		Thread.sleep(8000);
		actionutil.clickOnElement(inventorymgmt, "click on IM");
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stockdetail);
		 actionutil.clickOnElement(stockdetail, "Stocked in lot detail is clicked");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(allradio, "All radio button is clicked");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(sharedradio, "Shared radio button is clicked");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(ownradio, "Own radio button is clicked");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(ownradio, "Own radio button is clicked");
		 actionutil.clickOnElement(expiryfrom, "Expiry From date is clicked");
		 actionutil.clickOnElement(expirydatefrom, "Expiry date is selected");
		 actionutil.clickOnElement(expiryto, "Expiry to is clicked");
		 actionutil.clickOnElement(nextbutton, "Next button icon is clicked");
		 actionutil.clickOnElement(expirydateto, "Expiry date to is selected");
		 actionutil.clickOnElement(search, "Search CTA is clicked");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(clearall, "Clear All CTA is clicked");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(lotcheckbox, "Lot Checkbox CTA is clicked");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(pid, "Product ID is clicked");
		 actionutil.typeText(pid,"F2PG10000737", "Enter the LGTIN");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(prosearch, "Product is selected");
		 actionutil.clickOnElement(location, "Location is clicked");
		 actionutil.typeText(location,"Surat", "Enter the LGTIN");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(locsearch, "Product is selected");
		 actionutil.clickOnElement(search, "Search CTA is clicked");
		 Thread.sleep(6000);
	 }
}