package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseDataParsingUsingJsonPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

//TC1 is the Post Request
public class TC1 {
      
	static String idValue;
	@Test
	public void testcase1() throws IOException {
		// TODO Auto-generated method stub
		Random r= new Random();   //Random Number generation for the id to be unique, every time.
		Integer i=r.nextInt();
	  // String firstname=RandomStringUtils.randomAlphabetic(8); to create the random String(firstname,lastname) 
		JSONObject data=new JSONObject();
		data.put("firstname","Raman");
		data.put("lastname","Sharma");
		data.put("id",i.toString());
		data.put("designation","SME");
		Properties pr=PropertiesFileLoad.propertiesFile("../TDDPart/Environment.Properties");
		HTTPMethods http=new HTTPMethods(pr); // upto this step QA_URI is passed to the object of Properties,i.e.pr 
		Response res=http.PostRequest("QA_URI",data.toString());
		System.out.println("TESTCASE 1 for the POSTREQUEST");
		ResponseValidation.responseStatusCodeValidation(201,res);
		System.out.println("**** STATUS CODE ****"+"\n" +res.statusCode());
		idValue= ResponseDataParsingUsingJsonPath.response_parsing(res,"id");
		System.out.println("****DATA IS ****");
		System.out.println(res.asString());
	    
	}

}
