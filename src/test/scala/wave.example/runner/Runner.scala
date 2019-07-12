package wave.example.runner

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("wave.example.stepdefs"),
  plugin = Array("pretty", "html:target/cucumber", "json:target/cucumber-report.json"),
  tags = Array("@Before,@RunAll,@Shutdown")
)
class Runner {

}
