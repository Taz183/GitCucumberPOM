package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Workspace/BDDFramework/CucumberPOM/src/main/java/com/qa/features/crm.feature", //the path of feature files
		glue={"com/qa/stepDefination"}, //the path of step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different type of reporting
		monochrome = true, //displays the console output in proper readable file
		strict = true, //it will check if any step is not defined in step definition files
		dryRun = true //to check mapping is proper between feature file and step definition file
		)

public class TestRunner {

}
