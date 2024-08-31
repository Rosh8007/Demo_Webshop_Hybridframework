package Demo.webshop.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Demo.webshop.Commons.Commons;

public class RegisterDemo {

	WebDriver driver;


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement register;

	@FindBy(css = "[id=\"gender-male\"]")
	WebElement gendermale;

	@FindBy(xpath = "//*[@id=\"FirstName\"]")
	WebElement firstname;


	@FindBy(name="LastName")
	WebElement lastnmae;

	@FindBy(name = "Email")
	WebElement email;

	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement pass;


	@FindBy(xpath="//*[@id=\"ConfirmPassword\"]" )
	WebElement conpas;
	@FindBy(xpath = "//*[@id=\"register-button\"]")
	WebElement registerButton;

	public RegisterDemo(WebDriver driver) throws IOException 
	{
		this.driver=driver;
		Commons. fi=new FileInputStream("src//test//resources//Excel//Registerondemowebshop.xlsx");
		Commons. wb=new XSSFWorkbook(Commons. fi);
		Commons. sh=Commons. wb.getSheet("Sheet1");
		Commons. ro=Commons. sh.getRow(0);


	}
	public void RegisteDem() throws IOException, InterruptedException 
	{

		String fn=Commons.getFirstName();
		String  ln =Commons.getlastName();
		String em =Commons.getEmail();
		String   pas = Commons.getPassWord();
		String  conpass= Commons.getconfPassWord();



		register.click();
		Thread.sleep(2000);
		gendermale.click();
		Thread.sleep(2000);
		firstname.sendKeys(fn);
		Thread.sleep(2000);
		lastnmae.sendKeys(ln);
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		pass.sendKeys(pas);
		Thread.sleep(2000);
		conpas.sendKeys(conpass);
		Thread.sleep(2000);
		registerButton.click();


		//	TakesScreenshot ts=(TakesScreenshot)driver;
		//	File source	=ts.getScreenshotAs(OutputType.FILE);
		//	File des=new File("src//test//resources//Screenshot//Screen.JPG");
		//	FileUtils.copyDirectory(des, source);
		//	

		//	File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//	FileUtils.copyFileToDirectory(src1, new File("src//test//resources//Screenshot"));
	}
}
