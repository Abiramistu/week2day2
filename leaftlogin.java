package week2.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftlogin {
	
	
	
	
		public static void main(String[] args) 
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			WebElement userElement=driver.findElement(By.id("username"));
					userElement.sendKeys("Demosalesmanager");
			
		
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
	WebElement companynameElement=driver.findElement(By.id("createLeadForm_companyName"));
	companynameElement.sendKeys("InfoTech");
	WebElement fnameElement=driver.findElement(By.id("createLeadForm_firstName"));
	fnameElement.sendKeys("Geetha");
	WebElement lnameElement=driver.findElement(By.id("createLeadForm_lastName"));
	lnameElement.sendKeys("Jayakumar");
	
	
	WebElement firstnameLocalElement=driver.findElement(By.id("createLeadForm_firstNameLocal"));
	firstnameLocalElement.sendKeys("Geetha");

	
	WebElement descriptionElement=driver.findElement(By.id("createLeadForm_description"));
	descriptionElement.sendKeys("Creating a new lead");
	
	WebElement departmentElement=driver.findElement(By.id("createLeadForm_departmentName"));
	departmentElement.sendKeys("Test Team");
	
	WebElement emailElement=driver.findElement(By.id("createLeadForm_primaryEmail"));
	emailElement.sendKeys("gayashree.243@gmail.com");
	

	WebElement elementStateDropDown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dropdown=new Select(elementStateDropDown);
	dropdown.selectByVisibleText("New York");
	
	
	driver.findElement(By.name("submitButton")).click();
	
	System.out.println("The title is "+driver.getTitle());
	
	
	if(driver.getTitle().contains("Testleaf"))
	{
		System.out.println("I confirm the title has Testleaf");
				
	}
	
	else	
	
		System.out.println("The title doesn't have the word Testleaf");
	
	
	
		}

		
}