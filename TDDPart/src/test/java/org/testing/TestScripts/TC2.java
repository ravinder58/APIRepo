package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

//TC2---Get Request
//We will take id value from the TC1.

public class TC2 {
	
	@Test
	public void testcase2() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesFile("../TDDPart/Environment.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetRequest("QA_URI",TC1.idValue);
		System.out.println("\n" +"TESTCASE 2 FOR GETREQUEST");
		ResponseValidation.responseStatusCodeValidation(200,res);
		System.out.println("**** STATUS CODE ****"+"\n"+res.getStatusCode());
		System.out.println("****DATA IS****");
		System.out.println(res.asString());
		
		
		
		
	}
	
	
	
	
	
	

}
