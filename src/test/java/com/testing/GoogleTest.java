//https://svn2.sliksvn.com/sejsoft_sejalbhayana

// sejal
// pass@1234
package com.testing;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.xml.bind.SchemaOutputResolver;


/**
 * Unit test for simple App.
 */
public class GoogleTest{

    @Test
    public void testGoogle(){
        System.setProperty("webdriver.gecko.driver","C:\\Tools\\August 2018\\geckodriver-v0.22.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
