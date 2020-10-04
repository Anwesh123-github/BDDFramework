package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//@CucumberOptions(features = "C:\\Users\\anwes\\IdeaProjects\\BDDFramework\\src\\test\\Resoruces\\HomePage.feature",tags = {"@MultipleInput"})
@CucumberOptions(features = "C:\\Users\\anwes\\IdeaProjects\\BDDFramework\\src\\test\\Resoruces\\ResultPage.feature",tags = {"@Travel"},
plugin = {"html:target/cucumber-html-report",
      "json:target/cucumber-json-report.json",
       "junit:target/cucumber-xml-report.xml",
       "pretty:target/cucumber-pretty-report.txt"

} //

)
public class RunCukeTest {


}



//push code into own branch

//push code into own branch

//push into dev branch

//push into my own branch


//this is demo2


//this is the pull command demo


