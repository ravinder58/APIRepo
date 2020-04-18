package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseValidation {

	
	
	
	public static void responseStatusCodeValidation(int expectedStatusCode,Response res)
	{
		if(expectedStatusCode==res.getStatusCode())
		{
			System.out.println("Response Code matched with the Expected Status code");
			 
		}
		
		else
		{
			System.out.println("Response Code don't matches with the expected Status Code");
			
		}
	}
}
