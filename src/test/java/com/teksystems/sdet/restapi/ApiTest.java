package com.teksystems.sdet.restapi;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.teksystems.sdet.testUtility.TestSetup;


public class ApiTest extends TestSetup{
	
	@Test(priority=1)
	public void capital_from_countryName(){
		
		String capital= getCapital.capitalFrom_CountryName("Albania");
		Assert.assertEquals(capital, prop.getProperty("countryName"));
	}
	
	@Test(priority=2)
	public void capital_fromTwoLetter_countryCode(){
		String capital= getCapital.capitalFrom_CountryCode("COG");
		Assert.assertEquals(capital, prop.getProperty("3LettercountryCode"));
	}
	
	@Test(priority=3)
	public void capitalFromThreeLetterCountryCode(){
		Assert.assertEquals(getCapital.capitalFrom_CountryCode("co"), prop.getProperty("2LettercountryCode"));
	}
	
	@Test(priority=4)
	public void blankCountryCode(){
		String capital= getCapital.capitalFrom_CountryCode("");
		Assert.assertEquals(capital, prop.getProperty("invalidCode"));
		System.out.println(capital);
	}
	
	@Test(priority=5)
	public void invalidCountryName(){
		String capital= getCapital.capitalFrom_CountryName("invalid");
		Assert.assertEquals(capital, prop.getProperty("invalidCountryName"));
		System.out.println(capital);
	}
	
	@Test(priority=6)
	public void capitalFromFourLetterCountryCode(){
		String capital= getCapital.capitalFrom_CountryCode("COLU");
		Assert.assertEquals(capital, prop.getProperty("invalidCode"));
		System.out.println(capital);
	}
	
	@Test(priority=7)
	public void blankCountryName(){
		String capital= getCapital.capitalFrom_CountryName("");
		Assert.assertEquals(capital, prop.getProperty("invalidCountryName"));
		System.out.println(capital);
	}

}
