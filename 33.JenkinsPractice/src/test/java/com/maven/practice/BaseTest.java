package com.maven.practice;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseTest {

	WebDriver dr;
	Properties p;
	

	@Before
	public void openBrowser() throws IOException {

		FileInputStream f = new FileInputStream("config.properties");
		p = new Properties();
		p.load(f);

		String b = p.getProperty("browser");
		if (b.equals("fireFox")) 
		{
			System.setProperty("webdriver.gecko.driver", "/Users/mdrayhanuddinsarkar/Downloads/Driver/geckodriver");
			dr = new FirefoxDriver();
			
		} else if (b.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/mdrayhanuddinsarkar/Downloads/Driver/chromedriver");
			dr = new ChromeDriver();
			
		} else if (b.equals("opera")) {
			System.setProperty("webdriver.opera.driver", "/Users/mdrayhanuddinsarkar/Downloads/Driver/operadriver");
			dr = new OperaDriver();
		}
		dr.get(p.getProperty("url"));
	}

}
