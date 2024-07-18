package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReports;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features =  "src//test//resources" , 
		
		glue = "org.stepDefinition" , 
		
		dryRun = false, monochrome= true, plugin= {
				"html:target\\Reports",
				"junit:target\\Reports\\face.xml",
				"json:target\\Reports\\fb.json"
		})

public class TestRunnerClass {
	
	@AfterClass
	public static void getReport() {
		JvmReports.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\fb.json");
	}
}
