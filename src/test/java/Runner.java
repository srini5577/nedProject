import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentReports;
import com.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resource"},
        //tags={"@Test1"},
        glue = {"stepdefs"},
        dryRun = false,
        //plugin = {"pretty", "html:target/cucumber-reports"},
        

       // format = {"pretty"},
        plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
       monochrome = true

//                glue = {"com.testpkg\\steps"},
//                dryRun = false,
//                //format = {"prety"},
//                plugin ={"pretty"}
//                ,monochrome = true
//                //tags={"@Test1"},



)
public class Runner {
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("src/extent-config.xml");
    }



//    @org.junit.AfterClass
//    public static void writeExtentReport() throws IOException {
//
//        // start reporters
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports");
//
//        // create ExtentReports and attach reporter(s)
//        ExtentReports extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//
//        // creates a toggle for the given test, adds all log events under it
//        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
//
//        // log(Status, details)
//        test.log(Status.INFO, "This step shows usage of log(status, details)");
//
//        // info(details)
//        test.info("This step shows usage of info(details)");
//
//        // log with snapshot
//        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
//
//        // test with snapshot
//        test.addScreenCaptureFromPath("screenshot.png");
//
//        // calling flush writes everything to the log file
//        extent.flush();
    }






