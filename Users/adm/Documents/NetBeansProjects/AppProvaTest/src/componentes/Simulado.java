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

/**
 *
 * @author TestRock!
 */
public class Simulado {
    public static void Iniciar (WebDriver driver, String nomeSimulado) {
        try {  
            //se não estiver na tela de simulaos, entre            
            if (Verificar.check(driver, "className", "pull-right", 0) == null){
                Objetos.App_Prova.Simulados.linkSimulados(driver).click();
            }
            //Verificar.check(driver, "xpath", ".//*[@id='all_simulated-box']/div/table/tbody/tr[2]/td[1]/span", 0).
            //        getText().contains(nomeSimulado);
            Verificar.check(driver, "xpath", ".//*[@id='all_simulated-box']/div/table/tbody/tr[2]/td[1]/span", 0).
                    getText().matches("(.*)"+nomeSimulado+"(.*)");
            Objetos.App_Prova.Simulados.buttonIniciar(driver).click();
            
            Thread.sleep(2000);
            //se msg "Podemos começar?" aparecer, feche e continue a atividade
            WebElement obj = Verificar.check(driver, "xpath", ".//*[@id='welcome-box']/h1", 0);
            if (!(obj == null)){
                if (obj.getText().equals("Podemos começar?")){
                    Objetos.App_Prova.Simulados.buttonComecarSimulado(driver).click();
                }
            }
            
            Thread.sleep(5000);
            
            //se msg Bem-vindo ao AppProva! aparecer, feche e continue a atividade
            obj = Verificar.check(driver, "xpath", ".//*[@id='modals-users-welcome']/div/div/div[3]/div/a", 0);
            if (!(obj == null)){
                if (obj.getText().equals("Começar")){
                    Objetos.App_Prova.Simulados.buttonComecar(driver).click();
                }
            }
            Thread.sleep(5000);
            System.out.println("componentes.Simulado.Iniciar passou");          
        } catch(Exception ex){
                System.out.println(ex.getStackTrace());
                //fail(ex.getMessage());
                fail();
        }
    }
}
