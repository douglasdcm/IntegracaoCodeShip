/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentesprofessor;

import classes.Objetos;
import classes.Verificar;
import static junit.framework.Assert.fail;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class Logout {
    public static void sair (WebDriver driver) {
        try {         
            Objetos.AppProvaProfessor.Logout.linkSair(driver).click();
            Verificar.check(driver, "className", "logo", 0);
            driver.quit();
        } catch(Exception ex){
            System.out.println(ex.getStackTrace());
            //fail(ex.getMessage());
            fail();
        }
    }
}
