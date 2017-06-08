/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author TestRock!
 */
public class Verificar {
    @SuppressWarnings("UnusedAssignment")
    public static WebElement check(WebDriver driver, String locator, String texto, Integer i){
        List<WebElement> elements = new ArrayList<>();
        locator = locator.toUpperCase();
        switch (locator){
            case "ID":
              elements = driver.findElements(By.id(texto));
              break;
            case "CLASSNAME":
              elements = driver.findElements(By.className(texto));
              break;
            case "XPATH":
              elements = driver.findElements(By.xpath(texto));
              break;
            case "CSS":
              elements = driver.findElements(By.cssSelector(texto));
              break;
            case "NAME":
              elements = driver.findElements(By.name(texto));
              break;
            case "LINKTEXT":
              elements = driver.findElements(By.linkText(texto));
              break;
            case "TAGNAME":
              elements = driver.findElements(By.tagName(texto));
              break;
            case "PARTIALLINKTEXT":
              elements = driver.findElements(By.partialLinkText(texto));
              break;
            default:
                System.out.println(locator + " não é um localizador válido!");
        }
        if (elements.size() > 0) {
            return elements.get(i);
        }
        else{
            return null;
        }
    }
}
