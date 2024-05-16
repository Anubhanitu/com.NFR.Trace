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


public class Stockout {
	public WebDriver driver;
	public WebActionUtil actionutil;
	public long eto = 30;
	int randomNumber = new Random().nextInt(1000);
	String randomValue;
	String emailaddress = randomNumber + "@yopmail.com";
    


	public Stockout(WebDriver driver, long eto, WebActionUtil actionutil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionutil = actionutil;
		this.eto = eto;
}
	
	/* X-path for Inventory Mgmt */
	@FindBy(xpath = "//*[@id='root']/div/div[5]/aside/div/ul/li[4]/div/span")
	private WebElement inventorymgmt;
	
	/* X-path for Stock IN */
	@FindBy(xpath = "//span[text()='Stock Out']")
	private WebElement stockout;
	
	/* X-path for Existing tab*/
	@FindBy(xpath = "//h5[@id='EXISTING_STOCK_OUT']")
	private WebElement existingtab;
	
	/* X-path for Add New*/
	@FindBy(xpath = "//h5[@id='ADD_STOCK_OUT']")
	private WebElement addtab;
	
	/* X-path for Location */
	@FindBy(xpath = "//input[@id='location']")
	private WebElement location;

	/* X-path for location search */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/p[1]")
	private WebElement locationsearch;
	
	/* X-path for Purpose of Stock Out */
	@FindBy(xpath = "//input[@placeholder='Select']")
	private WebElement purpose ;
	
	/* X-path for dropdown Customer */
	@FindBy(xpath = "//div[contains(text(),'Sales-Customer')]")
	private WebElement customer;
	
	/* X-path for Customer Name */
	@FindBy(xpath = "//input[@name='customerName']")
	private WebElement cname;
	
	/* X-path for Country Code */
	@FindBy(xpath = "//input[@placeholder='Search Here']")
	private WebElement ctycode;
	
	/* X-path for Country Code cross icon */
	@FindBy(xpath = "//*[name()='path' and @id='Stroke_430']")
	private WebElement cross;
	
	/* X-path for Country Code cross icon */
	@FindBy(xpath = "//div[normalize-space()='India']")
	private WebElement country;
	
	/* X-path for Mobile No. */
	@FindBy(xpath = "//input[@name='mobileNumber']")
	private WebElement mobileno;
	
	
	/* X-path for Billing ID*/
	@FindBy(xpath = "//input[@name='billingID']")
	private WebElement billid;
	
	/* X-path for Capacity name*/
	@FindBy(xpath = "//input[@placeholder='Search and Select']")
	private WebElement capname;

	
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
	@FindBy(xpath = "//input[@name='lgtin']")
	private WebElement lgtin;
	
	/* X-path for Search Button */
	@FindBy(xpath = "//button[@id='MICROTIP_INFLOW_SEARCH_BUTTON']")
	private WebElement search;
	
	/* X-path for view icon */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/button[1]")
	private WebElement view;
	
	/* X-path for Go back button */
	@FindBy(xpath = "//div[@type='button']")
	private WebElement goback;
	
	/* X-path for delete */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/button[2]")
	//@FindBy(xpath = "//div[contains(@class,'MuiDataGrid-row Mui-hovered')]//button[contains(@title,'Delete')]//*[name()='svg']")
	private WebElement delete;
	
	
	/* X-path for yes */
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yescta;
	
	/* X-path for pagination */
	@FindBy(xpath = "//a[@aria-label='Go to page number 1']")
	private WebElement page;
	
	public void addstockout() throws InterruptedException
	 {
		Thread.sleep(8000);
		actionutil.clickOnElement(inventorymgmt, "click on IM");
		Thread.sleep(4000);
		 actionutil.clickOnElement(stockout, "Stock Out  is clicked");
		 Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		actionutil.clickOnElement(addtab, "Add Stock In  is clicked");
		 actionutil.clickOnElement(location, "Location is clicked");
		 actionutil.typeText(location,"Surat", "enter the location name");
		 actionutil.clickOnElement(locationsearch, "location is selected");
		 
		 actionutil.clickOnElement(purpose, "Purpose of Stock Out is clicked");
		 actionutil.clickOnElement(customer, "Sales Customer is selected");
		 actionutil.clickOnElement(cname, "Click on Customer Name");
		 actionutil.typeText(cname,"Test", "Enter the Customer name");
		 actionutil.clickOnElement(ctycode, "Click on Country code");
		 actionutil.clickOnElement(cross, "Click on Cross icon");
		 actionutil.clickOnElement(ctycode, "Click on Country code");
		 actionutil.typeText(ctycode,"91", "Enter the code");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(country, "Select India");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(mobileno, "Click on Mobile number");
		 actionutil.typeText(mobileno,"9898336763", "Enter the mobile number");
		 actionutil.clickOnElement(billid, "Click on Billing ID");
		 actionutil.typeText(billid,"6763", "Enter the Bill Id");
		 actionutil.clickOnElement(capname, "Capacity Name is clicked");
		 actionutil.typeText(capname,"Bay 1", "Enter the cap name");
		 actionutil.clickOnElement(nonslotcap, "Capacity Name is selected");
		 actionutil.clickOnElement(lgtin, "Click on LGTIN");
		 actionutil.typeText(lgtin,"11016052410000003", "Enter the LGTIN");
		 Thread.sleep(4000);
		 
		 //Code for slot type
		 
		 actionutil.clickOnElement(capname, "Capacity Name is clicked");
		 actionutil.clearText(capname,"Bay 1");
		 Thread.sleep(4000);
		 //actionutil.clickOnElement(capname, "Capacity Name is clicked");
		 actionutil.typeText(capname,"Bay 2", "Enter the cap name");
		 actionutil.clickOnElement(slotcap, "Capacity Name is selected");
		 actionutil.clickOnElement(lgtin, "Click on LGTIN");
		 actionutil.typeText(lgtin,"11016052410000002", "Enter the LGTIN");
		 Thread.sleep(4000);
		 
		 //code for pallet type
		 
		 actionutil.clickOnElement(capname, "Capacity Name is clicked");
		 actionutil.clearText(capname,"Bay 2");
		 Thread.sleep(4000);
		 //actionutil.clickOnElement(capname, "Capacity Name is clicked");
		 actionutil.typeText(capname,"Bay 5", "Enter the cap name");
		 actionutil.clickOnElement(palletcap, "Capacity Name is selected");
		 Thread.sleep(4000);
		 //actionutil.typeText(capacityname, randomValue, "Enter the capacity number");
		 actionutil.clickOnElement(lgtin, "Click on LGTIN");
		 actionutil.typeText(lgtin,"11016052410000001", "Enter the LGTIN");
		 Thread.sleep(6000);
		 actionutil.clickOnElement(existingtab, "Existing Stock Out  is clicked");
		 Thread.sleep(6000);
		 actionutil.clickOnElement(search, "Search  is clicked");
		 //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", view);

		 Thread.sleep(4000);
		 actionutil.clickOnElement(view, "View icon  is clicked");
		 Thread.sleep(6000);
		 actionutil.clickOnElement(goback, "Go Back  is clicked");
		 actionutil.clickOnElement(search, "Search  is clicked");
		 /*Thread.sleep(4000);
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page);

		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", delete);
		 Thread.sleep(4000);
		 actionutil.clickOnElement(delete, "Delete icon  is clicked");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(yescta, "Yes CTA  is clicked");*/
		 Thread.sleep(6000);
	 }
	}