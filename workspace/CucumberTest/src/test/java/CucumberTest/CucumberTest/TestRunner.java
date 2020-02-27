package CucumberTest.CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Pankaj.Kumar\\workspace\\CucumberTest\\src\\test\\java\\Features\\Test.Feature"
,glue={"C:\\Users\\Pankaj.Kumar\\workspace\\CucumberTest\\src\\test\\java\\CucumberTest\\CucumberTest\\Apptest.java"})
public class TestRunner {

}
