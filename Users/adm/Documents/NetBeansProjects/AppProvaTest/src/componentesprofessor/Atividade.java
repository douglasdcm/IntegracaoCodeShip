/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentesprofessor;

import classes.DataHoje;
import classes.Objetos;
import classes.Passed;
import classes.Verificar;
import static junit.framework.Assert.fail;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class Atividade {
    public static void acessar (WebDriver driver) {
        try {
            Verificar.check(driver, "className", "home-overview__item-icon", 0);
            Objetos.AppProvaProfessor.Inicio.buttonSimuladosEscola(driver).click();                                    
            Verificar.check(driver, "className", "breadcrumb", 0).getText().contains("Simulados");
            System.out.println("componentesprofessor.Atividade.acessar passou");
        } catch(Exception ex){
            //System.out.println(ex.getMessage());
            fail(ex.getMessage());
        }
    }
    
    public static void cadastrar (WebDriver driver, String nome,
            String disciplina, String conteudo) {
        try {
            Verificar.check(driver, "className", "breadcrumb", 0).getText().contains("Simulados");
            Objetos.AppProvaProfessor.Simulados.buttonNovoSimulado(driver).click();
            Verificar.check(driver, "xpath", "html/body/main/div/nav/div/a[3]", 0).
                    getText().contains("Novo Simulado");
            Objetos.AppProvaProfessor.NovoSimulado.boxNome(driver).sendKeys(nome);
            Objetos.AppProvaProfessor.NovoSimulado.buttonProximo(driver).click();
            
            Verificar.check(driver, "xpath", "html/body/main/div/h2", 0).
                    getText().contains("Selecionar Disciplina");
            Objetos.AppProvaProfessor.NovoSimulado.
                    linkDisciplina(driver, disciplina).click();
            //Objetos.AppProvaProfessor.NovoSimulado.buttonProximo(driver).click();
            
            Verificar.check(driver, "className", "tag-selector__title", 0).
                    getText().contains("Selecionar conteúdos");
            Objetos.AppProvaProfessor.NovoSimulado.linkConteudo(driver, "Arte geral").click();
            Thread.sleep(2000);
            Objetos.AppProvaProfessor.NovoSimulado.buttonProximo(driver).click();
            
            Verificar.check(driver, "xpath", "html/body/main/div/h2", 0).
                    getText().contains("Questões");
            Objetos.AppProvaProfessor.NovoSimulado.buttonAdicionarQuestao(driver).click();
            Objetos.AppProvaProfessor.NovoSimulado.buttonProximo(driver).click();
            
            Verificar.check(driver, "xpath", "html/body/main/div/h2", 0).
                    getText().contains("Finalizar");
            Objetos.AppProvaProfessor.NovoSimulado.buttonDataInicio(driver).click();            
            
            DataHoje d = new DataHoje();
            String inicio = d.hoje(1, 0, 0);
            String termino = d.hoje(2, 0, 0);
            
            Objetos.AppProvaProfessor.NovoSimulado.buttonCalendarioInicio(driver, inicio).click();
            Objetos.AppProvaProfessor.NovoSimulado.buttonFecharQuadroInicio(driver).click();
            Thread.sleep(2000);
            
            Objetos.AppProvaProfessor.NovoSimulado.buttonDataTermino(driver).click();
            Objetos.AppProvaProfessor.NovoSimulado.buttonCalendarioTermino(driver, termino).click();
            Objetos.AppProvaProfessor.NovoSimulado.buttonFecharQuadroTermino(driver).click();
            //Objetos.AppProvaProfessor.NovoSimulado.buttonHoraQuadro(driver, "23").click();
            
            Objetos.AppProvaProfessor.NovoSimulado.buttonSalvarComoRascunho(driver).click();
            System.out.println("componentesprofessor.Atividade.cadastrar passou");
        } catch(Exception ex){
            System.out.println(ex.getStackTrace());
            //fail(ex.getMessage());
            fail();
        }
    }
    
    public static void buscar (WebDriver driver, String nome) {
        try {
            Verificar.check(driver, "className", "breadcrumb", 0).getText().contains("Simulados");
            Objetos.AppProvaProfessor.Simulados.buttonLimparFiltros(driver).click();
            Objetos.AppProvaProfessor.Simulados.boxNome(driver).sendKeys(nome);
            Objetos.AppProvaProfessor.Simulados.buttonBuscar(driver).click();
            
            Verificar.check(driver, "xpath", ".//*[@id='mocks']/tr/td/div/a[text()='"+nome+"']", 0);
            Objetos.AppProvaProfessor.Simulados.linkSimulado(driver, nome).click();
            
            Verificar.check(driver, "xpath", "html/body/main/div/div[1]/div/div[1]/table/thead/tr/td", 0)
                    .getText().contains(nome);
            Objetos.AppProvaProfessor.Simulados.buttonPublicar(driver).click();
            Objetos.AppProvaProfessor.Simulados.buttonOK(driver).click();
            Thread.sleep(2000);
            Verificar.check(driver, "xpath", ".//*[@id='toast-container']/div/ul/li[1]", 0)
                    .getText().contains("Simulado publicado com sucesso.");            

        } catch(Exception ex){
            System.out.println(ex.getStackTrace());
            //fail(ex.getMessage());
            fail();
        }
    }
}
