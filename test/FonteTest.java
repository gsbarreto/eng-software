/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controllers.AlertaException;
import Controllers.ArmazenamentoController;
import Controllers.FonteController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel
 */
public class FonteTest {
    
    public FonteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    //-------------------------------------------------
    //Teste certo
    @Test
    public void test1(){
        try{
            FonteController fonte = new FonteController();
            //modelo,marca,potencia,certificado
            assertTrue(fonte.inserir("CX750",
                        "Corsair",
                        "750",
                        "80 Plus Bronze"));
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo modelo não pode exceder 255 caracteres.");
        }
    }
    //TESTES VAZIOS
    //Campo modelo
    @Test
    public void test2(){
        try{
            FonteController fonte = new FonteController();
            //modelo,marca,potencia,certificado
            assertTrue(fonte.inserir("",
                        "Corsair",
                        "750",
                        "80 Plus Bronze"));
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo modelo não pode estar vázio.");
        }
    }
    //Campo marca
    @Test
    public void test3(){
        try{
            FonteController fonte = new FonteController();
            //modelo,marca,potencia,certificado
            assertTrue(fonte.inserir("CX750",
                        "",
                        "750",
                        "80 Plus Bronze"));
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo marca não pode estar vázio.");
        }
    }
    //Campo potencia
    @Test
    public void test4(){
        try{
            FonteController fonte = new FonteController();
            //modelo,marca,potencia,certificado
            assertTrue(fonte.inserir("CX750",
                        "Corsair",
                        "",
                        "80 Plus Bronze"));
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo potencia não pode estar vázio.");
        }
    }
    //Campo certificado
    @Test
    public void test5(){
        try{
            FonteController fonte = new FonteController();
            //modelo,marca,potencia,certificado
            assertTrue(fonte.inserir("CX750",
                        "Corsair",
                        "750",
                        ""));
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo certificado não pode estar vázio.");
        }
    }
    //ESTOURO CARACTERES
    //Campo modelo
    @Test
    public void test6(){
        try{
            FonteController fonte = new FonteController();
            //modelo,marca,potencia,certificado
            assertTrue(fonte.inserir("Lorem ipsum aliquet mattis fringilla sed pellentesque, nibh nisl luctus porta integer, auctor viverra consectetur aenean commodo. justo mattis tincidunt sagittis ultricies, nec sagittis tempor sagittis tempor sagittis tempor sagittis tempor sagittis tempor. ",
                        "Corsair",
                        "750",
                        "80 Plus Bronze"));
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo modelo não pode exceder 255 caracteres.");
        }
    }
    //Campo marca
    @Test
    public void test7(){
        try{
            FonteController fonte = new FonteController();
            //modelo,marca,potencia,certificado
            assertTrue(fonte.inserir("CX750",
                        "Lorem ipsum aliquet mattis fringilla sed pellentesque, nibh nisl luctus porta integer, auctor viverra consectetur aenean commodo. justo mattis tincidunt sagittis ultricies, nec sagittis tempor sagittis tempor sagittis tempor sagittis tempor sagittis tempor. ",
                        "750",
                        "80 Plus Bronze"));
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo marca não pode exceder 255 caracteres.");
        }
    }
    //Campo certificado
    @Test
    public void test8(){
        try{
            FonteController fonte = new FonteController();
            //modelo,marca,potencia,certificado
            assertTrue(fonte.inserir("CX750",
                        "Corsair",
                        "750",
                        "Lorem ipsum aliquet mattis fringilla sed pellentesque, nibh nisl luctus porta integer, auctor viverra consectetur aenean commodo. justo mattis tincidunt sagittis ultricies, nec sagittis tempor sagittis tempor sagittis tempor sagittis tempor sagittis tempor. "));
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo certificado não pode exceder 255 caracteres.");
        }
    }
    //TESTE DE CONTENÇÃO DE NUMEROS
    //campo potencia
    @Test
    public void test9(){
        try{
            FonteController fonte = new FonteController();
            //modelo,marca,potencia,certificado
            assertTrue(fonte.inserir("CX750",
                        "Corsair",
                        "asda21351",
                        "80 Plus Bronze"));
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo potencia não pode conter letras.");
        }
    }
}
