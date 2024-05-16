package com.demo.baseutil;

import org.openqa.selenium.WebDriver;

import com.demo.pages.Currentstock;
import com.demo.pages.Importsales;
import com.demo.pages.Inventorycapacity;
import com.demo.pages.Inventoryquotation;
import com.demo.pages.Salesdata;
import com.demo.pages.Stockedinlot;
import com.demo.pages.Stockin;
import com.demo.pages.Stockout;
import com.demo.pages.Tracelogin;
import com.demo.pages.Tracelogin2;
import com.demo.pages.Tracesigninpage;
import com.demo.pages.Tracesignuppage;
import com.demo.pages.Tracelogout;

import com.demo.util.WebActionUtil;
import com.demo.mail.Gmail;

/**
 * Description: Initializes all pages with driver instance ,Explicit Time out,
 * WebAactionUtility using variables driver,ETO,WebactionUtil
 *
 * @author : Deepti jindal
 */
public class Initializepages extends Basetest2 {

	public Tracesigninpage signinpage;
	public Tracelogin loginpage;
	public Tracelogout logout;
	public Tracelogin2 loginpage2;
	public Tracesignuppage signup;
	public Inventoryquotation quotationpage;
	public Inventorycapacity inventorypage;
	public Stockin stockinpage;
	public Stockout stockoutpage;
	public Currentstock currentpage;
	public Salesdata salespage;
	public Importsales importsalespage;
	public Stockedinlot stockdetailpage;
	
	
	public Initializepages(WebDriver driver, long eto, WebActionUtil actionutil) {

		signinpage = new Tracesigninpage(driver, eto, actionutil);
		loginpage = new Tracelogin(driver, eto, actionutil);
		loginpage2 = new Tracelogin2(driver, eto, actionutil);
		logout = new Tracelogout(driver, eto, actionutil);
		signup= new Tracesignuppage(driver, eto,actionutil);
		inventorypage = new Inventorycapacity(driver, eto,actionutil);
		quotationpage = new Inventoryquotation(driver, eto,actionutil);
		stockinpage = new Stockin(driver, eto,actionutil);
		stockoutpage = new Stockout(driver, eto,actionutil);
		currentpage = new Currentstock(driver, eto,actionutil);
		salespage = new Salesdata(driver, eto,actionutil);
		importsalespage = new Importsales(driver, eto,actionutil);
		stockdetailpage = new Stockedinlot(driver, eto,actionutil);
		
	}

}
