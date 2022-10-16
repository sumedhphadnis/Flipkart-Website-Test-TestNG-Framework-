package Resources;

import org.testng.asserts.SoftAssert;

public class commonutilities3 {
	public static void HandleAssertions3(String actualpagetitle,String expectedpagetitle,String actualmodule1text,String expectedmodule1text,String actualmodule1url,String expectedmodule1url,String actualmodule2text,String expectedmodule2text,String actualmodule2url,String expectedmodule2url,String actualmodule3text,String expectedmodule3text,String actualmodule3url, String expectedmodule3url,String actualmodule4text,String expectedmodule4text,String actualmodule4url,String expectedmodule4url,String actualmodule5text,String expectedmodule5text,String actualmodule5url,String expectedmodule5url,String actualmodule6text,String expectedmodule6text,String actualmodule6url,String expectedmodule6url,String actualmodule7text,String expectedmodule7text,String actualmodule7popupwindowtitle,String expectedmodule7popupwindowtitle ) {
	    SoftAssert assertion=new SoftAssert();
	    assertion.assertEquals(actualpagetitle,expectedpagetitle);
	    assertion.assertEquals(actualmodule1text,expectedmodule1text);
	    assertion.assertEquals(actualmodule1url,expectedmodule1url);
	    assertion.assertEquals(actualmodule2text,expectedmodule2text);
	    assertion.assertEquals(actualmodule2url,expectedmodule2url);
	    assertion.assertEquals(actualmodule3text,expectedmodule3text);
	    assertion.assertEquals(actualmodule3url, expectedmodule3url);
	    assertion.assertEquals(actualmodule4text,expectedmodule4text);
	    assertion.assertEquals(actualmodule4url,expectedmodule4url);
	    assertion.assertEquals(actualmodule5text,expectedmodule5text);
	    assertion.assertEquals(actualmodule5url,expectedmodule5url);
	    assertion.assertEquals(actualmodule6text,expectedmodule6text);
	    assertion.assertEquals(actualmodule6url,expectedmodule6url);
	    assertion.assertEquals(actualmodule7text,expectedmodule7text);
	    assertion.assertEquals(actualmodule7popupwindowtitle,expectedmodule7popupwindowtitle);
	    
	    
  assertion.assertAll();

}


}
