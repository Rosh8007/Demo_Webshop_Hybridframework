package Demo.webshop.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment {

	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/input")
	WebElement  c1;

	@FindBy(xpath = "//*[@id=\"shipping-buttons-container\"]/input")
	WebElement c2;

	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/input")
	WebElement c3;

	@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
	WebElement c4;

	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement c5;

	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	WebElement c6;

	public Payment(WebDriver driver) 
	{
		this.driver=driver;

	}
	public void click() throws InterruptedException {
		Thread.sleep(2000);
		c1.click();
		Thread.sleep(2000);
		c2.click();
		Thread.sleep(2000);
		c3.click();
		Thread.sleep(2000);
		c4.click();
		Thread.sleep(2000);
		c5.click();
		Thread.sleep(2000);
		c6.click();
	}
}
