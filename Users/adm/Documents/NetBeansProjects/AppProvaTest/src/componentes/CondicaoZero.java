/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentes;

import classes.Objetos;
import classes.Verificar;
import static junit.framework.Assert.fail;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
@Deprecated
public class CondicaoZero {
    public static void Voltar (WebDriver driver) {
        try {
            Objetos.App_Prova.Inicio.linkInicio(driver).click();
        } catch(Exception ex){
            //System.out.println(ex.getMessage());
            fail(ex.getMessage());
        }
    }
}
