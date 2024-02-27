package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = {"src/test/java/features"},
                 glue = {"steps"}            ,
                 monochrome = true,
                 publish = true,
                // tags="@smoke"   )// only smoke scenarios will be executed
                // tags="not @smoke") // to exclude a scenario from execution
                // tags="@smoke or @functional")// To run scenarios that have either of the tags
                   tags="@functional and @regression" )//To run scenarios which has both the tags
public class CucumberRunner extends BaseClass{

}
