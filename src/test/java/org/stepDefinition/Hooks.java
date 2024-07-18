package org.stepDefinition;

import java.io.IOException;

import org.utilities.CodeReuse;

import cucumber.api.Scenario;
import cucumber.api.java.*;

public class Hooks extends CodeReuse{
	
	
	@Before
	public void startBrowser() {
		
		launchBrowser();
		url("https://www.facebook.com");
		
	}
	
	
	@After
	public void screenShot(Scenario s) throws IOException {
		String name = s.getName();
		String sName = name.replaceAll(" ", "_");
		
		takeSnap(sName);
		
	}
	

}
