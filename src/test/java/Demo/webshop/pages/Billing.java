package Demo.webshop.pages;




import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Demo.webshop.Commons.Commons;





public class Billing {

	Properties pro=new  Properties();
	

	WebDriver driver;
	@FindBy(name="BillingNewAddress.FirstName")
	WebElement firstname;
	@FindBy(name="BillingNewAddress.LastName")
	WebElement lastname;
	@FindBy(name="BillingNewAddress.Email")
	WebElement email;
	@FindBy( name="BillingNewAddress.Company")
	WebElement company;
	@FindBy(name="BillingNewAddress.CountryId")
	WebElement countryid;
	@FindBy(name="BillingNewAddress.StateProvinceId")
	WebElement state;
	@FindBy(name="BillingNewAddress.City")
	WebElement city;
	@FindBy(name="BillingNewAddress.Address1")
	WebElement addr1;
	@FindBy(name="BillingNewAddress.Address2")
	WebElement addr2;
	@FindBy(name="BillingNewAddress.ZipPostalCode")
	WebElement zip;
	@FindBy(name="BillingNewAddress.PhoneNumber")
	WebElement phone;
	@FindBy(name="BillingNewAddress.FaxNumber")
	WebElement faxno;

	public Billing(WebDriver driver) throws IOException 
	{
		this.driver=driver;
		Commons.fi=new FileInputStream("src//test//resources//Properties//Billing.properties");
		pro.load(Commons.fi);
	}

	public void bill() throws IOException, InterruptedException 
	{
		//		String fn=Common.FirsnameM();
		//		
		//		String ln=Common.LastnameM();
		//	
		//
		//		String   em=Common.EmailM();


		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//		Thread.sleep(1000);
		//		firstname.sendKeys(fn);
		//		Thread.sleep(1000);
		//		lastname.sendKeys(ln);
		//		Thread.sleep(1000);
		//		email.sendKeys(em);


        company.sendKeys(pro.getProperty("company"));
		Thread.sleep(1000);
		countryid.sendKeys(pro.getProperty("country"));
		Thread.sleep(1000);
		state.sendKeys(pro.getProperty("state"));
		Thread.sleep(1000);
		city.sendKeys(pro.getProperty("city"));
		Thread.sleep(1000);
		addr1.sendKeys(pro.getProperty("add1"));
		Thread.sleep(1000);
		addr2.sendKeys(pro.getProperty("add2"));
		Thread.sleep(1000);
		zip.sendKeys(pro.getProperty("zip"));
		Thread.sleep(1000);
		phone.sendKeys(pro.getProperty("phone"));
		Thread.sleep(1000);
		faxno.sendKeys(pro.getProperty("fax"));


	}


}
