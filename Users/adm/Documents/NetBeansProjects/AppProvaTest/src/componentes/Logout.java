/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentes;

import classes.Objetos;
import classes.Passed;
import classes.Verificar;
import static junit.framework.Assert.fail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author TestRock!
 */
public class Logout {
    public static void sair (WebDriver driver) {
        try {         
            Objetos.App_Prova.Logout.linkSair(driver).click();
            Verificar.check(driver, "name", "commit", 0);
            driver.quit();
            System.out.println("componentes.Logout.sair passou");         
        } catch(Exception ex){
                System.out.println(ex.getStackTrace());
                //fail(ex.getMessage());
                fail();
        }
    }
}

