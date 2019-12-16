package com.teksystems.sdet.restapi;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BaseApi {
	
	public Response getAll_ApiInfo(String endPoint){
				
		String url = "https://restcountries.eu";
		String apiKey="";
		
		RestAssured.baseURI = url;
		return  given().get(endPoint).then().contentType(ContentType.JSON).
				statusCode(200).extract().response();
	}
	
	
	
	
	
}
