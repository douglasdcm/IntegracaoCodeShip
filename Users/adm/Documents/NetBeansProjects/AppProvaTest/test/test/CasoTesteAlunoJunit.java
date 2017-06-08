/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import classes.Start;
import componentes.Atividade;
import componentes.Logout;
import componentes.Perfil;
import componentes.Simulado;
import componentes.Usuario;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Douglas
 */
public class CasoTesteAlunoJunit {
    
    public CasoTesteAlunoJunit() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void run() {
        int r = (int) (Math.random() * 100);
        String nome = "Mario da Silva";
        String email = "mario"+r+"@gmail.com";
        String senha = "teste123456";
        String simulado = "teste";
        String[][]regiao = {
            {"Minas Gerais","Belo Horizonte","Escola Santo Tomás de Aquino"},
            {"Rio de Janeiro","Rio de Janeiro","Caranda Escola"},
            {"São Paulo","Sao Paulo","Ce Infante Dom Henrique"}
        };
        int j = regiao.length;
        int i = (int)(Math.random() * j);
        String estado = regiao[i][0];
        String cidade = regiao[i][0];
        String escola = regiao[i][0];
        String serie = "EAD";

        WebDriver driver = Start.myDriver("http://mobile.stg.appprova.com.br/users/sign_in");
        
        Usuario.cadastrar(driver, nome, email, senha);
        Simulado.Iniciar(driver, simulado);
        Perfil.Preencher(driver, estado, cidade, escola, serie);
        Simulado.Iniciar(driver, simulado);
        Atividade.Iniciar(driver, simulado);
        Logout.sair(driver);
    } 
}
