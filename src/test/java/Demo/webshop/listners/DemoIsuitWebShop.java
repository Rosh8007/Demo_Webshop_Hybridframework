package Demo.webshop.listners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class DemoIsuitWebShop  implements ISuiteListener 
{
  
	public void onStart(ISuite s)
	{
		System.out.println("Before Method");
	}


    public void onfinish(ISuite s)
    {
    	System.out.println("After Method");
    }

}
