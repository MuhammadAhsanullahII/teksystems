package com.teksystems.sdet.testUtility;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.teksystems.sdet.restapi.ParseApi;



public class TestSetup {	

	protected ParseApi  getCapital;
	protected Properties prop;
	protected PropertyFile p;
	
	@BeforeTest
	public void setup(){
		getCapital = new ParseApi();
		p = new PropertyFile();
		prop = p.readPropertiesFile();
		System.out.println("Test Start");
	}
	
	
	@AfterTest
	public void teardown(){
		
		System.out.println("Test End");
	}

}

