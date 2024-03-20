//package utils;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class BrowserFactory {
//
//    public static WebDriver createDriver() {
//        WebDriver webDriver;
//        switch (ProjectProperties.getBrowserType()) {
//            case "FIREFOX":
//                webDriver = new FirefoxDriver();
//                break;
//            case "EDGE":
//                EdgeOptions edgeOptions = new EdgeOptions();
//               // options.addArguments("--headless");
//                webDriver = new EdgeDriver(edgeOptions);
//                break;
//            default:
//                ChromeOptions chromeOptions = new ChromeOptions();
//               // options1.addArguments("--headless");
//                webDriver = new ChromeDriver(chromeOptions);
//        }
//        webDriver.manage().window().maximize();
//        return webDriver;
//    }
//}
