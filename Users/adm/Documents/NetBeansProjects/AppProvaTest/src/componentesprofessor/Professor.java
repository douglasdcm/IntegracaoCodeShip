/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentesprofessor;

import classes.Objetos;
import classes.Verificar;
import componentes.Usuario;
import static junit.framework.Assert.fail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author TestRock!
 */
public class Professor {
    public static void logar (WebDriver driver, String email, String senha) {
        try {
            Verificar.check(driver, "className", "logo", 0);
            Objetos.AppProvaProfessor.TelaInicial.boxMail(driver).sendKeys(email);
            Objetos.AppProvaProfessor.TelaInicial.boxSenha(driver).sendKeys(senha);
            Objetos.AppProvaProfessor.TelaInicial.buttonEntrar(driver).click();
                                    
            Verificar.check(driver, "className", "breadcrumb", 0).getText().contains("Início");

        } catch(Exception ex){
            System.out.println(ex.getStackTrace());
            //fail(ex.getMessage());
            fail();
        }
    }
}
