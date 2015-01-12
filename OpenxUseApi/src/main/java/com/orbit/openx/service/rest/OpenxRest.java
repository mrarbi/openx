package com.orbit.openx.service.rest;

import org.apache.commons.codec.binary.Base64;

import retrofit.RestAdapter;
import retrofit.client.Response;


public class OpenxRest {

	
	public static Response listZonesByPub(String idPub){
//		String auth ="Basic ".concat(new String(Base64.encodeBase64("demo-user:demo-password".getBytes())));
//		RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("http://api.openxsourcerestapi.com/rest").build();
		String auth ="Basic ".concat(new String(Base64.encodeBase64("admin:orbit".getBytes())));
		RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("http://localhost/openx-2.8.11/rest").build();

		OpenxRestServices service = restAdapter.create(OpenxRestServices.class);
		
		return service.listZones(auth , idPub);
	}
	
	
	public static void main(String[] args) {
		Response response  = OpenxRest.listZonesByPub("1");
		
		
//		JsonReader object = new JsonReader(response.getBody().in());
//		
		System.out.println(response);
	}
}
