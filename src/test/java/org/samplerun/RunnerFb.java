package org.samplerun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\User\\eclipse-workspace\\SampleCumProject\\src\\"
		+ "test\\resources\\FeatureFile\\FB_Login.feature",glue="org.stepdefinition")

  public class RunnerFb {

}
