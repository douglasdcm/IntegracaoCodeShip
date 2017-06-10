/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author TestRock!
 */
public class Estatica {
    public static class App_Prova {
        
      public static class TelaInicial {
        public static WebElement textJaEstaEmUso(WebDriver driver){
          WebElement element = driver.findElement(By.className("help-inline"));
          return element;
        }
      }
    }    
}
