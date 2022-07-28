package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.base;
import Page_Objectory.homepageObject;


public class Testcasesvalidations extends base{
	
	private static Logger log=LogManager.getLogger(Testcasesvalidations.class.getName());

	
	@BeforeClass
	public void setup()
	{
		driverintinlization();
		log.info("browser open suucessfully");
	}
	
	
	
	//failtest
	@Test
	public void Homeclick(){
		
		homepageObject home= new homepageObject(driver);
		home.interactionsclick().click();
		log.info("interaction page is opend now ");
		
	}
	

}



