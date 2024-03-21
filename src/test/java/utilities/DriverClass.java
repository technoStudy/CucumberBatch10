package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverClass {
//    private static WebDriver driver;

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {
//        if (driver == null) { // If we don't have any  drivers create a new driver for us. But if we already have a driver don't create a new one give us the old one
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//        }

        if (threadBrowserName.get()==null){
            threadBrowserName.set("chrome");
        }

        if (threadDriver.get() == null) {
            switch (threadBrowserName.get()) {
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    if (!runningOnIntelliJ()){ // If the test is not being run by intelliJ run it with the size below
                        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    }
                    threadDriver.set(new ChromeDriver(options));
                    break;
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;
            }
        }

        threadDriver.get().manage().window().maximize();


//        return driver;
        return threadDriver.get();
    }

    public static void quitDriver() {

//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            threadDriver.set(null);
        }
    }

    public static boolean runningOnIntelliJ(){ // checks if the test is being run by intellij
        String classpath = System.getProperty("java.class.path");
        return classpath.contains("idea_rt.jar");
    }
}
