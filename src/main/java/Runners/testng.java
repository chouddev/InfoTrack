package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features/Wikipedia.feature", glue = {"WikiStepDef"})
public class testng extends AbstractTestNGCucumberTests {

}
