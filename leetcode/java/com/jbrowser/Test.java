package com.jbrowser;

import com.machinepublishers.jbrowserdriver.JBrowserDriver;
import com.machinepublishers.jbrowserdriver.Settings;
import com.machinepublishers.jbrowserdriver.Timezone;
import com.machinepublishers.jbrowserdriver.UserAgent;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by thinkpad on 2016/10/16.
 */
public class Test {
    public static void main(String[] args) throws MalformedURLException {
//        JBrowserDriver jDriver = new JBrowserDriver(Settings.builder().userAgent(UserAgent.CHROME).build());
        DesiredCapabilities capabilities = new DesiredCapabilities("jbrowserdriver", "1", Platform.ANY);
        capabilities.merge(Settings.builder()
                .timezone(Timezone.AMERICA_NEWYORK)
                .buildCapabilities());

        WebDriver driver = new JBrowserDriver(capabilities);
        System.out.println(driver.getPageSource());

        driver.quit();
//        jDriver.get("http://example.com");
//        System.out.println(jDriver.getStatusCode());
//        System.out.println("-------\n" + jDriver.getPageSource());
//        jDriver.quit();
    }
}
