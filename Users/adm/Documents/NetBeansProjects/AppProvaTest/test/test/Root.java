/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import casosteste.*;

/**
 *
 * @author Douglas
 */
public class Root {
    
    public Root() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testeLab() {
        CasoTesteProfessor.run();
        //CasoTesteAluno.run();
    }
}
