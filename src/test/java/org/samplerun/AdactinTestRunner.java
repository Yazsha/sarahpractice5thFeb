package org.samplerun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile",
glue="org.stepdefinition",dryRun=true)
public class AdactinTestRunner {

	
		
	}


