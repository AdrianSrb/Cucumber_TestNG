package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/",
        //features = "src/test/resources/"loginDataTest.feature - merge fara 'tags'
        glue = {"StepDefinitions"},
        //tags ="@dataadriven"
        //tags ="@noformultiplication"
        //tags = "@VisitSite"
        tags = "@bearOpened"

)
public class Run extends AbstractTestNGCucumberTests{
}
