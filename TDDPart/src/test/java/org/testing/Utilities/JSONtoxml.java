package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class JSONtoxml {

	
	public static String jsontoxmlconversion(String jsonData)
	{
	JSONObject j=new JSONObject(jsonData);
	return XML.toString(j);
		
	}
	
	public static String jsontoXMLCOnversionn(String jsonData)
	{
		JSONArray j= new JSONArray(jsonData);
		return XML.toString(j);                       //returning by converting the JSON to XMl.
	}
	
	
	
}
