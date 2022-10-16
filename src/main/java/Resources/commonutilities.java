package Resources;

import org.testng.asserts.SoftAssert;

public class commonutilities {
	public static void HandleAssertions(String actual,String expected, String actual1, String expected1, String actual2, String expected2,String actual3, String expected3,String actual4, String expected4,String actual5, String expected5,String actual6, String expected6,String actual7, String expected7,String actual8, String expected8,String actual9, String expected9) {
		
		//Asserts for 
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(actual, expected);
		assertion.assertEquals(actual1, expected1);
		assertion.assertEquals(actual2, expected2);
		assertion.assertEquals(actual3, expected3);
		assertion.assertEquals(actual4, expected4);
		assertion.assertEquals(actual5, expected5);
		assertion.assertEquals(actual6, expected6);
		assertion.assertEquals(actual7, expected7);
		assertion.assertEquals(actual8, expected8);
		assertion.assertEquals(actual9, expected9);
		assertion.assertAll();
	}
}	
	
