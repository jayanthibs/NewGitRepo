package saucelabpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceLabTestcase {
	
	public WebDriver driver=null;
	
/*	public static final String USERNAME="oauth-jayanthibs-f3b81";
	public static final String ACCESS_KEY="d7f73514-4977-46a3-8c3c-c30f3b8b0447";
	public static final String URL="https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.saucelabs.com:443/wd/hub";
	
	@BeforeClass
	@Parameters({"browsername","version","platform"})
	public void setup(String bn,String v,String p) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName",bn);
		cap.setCapability("version",v);
		cap.setCapability("platform",p);
		driver = new RemoteWebDriver(new URL(URL),cap); 
	}
	
	@Test
	public void verifySearch() {
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
		
	*/
	
		
	@BeforeClass
	@Parameters({"browsername","version","platform"})
	public void setup(String bn,String v,String p) throws MalformedURLException {
		
	
		Map<String, Object> sauceOptions = new HashMap<>();
		//sauceOptions.put("username", System.getenv("SAUCE_USERNAME"));
		//sauceOptions.put("accessKey", System.getenv("SAUCE_ACCESS_KEY"));
		sauceOptions.put("username", "oauth-jayanthibs-f3b81");
		sauceOptions.put("accessKey", "d7f73514-4977-46a3-8c3c-c30f3b8b0447");
		sauceOptions.put("build", "selenium-build-X1I2M");
		sauceOptions.put("name", "VerifySearch");
		URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");

	
		if(bn.equalsIgnoreCase("chrome")) {		
		ChromeOptions options = new ChromeOptions();
		options.setPlatformName(p);
		options.setBrowserVersion(v);
		options.setCapability("sauce:options", sauceOptions);
		 driver = new RemoteWebDriver(url, options); 
		
		}else if(bn.equalsIgnoreCase("firefox")) {		
				FirefoxOptions options = new FirefoxOptions();
				options.setPlatformName(p);
				options.setBrowserVersion(v);
				options.setCapability("sauce:options", sauceOptions);
				 driver = new RemoteWebDriver(url, options);
				
				}else if(bn.equalsIgnoreCase("safari")) {		
						SafariOptions options = new SafariOptions();
						options.setPlatformName(p);
						options.setBrowserVersion(v);
						options.setCapability("sauce:options", sauceOptions);
						 driver = new RemoteWebDriver(url, options);
						}else if(bn.equalsIgnoreCase("edge")) {		
								EdgeOptions options = new EdgeOptions();
								options.setPlatformName(p);
								options.setBrowserVersion(v);
								options.setCapability("sauce:options", sauceOptions);
								 driver = new RemoteWebDriver(url, options);
								}
	}
	@Test
	public void verifySearch() {
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	



		
		

		
		 
		
		//New Code - to check single configuration
		
	/*	ChromeOptions options = new ChromeOptions();
		options.setPlatformName("Windows 10");
		options.setBrowserVersion("97");
		
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", System.getenv("SAUCE_USERNAME"));
		sauceOptions.put("accessKey", System.getenv("SAUCE_ACCESS_KEY"));
		options.setCapability("sauce:options", sauceOptions);
		
		URL url = new java.net.URL("https://ondemand.us-west-1.saucelabs.com/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, options);  */
	
	
	// old code	- to check single configuration
		
	/*	DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName","chrome");
		cap.setCapability("platform","Windows 10");
		cap.setCapability("version","latest");
		driver = new RemoteWebDriver(new URL(URL),cap); */
		
		
		
		
	
	

}
