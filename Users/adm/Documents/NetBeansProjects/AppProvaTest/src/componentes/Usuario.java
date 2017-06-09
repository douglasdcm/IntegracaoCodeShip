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
public class Usuario {
        
    public static void cadastrar (WebDriver driver, String nome, String email, String senha) {
        try {
            Verificar.check(driver, "className", "field-login ", 0).getText().contains("Crie sua conta");
            Objetos.App_Prova.TelaInicial.linkCriarConta(driver).click();
            Thread.sleep(5000);
            Objetos.App_Prova.CriarConta.boxNome(driver).sendKeys(nome);
            Objetos.App_Prova.CriarConta.boxMail(driver).sendKeys(email);
            Objetos.App_Prova.CriarConta.boxSenha(driver).sendKeys(senha);
            Objetos.App_Prova.CriarConta.boxConfirmeSenha(driver).sendKeys(senha);
            Objetos.App_Prova.CriarConta.buttonCadastrar(driver).click();
                        
            WebElement obj = Verificar.check(driver, "linkText", "Já tenho cadastro", 0);
            if (!(obj == null)){
                Usuario.logar(driver, email, senha);
            }
            
            Verificar.check(driver, "id", "start-header", 0).getText().
                    contains("Escolha uma maneira de jogo");
            System.out.println("componentes.Usuario.Cadastrar passou");
        } catch(Exception ex){
            System.out.println(ex.getStackTrace());
            //fail(ex.getMessage());
            fail();
        }
    } 
    public static void logar (WebDriver driver, String email, String senha) {
        try {
            Verificar.check(driver, "className", "field-login ", 0).getText().contains("Crie sua conta");
            Objetos.App_Prova.TelaInicial.linkCriarConta(driver).click();
            Thread.sleep(5000);
            Objetos.App_Prova.TelaInicial.boxMail(driver).sendKeys(email);
            Objetos.App_Prova.TelaInicial.boxSenha(driver).sendKeys(senha);
            Objetos.App_Prova.TelaInicial.buttonEntrar(driver).click();
            Verificar.check(driver, "id", "start-header", 0).getText().
                    contains("Escolha uma maneira de jogo");
            System.out.println("componentes.Usuario.logar passou");
        } catch(Exception ex){
            //System.out.println(ex.getMessage());
            fail(ex.getMessage());
        }
    }  
}


