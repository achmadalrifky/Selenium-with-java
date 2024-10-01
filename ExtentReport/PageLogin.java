package Extent;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class PageLogin {
    @Test
    public static void TruePassword() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\IdeaProjects\\Test321\\src\\test\\resources\\chromedriver129.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com");

        // First Page \\
        WebElement btn_MakeAppointment = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        btn_MakeAppointment.click();

        // Login Page \\
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("John Doe");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ThisIsNotAPassword");
        WebElement btn_login = driver.findElement(By.xpath("//button[@id='btn-login']"));
        btn_login.click();

        Thread.sleep(3000);

        //Screenshoot \\
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String Image = "D:/Selenium Java/Report Screenshoot/TruePassword.jpg";
        FileHandler.copy(file, new File(Image));

        driver.quit();
    }

    @Test
    public static void WrongPassword() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\IdeaProjects\\Test321\\src\\test\\resources\\chromedriver129.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com");


        // First Page \\
        WebElement btn_MakeAppointment = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        btn_MakeAppointment.click();

        // Login Page \\
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("John Doe");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ThisIsAPassword");
        WebElement btn_login = driver.findElement(By.xpath("//button[@id='btn-login']"));
        btn_login.click();

        Thread.sleep(3000);

        //Screenshoot \\
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String Image = "D:/Selenium Java/Report Screenshoot/WrongPassword.jpg";
        FileHandler.copy(file, new File(Image));

        driver.quit();
    }

    @Test
    public static void Profil_Orange() throws IOException, InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\IdeaProjects\\Test321\\src\\test\\resources\\chromedriver129.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement UserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        UserName.sendKeys("Admin");
        WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        Password.sendKeys("admin123");
        WebElement Btn_Login = driver.findElement(By.xpath("//button[@type='submit']"));
        Btn_Login.click();

        WebElement My_Info = driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
        My_Info.click();
        Thread.sleep(3000);

        //Screenshoot \\
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String Image = "D:/Selenium Java/Report Screenshoot/Profil_Orange.jpg";
        FileHandler.copy(file, new File(Image));

        Thread.sleep(1000);

        WebElement icon_drpodown = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
        icon_drpodown.click();
        WebElement Btn_Logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
        Btn_Logout.click();

        driver.quit();

    }

    @Test
    public static void Orange_WrongPass() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\IdeaProjects\\Test321\\src\\test\\resources\\chromedriver129.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement UserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        UserName.sendKeys("Admin");
        WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        Password.sendKeys("password321");
        WebElement Btn_Login = driver.findElement(By.xpath("//button[@type='submit']"));
        Btn_Login.click();
        Thread.sleep(3000);

        //Screenshoot \\
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String Image = "D:/Selenium Java/Report Screenshoot/Orange_WrongPass.jpg";
        FileHandler.copy(file, new File(Image));
        Thread.sleep(3000);

        driver.quit();
    }

}
