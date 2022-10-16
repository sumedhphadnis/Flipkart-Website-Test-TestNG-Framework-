package Resources;

import org.testng.asserts.SoftAssert;

public class commonutilities1 {
	public static void HandleAssertions1(String productpriceoutsidecart, String actualcartamount, String actualitemqty, String expecteditemqty, String cartproductname, String productnameoutsidecart ) {
		 SoftAssert assertion=new SoftAssert();
	     assertion.assertEquals(productpriceoutsidecart,actualcartamount);
	     assertion.assertEquals(actualitemqty,expecteditemqty);
	     assertion.assertEquals(cartproductname,productnameoutsidecart);
	     
	    
	     assertion.assertAll();
		
	}

}
