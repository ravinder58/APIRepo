package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseDataParsingUsingJsonPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC6 {
	
	
	
	static String idValue;
	
	@Test
	public void testcase6() throws IOException {
		// TODO Auto-generated method stub
		
		
		JSONObject data=new JSONObject();
		data.put("name","Rahul");
		data.put("salary","Kabhi ginni nahe");
		data.put("age","22");
		data.put("id","RW102663");
		Properties pr=PropertiesFileLoad.propertiesFile("../TDDPart/Environment.Properties");
		HTTPMethods http=new HTTPMethods(pr); // upto this step QA_URI is passed to the object of Properties,i.e.pr 
		Response res=http.PostRequest("DUMMY_POST",data.toString());
		System.out.println("TESTCASE 6 for the POSTREQUEST in EMPLOYEE");
		ResponseValidation.responseStatusCodeValidation(201,res);
		System.out.println("**** STATUS CODE ****"+"\n" +res.statusCode());
		idValue= ResponseDataParsingUsingJsonPath.response_parsing(res,"id");
		System.out.println("Value of the id is "+ idValue);
		System.out.println("****DATA IS ****");
		System.out.println(res.asString());
	    
	}

}
