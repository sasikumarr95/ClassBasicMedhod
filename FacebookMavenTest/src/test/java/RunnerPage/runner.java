package RunnerPage;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
tags="@homepage",format={"pretty","html:report"},
features="E:\\workspace\\FacebookMavenTest\\src\\test\\resources\\resource\\Home.feature",
glue={"TestCases"})
public class runner {

	@AfterClass
	public static void teardown() {

	}
}


