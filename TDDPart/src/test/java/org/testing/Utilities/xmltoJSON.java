package org.testing.Utilities;

import org.json.JSONObject;
import org.json.XML;

public class xmltoJSON {

	
	public static String xmltojsonObject(String xml)
	
	{
		JSONObject responsemessage=XML.toJSONObject(xml);
		return responsemessage.toString();
	}
		
}
