package testrunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"src/test/resources/features/Doctor_consult_page1.feature"},
		glue = {"doctor_consult_stepdefinitions_1","apphooks" },
		plugin= {"pretty" ,
                "html:target/creport/cucumber",
                "json:target/creport/cucumber.json",
                 "junit:target/creport/cucumber.xml"}

		)
public class Doctor_consult_testrunner_1 extends AbstractTestNGCucumberTests{

}
