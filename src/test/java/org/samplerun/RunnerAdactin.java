package org.samplerun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\User\\eclipse-workspace\\SampleCumProject\\src\\test\\resources\\"
		+ "FeatureFile\\AdactinHotelReservation.feature",glue="org.stepAdactin")

public class RunnerAdactin {

}
