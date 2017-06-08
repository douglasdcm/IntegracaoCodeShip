/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author TestRock!
 */
public class Start {
    public static WebDriver myDriver(String url){
        System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);                
        return driver;
    }
}
