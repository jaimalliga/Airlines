package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilepackage.JVMreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefenition",
snippets=SnippetType.CAMELCASE,dryRun=false, plugin= {	"html:target\\Report",
														"junit:target\\Report\\AllienceJunit.xml",
														"json:target\\Report\\Alliencejson.json"}
)
public class TestRunnerClass extends JVMreport {
	@AfterClass
	public static void sample() {
		generateJvmReport(System.getProperty("user.dir")+"\\target\\report\\Alliencejson.json");
		//C:\Users\Asus\eclipse-workspace\AirLines\target\Report\Alliencejson.json
	}
}
