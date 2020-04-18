package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC5 {

	@Test
	public void testcase5() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesFile("../TDDPart/Environment.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetRequest("QA_URI");
		System.out.println("\n"+"TESTCASE 5 FOR GETTING ALL DATA");
		ResponseValidation.responseStatusCodeValidation(200, res);
		System.out.println("**** STATUS CODE ****"+"\n"+res.getStatusCode());
		System.out.println("Status Code is "+res.getStatusCode());
		System.out.println("****DATA IS****");
		System.out.println(res.asString());
		
		
		
	}
}
