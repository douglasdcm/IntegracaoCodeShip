/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author TestRock!
 */
public class Objetos {
    public static class App_Prova {
        
      public static class TelaInicial {
        public static WebElement textJaEstaEmUso(WebDriver driver){
          WebElement element = driver.findElement(By.className("help-inline"));
          return element;
        }
        public static WebElement linkJaTenhoCadastro(WebDriver driver){
          WebElement element = driver.findElement(By.linkText("Já tenho cadastro"));
          return element;
        }
        public static WebElement linkCriarConta(WebDriver driver){
          WebElement element = driver.findElement(By.xpath(".//*[@id='login']/div/div[1]/div/div/a[1]"));
          return element;
        }
        public static WebElement boxMail(WebDriver driver){
          WebElement element = App_Prova.CriarConta.boxMail(driver); //objeto já existente neste repositorio
          return element;
        }
        public static WebElement boxSenha(WebDriver driver){
          WebElement element = App_Prova.CriarConta.boxSenha(driver); //objeto já existente neste repositorio
          return element;
        }
        public static WebElement buttonEntrar(WebDriver driver){
          //WebElement element = driver.findElement(By.name("commit"));
          WebElement element = App_Prova.CriarConta.buttonCadastrar(driver); //objeto já existente neste repositorio
          return element;
        }
      }

        public static class CriarConta{
            public static WebElement boxNome(WebDriver driver){
              WebElement element = driver.findElement(By.id("user_name"));
              return element;
            }
            
            public static WebElement boxMail(WebDriver driver){
              WebElement element = driver.findElement(By.id("user_email"));
              return element;
            }
            public static WebElement boxSenha(WebDriver driver){
              WebElement element = driver.findElement(By.id("user_password"));
              return element;
            }
            public static WebElement boxConfirmeSenha(WebDriver driver){
              WebElement element = driver.findElement(By.id("user_password_confirmation"));
              return element;
            }
            public static WebElement buttonCadastrar(WebDriver driver){
              WebElement element = driver.findElement(By.name("commit"));
              return element;
            }
    
        }
        
