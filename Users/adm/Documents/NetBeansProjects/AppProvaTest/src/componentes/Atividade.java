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
public class Atividade {
    public static void Iniciar (WebDriver driver, String nomeSimulado) {
        try {
            Verificar.check(driver, "xpath",
                    ".//*[@id='question-header']/div[2]", 0).getText().
                    contains(nomeSimulado);
            Thread.sleep(7000); //tempo para avaliar a pergunta
            Objetos.App_Prova.Exercicio.checkSelecionarResposta(driver).click();
            Objetos.App_Prova.Exercicio.buttonResponderPergunta(driver).click();
            Verificar.check(driver, "id","questions-indicator", 0).getText().
                    contains("Questões respondidas");
            Objetos.App_Prova.Exercicio.buttonEntregarSimulado(driver).click();
            Verificar.check(driver, "className","main", 0).getText().
                    contains("Resultado do Simulado");
            Thread.sleep(5000);
        } catch(Exception ex){
            System.out.println(ex.getStackTrace());
            //fail(ex.getMessage());
            fail();
        }
    }
}
