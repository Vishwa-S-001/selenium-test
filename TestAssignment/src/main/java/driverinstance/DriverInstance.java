public class DriverInstance{
    
    public static WebDriver getDriverInstance(String browser){
        WebDriver driverInstance = null;
        if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Johny\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
            driverInstance.manage().deleteAllCookies();
            driverInstance.manage().window().maximize();
            return driverInstance;
        }else if(browser.equalsIgnoreCase("Chrome")){
            // handle chrome driver instantiation
        }
    }

    public static quit(){
        driverInstance.close();
        driverInstance.quit();
    }
}