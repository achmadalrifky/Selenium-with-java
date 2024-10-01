package Extent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


//Chapter3 integration with chapter2\\
public class SetExtentReport {

    @Test
    public static void Scenario1() throws InterruptedException, IOException{

        //Setup Extent Report \\
        ExtentReports extentReports1 = new ExtentReports();
        File file = new File("C:/Users/ahmad/IdeaProjects/demo/Result/ReportPageLogin.html");
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
        extentReports1.attachReporter(sparkReporter);
        sparkReporter.config().setTheme(Theme.DARK);

        // Location Image --> The Image is result from PageLogin \\
        String TruePassword = "D:/Selenium Java/Report Screenshoot/TruePassword.jpg";
        String WrongPassword = "D:/Selenium Java/Report Screenshoot/WrongPassword.jpg";
        String Profil_Orange = "D:/Selenium Java/Report Screenshoot/Profil_Orange.jpg";
        String Orange_WrongPass = "D:/Selenium Java/Report Screenshoot/Orange_WrongPass.jpg";

        // Setup add Screenshot on Extent Report \\
        extentReports1
                .createTest("Testing1", "True Password")
                .addScreenCaptureFromPath(TruePassword);

        extentReports1
                .createTest("Testing2", "Wrong Password")
                .fail(MediaEntityBuilder.createScreenCaptureFromPath(WrongPassword).build());

        extentReports1
                .createTest("Testing3", "Profil_Orange")
                .addScreenCaptureFromPath(Profil_Orange);

        extentReports1
                .createTest("Testing4", "Orange_WrongPassword")
                .fail(MediaEntityBuilder.createScreenCaptureFromPath(Orange_WrongPass).build());

        extentReports1.flush();
        // Show the result extent report \\
        //Desktop.getDesktop().browse(new File("ReportPageLogin.html").toURI());
    }
}
