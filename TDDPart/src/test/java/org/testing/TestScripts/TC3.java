package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3 {
	
	@Test
	public void testcase3() throws IOException

	{     
		
		JSONObject data=new JSONObject();
		data.put("firstname","Raghav_updatedfname");
		data.put("lastname","Sharma");
		data.put("id",TC1.idValue);
		data.put("designation","Manager");
		Properties pr=PropertiesFileLoad.propertiesFile("../TDDPart/Environment.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.putRequest("QA_URI",TC1.idValue,data.toString());
		System.out.println("\n"+"TESTCASE 3 FOR PUTREQUEST");
		ResponseValidation.responseStatusCodeValidation(200, res);
		System.out.println("**** STATUS CODE ****"+"\n"+res.getStatusCode());
		System.out.println("****DATA IS****");
		System.out.println(res.asString());
	}

}
