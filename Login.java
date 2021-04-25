package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		/*WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();*/
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
		
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nachimuthu");
	   
	   WebElement sourceDrpdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	   
	   Select drpdown1= new Select (sourceDrpdown);
	   
	  drpdown1.selectByVisibleText("Partner");
	  
	  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pavithra");
	  
	  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("N");
	  
	  driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
	  
	  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/10/1994");
	  
	  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
	  
	  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4L");
	  
	  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QE");
	  
	  WebElement industryDrpdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
	  
	  Select drpdown2 = new Select (industryDrpdown);
	  
	  drpdown2.selectByVisibleText("Computer Software");
	  
	  WebElement ownerDrpdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	  
	  Select drpdown3 = new Select (ownerDrpdown);
	  
	  drpdown3.selectByVisibleText("Public Corporation");
	 
	  WebElement currencyDrpdown = driver.findElement(By.id("createLeadForm_currencyUomId"));
	  
	  Select drpdown4 = new Select (currencyDrpdown);

	  drpdown4.selectByVisibleText("INR - Indian Rupee");
	  
	  driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
	  
	  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("150");
	  
	  driver.findElement(By.id("createLeadForm_description")).sendKeys("NA");
	  
	  driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("NA");
	  
	  //createLeadForm_primaryPhoneCountryCode
	  
	  driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("yes");
	  
	  driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
	  
	  
	  
	  driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600077");
	  driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
	  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pavithranachimuthuu@gmail.com");
	  
	  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
	  driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Pavithra");
	  driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.xyz.com");
	  //createLeadForm_generalToName
	  
	  
	  driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("044");
	  driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("pavithranachimuthuu@gmail.com");
	  
	  driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("1234567890");
	  driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Pavithra");
	  driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	  
	  driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("1234567890");
	  driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("Pavithra");
	 
	  WebElement stateDrpdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	  
	  Select drpdown5 = new Select (stateDrpdown);
	  
	  drpdown5.selectByVisibleText("Alaska");
	  
	  WebElement countryDrpdown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	  
	  Select drpdown6 = new Select (countryDrpdown);
	  
	  drpdown6.selectByVisibleText("American Samoa");

	   driver.findElement(By.className("smallSubmit")).click();
	   
	   driver.findElement(By.linkText("Duplicate Lead")).click();
	   
	   driver.findElement(By.id("createLeadForm_companyName")).clear();
	   
	  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
	  
	  String text1= driver.findElement(By.id("createLeadForm_companyName")).getText();
	  
	  System.out.println(text1.replaceAll("[^0-9]", ""));
	   
	  driver.findElement(By.className("smallSubmit")).click();
	  
	  String companyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	  
	  System.out.println(companyname);
	  
	  String text2=companyname.replaceAll("[^0-9]", "");
	  
	  System.out.println(text2);
	  
	  if(text1==text2)
	  {
		  
		 System.out.println("Pass");
		 
	  }
		
	  driver.close();
	  
	}
}


