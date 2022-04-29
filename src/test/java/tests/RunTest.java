package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/Login.feature",glue = "steps",dryRun = false)
public class RunTest
{

}
