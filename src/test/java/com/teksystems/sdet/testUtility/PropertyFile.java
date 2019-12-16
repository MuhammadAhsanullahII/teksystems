package com.teksystems.sdet.testUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	
	public void testDataSetUp(){
		Properties prop = new Properties();
			
			try {
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"/application.properties");
				prop.load(fs);
			} catch (FileNotFoundException e) {
				e.getMessage();
			} catch (IOException e) {
		
			}
			
		}
	
	public static Properties readPropertiesFile() {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(System.getProperty("user.dir")+"/application.properties");
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	      return prop;
	   }

}
