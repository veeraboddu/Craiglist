package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		
		features="C:\\Gene_Regulatary_Backup\\Java GPRSTest\\workspace\\Craiglist\\src\\main\\java\\feature\\craiglistUITaskOne.feature",
		glue={"stepDefination"},
		
		monochrome=true,
		format= {"pretty","html:test-output"},
		dryRun = false, 
		strict = true 
		)
 
public class CraiglistUITestRunnerOne {
 
}	

// dryRun, Features, Glue, Tags, Monochrome, format, Strict, tags
// features - path of the feature file
// glue - path of the step defination file
// format - report file in an folder structure.
//monochrome = true - generate readable format console output .. always its true
// monochrome = false - generate non readable format text on console 
// IF you want to generat json format
// format= {"pretty","html:test-output","json:json_output/cucumber.json"} - html, json, xml to generate different formats of reports.

// Data driven we have to use "Scenario Outline " for the "Examples" key word to achive the Data driven. 
// For normat scenario we have to use "Scenario" keyword
// strict - true 