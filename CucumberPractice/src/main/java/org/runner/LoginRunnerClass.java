package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features="FeatureFiles/DataDrivenWithExampleKeyword.feature"
//,glue="stepDefinition"
//,monochrome=true
//,plugin = {"html:report/htmlreports.html", "json:report/jsonreport.json", "junit:report/xmlreport.xml"}
//)

@CucumberOptions(features="FeatureFiles/background.feature"
,glue={"stepDefinition","org.backgroud"}
,monochrome=true
,plugin = {"html:report/htmlreports.html", "json:report/jsonreport.json", "junit:report/xmlreport.xml"}
)

public class LoginRunnerClass {
	
	

}
