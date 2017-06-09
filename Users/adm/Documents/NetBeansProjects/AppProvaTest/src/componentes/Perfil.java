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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author TestRock!
 */
public class Perfil {
    public static void Preencher (WebDriver driver, String estado, String cidade,
            String escola, String serie) {
        try {
            Verificar.check(driver, "xpath", ".//*[@id='welcome-box']/h1", 0).getText().
                    contains("Escolha a cidade da sua Escola");
            Thread.sleep(5000);
            
            //seleciona o estado
            WebElement element = Objetos.App_Prova.Simulados.listEstado(driver);
            new Select(element).selectByVisibleText(estado);
            
            //aguarda a cidade ficar selecionável
            Thread.sleep(5000);
            element = Objetos.App_Prova.Simulados.listCidade(driver);
            //WebDriverWait wait = new WebDriverWait(driver, 10);
            //wait.until(ExpectedConditions.));
                    //elementToBeSelected(element));
            
            //seleciona a cidade
            new Select(element).selectByVisibleText(cidade);
            
            Thread.sleep(3000);            
            Objetos.App_Prova.Simulados.buttonBuscarEscolas(driver).click();
            
            Thread.sleep(2000);
            Verificar.check(driver, "xpath", ".//*[@id='welcome-box']/h1", 0).getText().
                    contains("Complete seu perfil para fazer o simulado");
            Objetos.App_Prova.Simulados.buttonSalvar(driver).click();
            Thread.sleep(5000); 
            System.out.println("componentes.Perfil.preencher passou");          
        } catch(Exception ex){
            System.out.println(ex.getStackTrace());
            //fail(ex.getMessage());
            fail();
        }
    }
}
