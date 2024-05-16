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


public class Salesdata {
	public WebDriver driver;
	public WebActionUtil actionutil;
	public long eto = 30;
	int randomNumber = new Random().nextInt(1000);
	String randomValue;
	String emailaddress = randomNumber + "@yopmail.com";
    


	public Salesdata(WebDriver driver, long eto, WebActionUtil actionutil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actionutil = actionutil;
		this.eto = eto;
}
	
	/* X-path for Inventory Mgmt */
	@FindBy(xpath = "//*[@id='root']/div/div[5]/aside/div/ul/li[4]/div/span")
	private WebElement inventorymgmt;
	
	/* X-path for Setupsalesdata */
	@FindBy(xpath = "//span[text()='Setup Sales Data & Lead Time']")
	private WebElement setupsales;
	
	/* X-path for Setupsalesdata */
	@FindBy(xpath = "//span[text()='Sales Data & Lead Time']")
	private WebElement saledata;
	
	/* X-path for adddata */
	@FindBy(xpath = "//h5[@id='EXISTING_SALES_DATA']")
	private WebElement existing;
	
	/* X-path for adddata */
	@FindBy(xpath = "//h5[@id='ADD_SALES_DATA']")
	private WebElement adddata;
	
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
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/form[1]/div[1]/div[3]/ul[1]/li[1]/p[1]/p[1]")
	private WebElement locationsearch;
	
	/* X-path for Product ID */
	@FindBy(xpath = "//input[@id='prod_id_']")
	private WebElement pid ;
	
	/* X-path for product search */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/p[1]/span[2]")
	private WebElement prosearch;
	
	/* X-path for packaging type */
	@FindBy(xpath = "//select[@name='typeOfPackaging']")
	private WebElement pkgtype;
	
	/* X-path for packaging typesearch */
	@FindBy(xpath = "//select[@name='typeOfPackaging']/option[2]")
	private WebElement pkgtypeval;
	
	
	/* X-path for packaging typesearch */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")
	private WebElement maxsales;
	
	
	/* X-path for packaging typesearch */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	private WebElement minsales;
	
	
	/* X-path for packaging typesearch */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]")
	private WebElement avgsales;
	
	
	/* X-path for packaging typesearch */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/input[1]")
	private WebElement maxtime;
	
	
	/* X-path for packaging typesearch */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/input[1]")
	private WebElement mintime;
	
	
	/* X-path for packaging typesearch */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/input[1]")
	private WebElement avgtime;
	
	/* X-path for add */
	@FindBy(xpath = "//button[text()='Add Sales Data']")
	private WebElement addcta;
	
	/* X-path for search */
	@FindBy(xpath = "//button[@id='MICROTIP_INFLOW_SEARCH_BUTTON']")
	private WebElement searchcta;
	
	/* X-path for edit icon */
	@FindBy(xpath = "//span[@id='Table_0_actionedit']//button[@type='button']")
	private WebElement edit;
	
	/* X-path for edit icon */
	@FindBy(xpath = "//div[4]//div[1]//div[1]//input[1]")
	private WebElement maxsaleedit;
	
	/* X-path for edit icon */
	@FindBy(xpath = "//div[8]//div[1]//div[1]//input[1]")
	private WebElement mintimeedit;
	
	/* X-path for edit icon */
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement update;
	
	/* X-path for location search in Existing */
	@FindBy(xpath = "//*[@id='root']/div[1]/div[6]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/p[1]")
	private WebElement locexisting;
	
	public void addsales() throws InterruptedException
	 {
		Thread.sleep(8000);
		actionutil.clickOnElement(inventorymgmt, "click on IM");
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", setupsales);
		 actionutil.clickOnElement(setupsales, "Setupsales data is clicked");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(saledata, "Sales data is clicked");
		 actionutil.clickOnElement(adddata, "Add tab is clicked");
		 actionutil.clickOnElement(location, "Location is clicked");
		 actionutil.typeText(location,"Surat", "enter the location name");
		 actionutil.clickOnElement(locationsearch, "location is selected");
		 actionutil.clickOnElement(pid, "Product is clicked");
		 actionutil.typeText(pid,"F2P", "enter the product name");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(prosearch, "Product is selected");
		 Thread.sleep(4000);
		 actionutil.clickOnElement(pkgtype, "Packaging Type is clicked");
		 actionutil.clickOnElement(pkgtypeval, "Packaging val is selected");
		 actionutil.clickOnElement(maxsales, "Max sales is clicked");
		 actionutil.typeText(maxsales,"40", "enter the Max sale value");
		 actionutil.clickOnElement(minsales, "Min sales is clicked");
		 actionutil.typeText(minsales,"20", "enter the Max sale value");
		 actionutil.clickOnElement(avgsales, "Avg sales is clicked");
		 actionutil.typeText(avgsales,"30", "enter the Max sale value");
		 
		 actionutil.clickOnElement(maxtime, "Max sales is clicked");
		 actionutil.typeText(maxtime,"40", "enter the Max sale value");
		 actionutil.clickOnElement(mintime, "Min sales is clicked");
		 actionutil.typeText(mintime,"20", "enter the Max sale value");
		 actionutil.clickOnElement(avgtime, "Avg sales is clicked");
		 actionutil.typeText(avgtime,"30", "enter the Max sale value");
		 actionutil.clickOnElement(addcta, "CTA is clicked");
		 
		 actionutil.clickOnElement(existing, "Existing Tab is clicked");
		 actionutil.clickOnElement(location, "Location is clicked");
		 actionutil.typeText(location,"Surat", "enter the location name");
		 actionutil.clickOnElement(locexisting, "location is selected");
		 actionutil.clickOnElement(searchcta, "Search is clicked");
		 Thread.sleep(4000);
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", edit);
		 actionutil.clickOnElement(edit, "edit icon  is clicked");
		 Thread.sleep(6000);
		 actionutil.clearText(maxsaleedit,"40");
		 actionutil.typeText(maxsaleedit,"30", "enter the Max sale value");
		 actionutil.clearText(mintimeedit,"20");
		 actionutil.typeText(mintimeedit,"10", "enter the Min time value");
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", update);
		 actionutil.clickOnElement(update, "Update CTA is clicked");
		 Thread.sleep(6000);
	 }
}