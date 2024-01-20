package org.example.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/test/resources/features/DataTable.feature" }, glue = "org.example.definitions")
public class CucumberRunnerTests {
}