        public static class Inicio{
            public static WebElement buttonJogar(WebDriver driver){
              WebElement element = driver.findElement(By.id("jogar_btn"));
              return element;
            }
            public static WebElement linkInicio(WebDriver driver){
              WebElement element = driver.findElement(By.linkText("Início"));
              return element;
            }
            public static WebElement buttonJogar2(WebDriver driver){
              WebElement element = driver.findElement(By.id("btn_choose_subgroup"));
              return element;
            }
            public static WebElement buttonComecar(WebDriver driver){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='modals-users-welcome']/div/div/div[3]/div/a"));
              return element;
            }
            public static WebElement buttonSimulados(WebDriver driver){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='menu']/ul/li[4]/a"));
              return element;
            }
        }

        public static class Simulados{
            public static WebElement linkSimulados(WebDriver driver){
              WebElement element = driver.findElement(By.xpath(".//*[@id='menu']/ul/li[4]/a"));
              return element;
            }
            public static WebElement headerSimulado(WebDriver driver){
              WebElement element = driver.findElement(By.className("title-simulated "));
              return element;
            }
            public static WebElement buttonIniciar(WebDriver driver){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='all_simulated-box']/div/table/tbody/tr[2]/td[5]/div/button"));
              return element;
            }
            public static WebElement listEstado(WebDriver driver){
              WebElement element = driver.findElement(By.name("estado_id"));
              //new Select(element).selectByVisibleText("Minas Gerais");
              return element;
            }
            public static WebElement listCidade(WebDriver driver){
              WebElement element = driver.findElement(By.name("cidade_id"));
              //new Select(element).selectByVisibleText("Belo Horizonte");
              return element;
            }
            public static WebElement buttonBuscarEscolas(WebDriver driver){
              WebElement element = driver.findElement(By.xpath(".//*[@id='form-lightbox']/div/button"));
              return element;
            }
            public static WebElement listEscolas(WebDriver driver){
              WebElement element = driver.findElement(By.className("select2-chosen")); //#Escola Santo Tomás de Aquino
              return element;
            }
            public static WebElement boxEscolas(WebDriver driver){
              WebElement element = driver.findElement(By.id("s2id_autogen9_search"));
              return element;
            }
            public static WebElement listSeries(WebDriver driver){
              WebElement element = driver.findElement(By.id("profile"));
              return element;
            }
            public static WebElement buttonSalvar(WebDriver driver){
              WebElement element = driver.findElement(By.name("button"));
              return element;
            }
            public static WebElement buttonComecarSimulado(WebDriver driver){
              WebElement element = driver.findElement(By.id("btn_start_mock"));
              return element;
            }  
            public static WebElement buttonComecar(WebDriver driver){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='modals-users-welcome']/div/div/div[3]/div/a"));
              return element;
            } 
        }

        public static class Exercicio{
            public static WebElement checkSelecionarResposta(WebDriver driver){
              WebElement element = driver.findElement(By.xpath(".//div[@class='alternative ']/*[@class='letter']"));
              return element;
            }
            public static WebElement buttonResponderPergunta(WebDriver driver){
              WebElement element = driver.findElement(By.id("btn-simulated-answer-question"));
              return element;
            }
            public static WebElement headerRespostaErrada(WebDriver driver){
              WebElement element = driver.findElement(By.id("result-title incorrect"));
              return element;
            }
            public static WebElement headerRespostaCorreta(WebDriver driver){
              WebElement element = driver.findElement(By.id("result-title correct"));
              return element;
            }
            public static WebElement buttonProximaPergunta(WebDriver driver){
              WebElement element = driver.findElement(By.id("next-question-btn"));
              return element;
            }
            public static WebElement buttonEntregarSimulado(WebDriver driver){
              WebElement element = driver.findElement(By.xpath(".//*[@id='btn-simulated-finished']/button"));
              return element;
            }
        }
        
        public static class Logout {
            public static WebElement linkSair(WebDriver driver){
              WebElement element = driver.findElement(By.linkText("Sair"));
              return element;
        }
    }
  }
    
    
    public static class AppProvaProfessor {
        
        public static class TelaInicial {
            public static WebElement boxMail(WebDriver driver){
              WebElement element = driver.findElement(By.id("teacher_email"));
              return element;
            }
            public static WebElement boxSenha(WebDriver driver){
              WebElement element = driver.findElement(By.id("teacher_password"));
              return element;
            }
            public static WebElement buttonEntrar(WebDriver driver){
              WebElement element = driver.findElement(By.name("commit"));
              return element;
            }
        }
        public static class Inicio {
            public static WebElement buttonSimuladosEscola(WebDriver driver){
              WebElement element = driver.findElement(By.xpath(".//*[@alt='School mocks thread']"));
              return element;
            }
        }
        public static class Simulados {
            public static WebElement buttonNovoSimulado(WebDriver driver){
              WebElement element = driver.findElement(By.xpath("html/body/main/div/div[5]/a/span"));
              return element;
            }
            public static WebElement boxNome(WebDriver driver){
              WebElement element = driver.findElement(By.id("q_name_cont"));
              return element;
            }
            public static WebElement buttonLimparFiltros(WebDriver driver){
              WebElement element = driver.findElement(By.id("q_reset"));
              return element;
            }
            public static WebElement buttonBuscar(WebDriver driver){
              WebElement element = driver.findElement(By.name("button"));
              return element;
            }
            public static WebElement linkSimulado(WebDriver driver, String nome){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='mocks']/tr/td/div/a[text()='"+nome+"']"));
              return element;
            }
            public static WebElement buttonPublicar(WebDriver driver){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='#{name}-button'][text()='Publicar']"));
              return element;
            }
            public static WebElement buttonOK(WebDriver driver){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='publish-modal']/div[2]/a[1]"));
              return element;
            }
        }
        public static class NovoSimulado {
            public static WebElement boxNome(WebDriver driver){
              WebElement element = driver.findElement(By.id("mock_name"));
              return element;
            }
            public static WebElement buttonProximo(WebDriver driver){
              //WebElement element = driver.findElement(By.id("wizard-form__submit-button"));
              WebElement element = driver.findElement(By.xpath("//*[@class='next-action']/a"));
              return element;
            }
            public static WebElement linkDisciplina(WebDriver driver, String disciplina){
                //Objeto retornando array da aplicação
                //foi necessáio tratamento especial
                List<WebElement> elements = new ArrayList<>();
                elements = driver.findElements(By.xpath(".//*[@class='subgroup-item']"));
                String t;
                WebElement element;
                for(int i = 0; i < elements.size(); i++){
                  element = elements.get(i);
                  t = element.getText();
                  if (t.equals(disciplina)){
                      return element;
                  }
                }
                return null;              
            }
            public static WebElement linkConteudo(WebDriver driver, String conteudo){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@data-tooltip='"+conteudo+"']//ancestor::li/p/label"));
              return element;
            }
            public static WebElement boxAno(WebDriver driver, String ano){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='questions-search']/div[1]/div/span/span[1]/span/ul/li/input"));
              new Select(element).selectByVisibleText(ano);
              return element;
            }
            public static WebElement boxDificuldade(WebDriver driver, String dificuldade){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='questions-search']/div[2]/div/span/span[1]/span/ul/li/input"));
              new Select(element).selectByVisibleText(dificuldade);
              return element;
            }
            public static WebElement buttonAdicionarQuestao(WebDriver driver){
              WebElement element = driver.findElement(By.xpath(".//*[@class='question-box__actions-wrapper']/a[2]"));
              return element;
            }
            public static WebElement buttonDataInicio(WebDriver driver){
              WebElement element = driver.findElement(By.id("start_time__date"));
              return element;
            }
            public static WebElement buttonHoraInicio(WebDriver driver){
              WebElement element = driver.findElement(By.id("start_time__time"));
              return element;
            }
            public static WebElement buttonDataTermino(WebDriver driver){
              WebElement element = driver.findElement(By.id("end_time__date"));
              return element;
            }
            public static WebElement buttonHoraTermino(WebDriver driver){
              WebElement element = driver.findElement(By.id("end_time__time"));
              return element;
            }            
            /**
             * 
             * @param driver
             * @param data no formato dd/mm/yyyy
             * @return 
             */
            public static WebElement buttonCalendarioInicio(WebDriver driver, String data){
              //WebElement element = driver.findElement(By.
              //        xpath(".//*[@aria-label='"+data+"']")); //.//*[@aria-label='26/05/2017']
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='start_time__date_table']/tbody/tr/td/div[@aria-label='"+data+"']"));//.//*[@id='end_time__date_table']/tbody/tr/td/div[@aria-label='28/05/2017']
              return element;
            }
            /**
             * 
             * @param driver
             * @param data no formato dd/mm/yyyy
             * @return 
             */
            public static WebElement buttonCalendarioTermino(WebDriver driver, String data){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='end_time__date_table']/tbody/tr/td/div[@aria-label='"+data+"']"));
              return element;
            }
            /**
             * 
             * @param driver
             * @param hora no formato HH
             * @return 
             */
            public static WebElement buttonHoraQuadro(WebDriver driver, String hora){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@class='clockpicker-tick'][text()='"+hora+"']")); //.//*[@class='clockpicker-tick'][text()='']
              return element;
            }
            /**
             * 
             * @param driver
             * @param minuto no formato MM
             * @return 
             */
            public static WebElement buttonMinutoQuadro(WebDriver driver, String minuto){
              WebElement element = AppProvaProfessor.NovoSimulado.buttonHoraQuadro(driver, minuto);//objeto identico para hora
              return element;
            }
            public static WebElement buttonFecharQuadroInicio(WebDriver driver){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='start_time__date_root']/div/div/div/div/div[3]/button[3]"));              
              return element;
            }
            public static WebElement buttonFecharQuadroTermino(WebDriver driver){
              WebElement element = driver.findElement(By.
                      xpath(".//*[@id='end_time__date_root']/div/div/div/div/div[3]/button[3]"));              
              return element;
            }
            public static WebElement buttonSalvarComoRascunho(WebDriver driver){
              WebElement element = driver.findElement(By.name("button"));
              return element;
            } 
            public static WebElement buttonHorarioInicio(WebDriver driver){
              WebElement element = driver.findElement(By.id("start_time__time"));
              return element;
            }
            public static WebElement buttonHorarioTermino(WebDriver driver){
              WebElement element = driver.findElement(By.id("end_time__time"));
              return element;
            }
            public static WebElement buttonMinutoInicio(WebDriver driver){
              WebElement element = driver.findElement(By.className("clockpicker-span-minutes"));
              return element;
            }
            public static WebElement buttonSetMinutoInicio(WebDriver driver){
              WebElement element = driver.findElement(By.className("clockpicker-span-minutes"));
              return element;
            }
        }
        public static class Logout {
            public static WebElement linkSair(WebDriver driver){
              WebElement element = driver.findElement(By.xpath(".//*[@id='sidebar-signout']/span"));
              return element;
            }
        }
    }
}
