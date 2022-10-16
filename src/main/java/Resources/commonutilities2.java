package Resources;

import org.testng.asserts.SoftAssert;

public class commonutilities2 {
	public static void HandleAssertions2(String actual1, String expected1, String actual2,  String expected2, String actual3, String expected3, String actual4, String expected4,String actualurl1, String expectedurl1,String actualurl2, String expectedurl2,String actualurl3,String expectedurl3,String actualurl4,String expectedurl4) {
		 SoftAssert assertion=new SoftAssert();
	     assertion.assertEquals(actual1,expected1);
	     assertion.assertEquals(actual2,expected2);
	     assertion.assertEquals(actual3,expected3);
	     assertion.assertEquals(actual4,expected4);
	     assertion.assertEquals(actualurl1, expectedurl1);
	     assertion.assertEquals(actualurl2, expectedurl2);
	     assertion.assertEquals(actualurl3, expectedurl3);
	     assertion.assertEquals(actualurl4, expectedurl4);
	    
	     
	     
	     assertion.assertAll();
		
	}

}
