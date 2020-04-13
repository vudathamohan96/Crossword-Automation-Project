package runner;

import org.junit.runner.RunWith;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\Crossword-Cucumber\\features",
tags= {"@login"},
glue= {"stepDefination"},
plugin= {"html:target/cucumber-html.report"})

public class TestRunner {
	private TestNGCucumberRunner testRunner;



	@BeforeClass
	public void setUP()
	{
		testRunner = new TestNGCucumberRunner(TestRunner.class);			
	}

	@Test(description="login",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}

	@AfterClass
	public void tearDown() throws InterruptedException
	{		
		testRunner.finish();
		
		}

	}


