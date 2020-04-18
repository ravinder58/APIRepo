package org.testing.TestScripts;

import org.testing.Utilities.JSONtoxml;

public class TestClaas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String responsemessage ="[\r\n"+
				 "{\r\n"+
				"\"friends\": [{\r\n" 
				 + 
				"      \"firstname\": \"manoj\",\r\n" + 
				"      \"lastname\": \"mittal\",\r\n" + 
				"      \"id\": \"manoj\",\r\n" + 
				"      \"age\": 12\r\n" + 
				
				"}]\r\n"+
				"}\r\n" +
				" ]";
		
		String xmlData=JSONtoxml.jsontoXMLCOnversionn(responsemessage);
		
		System.out.println(xmlData);
		
		
	}

}
