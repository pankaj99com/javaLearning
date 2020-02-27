package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class RestClient {
//1.GET METHOD
	public void get(String url) throws ClientProtocolException, IOException, JSONException{
		CloseableHttpClient httpclient=	HttpClients.createDefault();
		
		HttpGet httpget= new HttpGet(url);
		
		CloseableHttpResponse closeableHttpresponse=httpclient.execute(httpget);
		
		//Aa.STATUS CODE
		int StatusCode=closeableHttpresponse.getStatusLine().getStatusCode();
		System.out.println("===========*****STATUS CODE****======="+StatusCode);
		
		
		//b. JSON String
		String responseString=EntityUtils.toString(closeableHttpresponse.getEntity(),"UTF-8");
		JSONObject jsonobject=new JSONObject(responseString);
		System.out.println("=====*****JSON String*****========" +jsonobject);
		
		
		//c. All headers
		Header[] headerArray=closeableHttpresponse.getAllHeaders();
		HashMap<String,String> allHeaders=new HashMap<String,String>();
		for(Header head:headerArray){
			allHeaders.put(head.getName(), head.getValue());
			System.out.println("========*****All headers*****========" +allHeaders);
		}
	}

	
	
	
}
