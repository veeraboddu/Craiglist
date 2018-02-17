/*
 * Author : Veera Boddu
 * Date : 2/17/2018
 */

package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		
		// Change the path as per your local setup
		features="C:\\Gene_Regulatary_Backup\\Java GPRSTest\\workspace\\Craiglist\\src\\main\\java\\feature\\craiglistUITaskOne.feature",
		glue={"stepDefination"},
		
		monochrome=true,
		format= {"pretty","html:test-output"},
		dryRun = false, 
		strict = true 
		)
 
public class CraiglistUITestRunnerOne {
 
}	

