package org.utilepackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {
public static void generateJvmReport(String jsonPath) {
		
		File f = new File(System.getProperty("user.dir")+"\\target\\report\\JVMreport");
		
		//C:\Users\Asus\eclipse-workspace\AirLines\target\Report\\JVMReport
		Configuration con = new Configuration(f, "Allience Airlines");
		con.addClassifications("Browser", "chrome");
		con.addClassifications("Browser version", "97");
		con.addClassifications("platform", "windows");
		con.addClassifications("OS Version", "10");
		con.addClassifications("Sprint", "32");
		
		List<String> li= new ArrayList<String>();
		li.add(jsonPath);
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
	}

}
