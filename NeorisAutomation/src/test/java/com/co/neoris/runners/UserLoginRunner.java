package com.co.neoris.runners;

import com.co.neoris.utils.excel.BeforeSuite;
import com.co.neoris.utils.excel.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/user_login.feature",
        glue = {"com.co.neoris.stepdefinitions", "com.co.neoris.hooks"},
        snippets = SnippetType.CAMELCASE,
        tags = "@Test"

)

public class UserLoginRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/user_login.feature");
    }
}
