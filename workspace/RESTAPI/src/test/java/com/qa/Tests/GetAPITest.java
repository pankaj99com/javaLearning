package com.qa.Tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.client.RestClient;

public class GetAPITest extends BaseClass {

	public BaseClass base;
	String url;
	String APIurl;
	String serviceurl;
	@BeforeMethod()
	public void Setup() throws ClientProtocolException, IOException, JSONException{
		base=new BaseClass();
		 serviceurl=prop.getProperty("Url");
        APIurl=prop.getProperty("serviceUrl");
        
        url=serviceurl+APIurl;
		
	}
	
	@Test()
	public void getTest() throws Exception, IOException, JSONException{
		RestClient rest=new RestClient();
		rest.get(url);
	}
}
