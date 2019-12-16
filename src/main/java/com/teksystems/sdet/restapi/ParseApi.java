package com.teksystems.sdet.restapi;

import java.util.List;

import io.restassured.response.Response;

public class ParseApi extends BaseApi{
	
	public static Response response = null;
	
	String capitalName = "";
	
	public ParseApi(){
		response =  getAll_ApiInfo("/rest/v2/all");
	}
	
	public String capitalFrom_CountryName(String countryName){
		
		List<String> cName = response.path("name");
		List<String> capital = response.path("capital");
	
		if(cName.size() == capital.size()){
			for(int i=0; i<cName.size(); i++){
				if(cName.get(i).equalsIgnoreCase(countryName)){
					capitalName = capital.get(i);
					System.out.println("The capital of country_name "+ "\"" + countryName+ "\"" + " is: " +capital.get(i));
					break;
				}
				else{
					capitalName = "Country name is invalid. Please provide a valid country name.";
				}
			}
		}
		return capitalName;		
	}


	public String capitalFrom_CountryCode(String countryCode){
		
		List<String> capital = response.path("capital");
		List<String> cCode = null;
		
		if(countryCode.length()==2){
			cCode = response.path("alpha2Code");
		}
		
		else if(countryCode.length()==3){
			cCode =response.path("alpha3Code");
		}
		
		else{
			return "Country code is invalid. Please provide a valid country code.";
		}
				
		if(cCode.size() == capital.size()){
			for(int i=0; i<cCode.size(); i++){
				if(cCode.get(i).equalsIgnoreCase(countryCode)){
					System.out.println("The capital for country_code "+ "\"" + countryCode+ "\"" + " is: " +capital.get(i));
					capitalName = "The capital is: " +capital.get(i);
					capitalName = capital.get(i);
					break;
				}
				else{
					capitalName = "Country code is invalid. Please provide a valid country code.";
				}
			}		
		}
		return capitalName;		
	}

}
