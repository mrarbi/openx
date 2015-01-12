package com.orbit.openx.service.rest;

import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;

public interface OpenxRestServices {

	@GET("/zon/pub/{id}")
	Response listZones(@Header("Authorization") String auth, @Path("id") String idPub);
}
