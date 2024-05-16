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


public class Importsales {
	public WebDriver driver;
	public WebActionUtil actionutil;
	public long eto = 30;
	int randomNumber = new Random().nextInt(1000);
	String randomValue;
	String emailaddress = randomNumber + "@yopmail.com";
    


	public Importsales(WebDriver driver, long eto, WebActionUtil actionutil) {
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
	
	/* X-path for salesdata */
	@FindBy(xpath = "//span[text()='Sales Data & Lead Time']")
	private WebElement saledata;
	
	/* X-path for existing data */
	@FindBy(xpath = "//h5[@id='EXISTING_SALES_DATA']")
	private WebElement existing;
	
	/* X-path for adddata */
	@FindBy(xpath = "//h5[@id='IMPORT_BULK_SALES_DATA']")
	private WebElement bulkupload;
	
	/* X-path for Shared button */
	@FindBy(xpath = "//u[text()='instructions']")
	private WebElement instruction;
	
	/* X-path for download button */
	@FindBy(xpath = "//h6[text()='Download Sample File Here']")
	private WebElement download;
	
	/* X-path for Browse button */
	@FindBy(xpath = "//button[text()='Browse File']")
	private WebElement browse;

	/* X-path for Initiate Import */
	@FindBy(xpath = "//button[text()='Initiate Import']")
	private WebElement initiate;
	
	/* X-path for okay */
	@FindBy(xpath = "//button[text()='Okay']")
	private WebElement okaycta ;
	
	/* X-path for Download error file */
	@FindBy(xpath = "//span[text()='Download Errors']")
	private WebElement downloaderr;
	
	/* X-path for Success file */
	@FindBy(xpath = "//span[text()=' Success Records']")
	private WebElement success;
	
	/* X-path for Upload again */
	@FindBy(xpath = "//span[text()='Upload File Again']")
	private WebElement againup;
	
	/* X-path for Warning */
	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement confirm;
	
	
	public void bulksales() throws InterruptedException
	 {
		Thread.sleep(8000);
		actionutil.clickOnElement(inventorymgmt, "click on IM");
		String tab1Handle = driver.getWindowHandle();
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", setupsales);
		 actionutil.clickOnElement(setupsales, "Setupsales data is clicked");
		 Thread.sleep(2000);
		 actionutil.clickOnElement(saledata, "Sales data is clicked");
		 actionutil.clickOnElement(bulkupload, "Bulk Upload tab is clicked");
		 actionutil.clickOnElement(instruction, "Instruction link is clicked");
		 Thread.sleep(7000);
		 actionutil.switchToOriginalTab(tab1Handle);
		 Thread.sleep(4000);
		 actionutil.clickOnElement(download, "Download CTA is clicked");
		 actionutil.clickOnElement(browse, "browse CTA is clicked");
		 try {
	            Robot robot = new Robot();
	            // Type the file path (replace "file_path" with the actual path of the file)
	            StringSelection selection = new StringSelection("C:\\Users\\Admin\\Downloads\\sample-sales-bulk-upload Auto.xlsx");
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	        } 
		   catch (Exception e) {
	            e.printStackTrace();
	        }
		 Thread.sleep(2000); 
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", initiate);
		 actionutil.clickOnElement(initiate, "Initiate CTA is clicked");
		 actionutil.clickOnElement(okaycta, "Okay CTA is clicked");
		 actionutil.clickOnElement(downloaderr, "Error is clicked");
		 actionutil.clickOnElement(success, "Success CTA is clicked");
		 actionutil.clickOnElement(againup, "Upload againg CTA is clicked");
		 actionutil.clickOnElement(confirm, "Confirm CTA is clicked");
		 
	 }
}