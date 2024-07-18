package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {

	
	public static void generateJvmReport(String jsonFilePath) {
		
		File loc = new File(System.getProperty("user.dir")+"\\target\\Reports\\JVM");
		
		Configuration con = new Configuration(loc, "Facebook Project");
		con.addClassifications("Browser Name ","Chrome");
		con.addClassifications("Browser Version ","90");
		con.addClassifications("Sprint","5");
		con.addClassifications("Operating System","Windows 11");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonFilePath);
		
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		
		
		
	}
}
