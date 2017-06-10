/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package casosteste;

import classes.StartChrome;
import classes.StartFireFox;
import componentesprofessor.Atividade;
import componentesprofessor.Logout;
import componentesprofessor.Professor;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class CasoTesteProfessor {

    public static void run() {

        int r = (int) (Math.random() * 1000);
        String nome = "teste"+r;
        String[][]tema = {{"Arte","Arte geral"}};
        String disciplina = tema[0][0];
        String conteudo = tema[0][1];         
                
        WebDriver driver = StartFireFox.
                myDriver("http://professor.mobile.stg.appprova.com.br/teachers/sign_in");
        
        Professor.logar(driver, "qa@appprova.com.br", "loveqaatappprova");
        Atividade.acessar(driver);
        Atividade.cadastrar(driver, nome, disciplina, conteudo);
        Atividade.buscar(driver, nome);
        Logout.sair(driver);
    }    
}

