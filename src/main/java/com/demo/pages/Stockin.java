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


public class Stockin {
	public WebDriver driver;
	public WebActionUtil actionutil;
	public long eto = 30;
	int randomNumber = new Random().nextInt(1000);
	String randomValue;
	String emailaddress = randomNumber + "@yopmail.com";
    


	public Stockin(WebDriver driver, long eto, WebActionUtil actionutil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionutil = actionutil;
		this.eto = eto;
}
	
	/* X-path for Inventory Mgmt */
	@FindBy(xpath = "//*[@id='root']/div/div[5]/aside/div/ul/li[4]/div/span")
	private WebElement inventorymgmt;
	
	/* X-path for Stock IN */
	@FindBy(xpath = "//span[text()='Stock In']")
	private WebElement stockin;
	
	/* X-path for Existing tab*/
	@FindBy(xpath = "//h5[@id='EXISTING_STOCK_IN']")
	private WebElement existingtab;
	
	/* X-path for Add New*/
	@FindBy(xpath = "//h5[@id='ADD_STOCK_IN']")
	private WebElement addtab;
	
	/* X-path for Location */
	@FindBy(xpath = "//input[@id='location']")
	private WebElement location;

	/* X-path for location search */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/p[1]/p[1]")
	private WebElement locationsearch;
	
	/* X-path for Inventory Update */
	@FindBy(xpath = "//*[@id='root']/div/div[6]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement inventoryupdate;
	
	/* X-path for Good Stock */
	@FindBy(xpath = "//div[contains(text(),'Good Stock')]")
	private WebElement goodstock;
	
	/* X-path for Capacity type*/
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement capacitytype;
	
	/* X-path for Capacity type*/
	@FindBy(xpath = "//div[contains(text(),'Non Slot/Non Pallet Type')]")
	private WebElement nonslot;
	
	
	/* X-path for slot */
	@FindBy(xpath = "//div[contains(text(),'Slot Type')]")
	private WebElement slot;
	
	/* X-path for pallet */
	@FindBy(xpath = "//div[contains(text(),'Pallet Type')]")
	private WebElement pallettype;
	
	
	/* X-path for capacity name */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[3]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement capacityname;
	
	/* X-path for Bay 1 */
	@FindBy(xpath = "//div[contains(text(),'Bay 1')]")
	private WebElement nonslotcap;
	
	/* X-path for Bay 2 */
	@FindBy(xpath = "//div[contains(text(),'Bay 2')]")
	private WebElement slotcap;
	
	/* X-path for Bay 5 */
	@FindBy(xpath = "//div[contains(text(),'Bay 5')]")
	private WebElement palletcap;
	
	/* X-path for LGTIN */
	@FindBy(xpath = "//input[contains(@placeholder,'Enter here')]")
	private WebElement lgtin;
	
	/* X-path for view icon */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/span[1]/button[1]")
	private WebElement view;
	
	/* X-path for Go back button */
	@FindBy(xpath = "//div[@type='button']")
	private WebElement goback;
	
	/* X-path for delete */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/span[1]/button[2]")
	private WebElement delete;
	
	/* X-path for yes */
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yescta;
	
	public void addstockin() throws InterruptedException
	 {
		Thread.sleep(8000);
		actionutil.clickOnElement(inventorymgmt, "click on IM");
		Thread.sleep(4000);
		 actionutil.clickOnElement(stockin, "Stock In  is clicked");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(addtab, "Add Stock In  is clicked");
		 actionutil.clickOnElement(location, "Location is clicked");
		 actionutil.typeText(location,"Surat", "enter the location name");
		 actionutil.clickOnElement(locationsearch, "location is selected");
		 
		 actionutil.clickOnElement(inventoryupdate, "Inventory Update is clicked");
		 actionutil.clickOnElement(goodstock, "Good Stock is selected");
		 actionutil.clickOnElement(capacitytype, "Click on Capacity Type");
		 actionutil.clickOnElement(nonslot, "Non Slot is selected");
		 actionutil.clickOnElement(capacityname, "Capacity Name is clicked");
		 actionutil.typeText(capacityname,"Bay", "Enter the cap name");
		 Thread.sleep(5000);
		 actionutil.clickOnElement(nonslotcap, "Click on Non Slot cap");
		 Thread.sleep(4000);
		 //actionutil.typeText(capacityname, randomValue, "Enter the capacity number");
		 actionutil.clickOnElement(lgtin, "Click on LGTIN");
		 actionutil.typeText(lgtin,"11016052410000003", "Enter the LGTIN");
		 Thread.sleep(4000);
		 
		 //Code for slot type
		 
		 actionutil.clickOnElement(capacitytype, "Click on Capacity Type");
		 actionutil.clickOnElement(slot, "Slot is selected");
		 actionutil.clickOnElement(capacityname, "Capacity Name is clicked");
		 actionutil.typeText(capacityname,"Bay", "Enter the cap name");
		 Thread.sleep(5000);
		 actionutil.clickOnElement(slotcap, "Click on Non Slot cap");
		 Thread.sleep(4000);
		 //actionutil.typeText(capacityname, randomValue, "Enter the capacity number");
		 actionutil.clickOnElement(lgtin, "Click on LGTIN");
		 actionutil.typeText(lgtin,"11016052410000002", "Enter the LGTIN");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(lgtin, "Click on LGTIN");
		 actionutil.typeText(lgtin,"21016052410000004", "Enter the LGTIN");
		 Thread.sleep(4000);
		 
		 //code for pallet type
		 
		 actionutil.clickOnElement(capacitytype, "Click on Capacity Type");
		 actionutil.clickOnElement(pallettype, "Pallet type is selected");
		 actionutil.clickOnElement(capacityname, "Capacity Name is clicked");
		 actionutil.typeText(capacityname,"Bay", "Enter the cap name");
		 Thread.sleep(5000);
		 actionutil.clickOnElement(palletcap, "Click on Non Slot cap");
		 Thread.sleep(4000);
		 //actionutil.typeText(capacityname, randomValue, "Enter the capacity number");
		 actionutil.clickOnElement(lgtin, "Click on LGTIN");
		 actionutil.typeText(lgtin,"11016052410000001", "Enter the LGTIN");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(lgtin, "Click on LGTIN");
		 actionutil.typeText(lgtin,"11006052410000024", "Enter the LGTIN");
		 Thread.sleep(6000);
		 actionutil.clickOnElement(existingtab, "Existing Stock In  is clicked");
		 Thread.sleep(6000);
		 actionutil.clickOnElement(view, "View icon  is clicked");
		 Thread.sleep(6000);
		 actionutil.clickOnElement(goback, "Go Back  is clicked");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(delete, "Delete icon  is clicked");
		 actionutil.clickOnElement(yescta, "Yes CTA  is clicked");
		 Thread.sleep(6000);
	 }
	}
